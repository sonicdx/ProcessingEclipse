import processing.core.PApplet;

public class MouseDemo extends PApplet {
	public static void main(String[] args) {
		PApplet.main("MouseDemo", args);
	}

	public void settings() {
		size(800, 600);
	}

	public void setup() {
		background(102);
	}

	public void draw() {
		stroke(255);
		if (mousePressed == true) {
			line(mouseX, mouseY, pmouseX, pmouseY);
		}
	}
}
