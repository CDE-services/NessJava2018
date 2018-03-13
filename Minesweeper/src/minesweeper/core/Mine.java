package minesweeper.core;

/**
 * Mine tile.
 */
public class Mine extends Tile {
	@Override
	public String toString() {
		return this.getState() == Tile.State.OPEN ?
				"*" : super.toString();
//		if(this.getState() == Tile.State.OPEN) {
//			return "*";
//		} else {
//			return super.toString();
//		}
	}
}
