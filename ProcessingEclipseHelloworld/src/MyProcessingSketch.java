import processing.core.PApplet;

public class MyProcessingSketch extends PApplet {
	private Stripe[] stripes = new Stripe[50];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("MyProcessingSketch");
	}

	public void settings() {
		size(800, 600);
	}

	public void setup() {
		// Initialize all "stripes"
		for (int i = 0; i < stripes.length; i++) {
			stripes[i] = new Stripe(this);
		}
	}

	public void draw() {
		background(100);
		// Move and display all "stripes"
		for (int i = 0; i < stripes.length; i++) {
			stripes[i].move();
			stripes[i].display();
		}
	}
}
