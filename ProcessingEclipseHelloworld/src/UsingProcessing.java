import processing.core.PApplet;

public class UsingProcessing extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("UsingProcessing");
	}

	public void settings() {
		size(800, 600);
	}

	public void setup() {
		fill(120, 50, 240);
	}

	public void draw() {
		ellipse(width / 2, height / 2, second() * 3, second() * 3);
	}
}
