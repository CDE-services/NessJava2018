package minesweeper.core;

import java.util.Formatter;
import java.util.Random;
//import minesweeper.core.Tile.State;

/**
 * Field represents playing field and game logic.
 */
public class Field {
    /**
     * Playing field tiles.
     */
    private final Tile[][] tiles;

    /**
     * Field row count. Rows are indexed from 0 to (rowCount - 1).
     */
    private final int rowCount;

    /**
     * Column count. Columns are indexed from 0 to (columnCount - 1).
     */
    private final int columnCount;

    /**
     * Mine count.
     */
    private final int mineCount;

    /**
     * Game state.
     */
    private GameState state = GameState.PLAYING;
    
    private long startingTime;

    /**
     * Constructor.
     *
     * @param rowCount    row count
     * @param columnCount column count
     * @param mineCount   mine count
     */
    public Field(int rowCount, int columnCount, int mineCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.mineCount = mineCount;
        tiles = new Tile[rowCount][columnCount];

        //generate the field content
        generate();
        
        startingTime = System.currentTimeMillis();
    }

    /**
     * Opens tile at specified indeces.
     *
     * @param row    row number
     * @param column column number
     */
    public void openTile(int row, int column) {
        Tile tile = tiles[row][column];
        if (tile.getState() == Tile.State.CLOSED) {
            tile.setState(Tile.State.OPEN);
            
            if(tile instanceof Clue
    			&& ((Clue)tile).getValue() == 0) {
            	openAdjacentTiles(row, column);
            }
            
            if (tile instanceof Mine) {
                state = GameState.FAILED;
                return;
            }

            if (isSolved()) {
                state = GameState.SOLVED;
                return;
            }
        }
    }

    /**
     * Marks tile at specified indeces.
     *
     * @param row    row number
     * @param column column number
     */
    public void markTile(int row, int column) {
    	Tile t = tiles[row][column];
        if(t.getState() == Tile.State.MARKED) {
        	t.setState(Tile.State.CLOSED);
        } else if (t.getState() == Tile.State.CLOSED) {
        	t.setState(Tile.State.MARKED);
        }
    }

    /**
     * Generates playing field.
     */
    private void generate() {
        Random rand = new Random();
        int row, col, i = 0;
        do {
        	row = rand.nextInt(rowCount);
        	col = rand.nextInt(columnCount);
        	if(tiles[row][col] == null) {
        		tiles[row][col] = new Mine();
        		i++;
        	}
        } while(i < mineCount);
        
        for (int r = 0; r < rowCount; r++) {
			for (int c = 0; c < columnCount; c++) {
				if(tiles[r][c] == null) {
					tiles[r][c] = new Clue(countAdjacentMines(r, c));
				}
			}
		}
    }

    /**
     * Returns true if game is solved, false otherwise.
     *
     * @return true if game is solved, false otherwise
     */
    private boolean isSolved() {
        return rowCount * columnCount 
        		- numberOf(Tile.State.OPEN) == mineCount;
    }
    
    private int numberOf(Tile.State state) {
    	int count = 0;
    	for (int r = 0; r < rowCount; r++) {
			for (int c = 0; c < columnCount; c++) {
				if(tiles[r][c].getState() == state) {
					count++;
				}
			}
		}
    	return count;
    }

    /**
     * Returns number of adjacent mines for a tile at specified position in the field.
     *
     * @param row    row number.
     * @param column column number.
     * @return number of adjacent mines.
     */
    private int countAdjacentMines(int row, int column) {
        int count = 0;
        for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
            int actRow = row + rowOffset;
            if (actRow >= 0 && actRow < rowCount) {
                for (int columnOffset = -1; columnOffset <= 1; columnOffset++) {
                    int actColumn = column + columnOffset;
                    if (actColumn >= 0 && actColumn < columnCount) {
                        if (tiles[actRow][actColumn] instanceof Mine) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }
    
    private int openAdjacentTiles(int row, int column) {
        int count = 0;
        for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
            int actRow = row + rowOffset;
            if (actRow >= 0 && actRow < rowCount) {
                for (int columnOffset = -1; columnOffset <= 1; columnOffset++) {
                    int actColumn = column + columnOffset;
                    if (actColumn >= 0 && actColumn < columnCount) {
                        openTile(actRow, actColumn);
                    }
                }
            }
        }

        return count;
    }

	public GameState getState() {
		return state;
	}

	public void setState(GameState state) {
		this.state = state;
	}

	public int getRowCount() {
		return rowCount;
	}

	public int getColumnCount() {
		return columnCount;
	}

	public int getMineCount() {
		return mineCount;
	}
	
	public int getPlayingSeconds() {
		return (int) ((System.currentTimeMillis() - startingTime)/1000);
	}
	
	@Override
	public String toString() {
		Formatter f = new Formatter();
		
		for (int r = 0; r < rowCount; r++) {
			for (int c = 0; c < columnCount; c++) {
				f.format("%3s", tiles[r][c]);
			}
			f.format("%n");
		}
		
		return f.toString();
	}
}
