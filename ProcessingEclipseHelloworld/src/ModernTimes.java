import processing.core.PApplet;

public class ModernTimes extends PApplet {
	// Manuale di Programmazione Cinematografica
	// Daniele Olmisani, 2015

	// Modern Times

	final int PAPER = color(240);
	final int INK = color(45, 60, 40);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("ModernTimes");
	}

	public void settings() {
		size(480, 640);
		noLoop();
	}

	public void draw() {

		translate(width / 2.0f, height / 3.0f);

		background(PAPER);

		drawGear(0, 0, 75, 20, 0);
		drawGear(99, 98, 50, 20, 2);
		drawGear(21, 178, 50, 20, 0);
		drawGear(70, 262, 35, 20, 0);

		String executionPath = System.getProperty("user.dir");
		executionPath = executionPath.replace("\\", "/");
		save(executionPath + "./modern-times.png");
	}

	public void drawGear(float x, float y, float r, float s, float a) {

		pushMatrix();
		fill(INK);
		noStroke();

		translate(x, y);
		rotate(a);

		rectMode(CENTER);
		ellipseMode(CENTER);

		int n = (int) ((r * PI) / s);

		for (int i = 0; i < n; i++) {
			rect(r, 0, s, s);
			rotate(TWO_PI / n);
		}
		ellipse(0, 0, 2 * r, 2 * r);

		fill(PAPER);
		ellipse(0, 0, 5, 5);
		popMatrix();
	}
}
