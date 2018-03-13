package instanceOf.better;

public class Spider extends Animal {
	private void crawl() {
		//...
	}
	
	@Override
	public void move() {
		System.out.println("Move like a spider...");
		this.crawl();
	}
}