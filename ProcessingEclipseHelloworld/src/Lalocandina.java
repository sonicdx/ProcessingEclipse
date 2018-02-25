import processing.core.PApplet;

public class Lalocandina extends PApplet {
	// Manuale di Programmazione Cinematografica
	// Daniele Olmisani, 2015
	// The Dukes of Hazzard (2005)

	final int PAPER = color(250, 0, 0);
	final int INK1 = color(255);
	final int INK2 = color(15, 0, 100);

	final int S = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("Lalocandina");
	}

	public void settings() {
		size(480, 640);
		noLoop();
	}

	public void draw() {

		background(PAPER);

		stroke(INK1);
		strokeWeight(120.0f);
		line(0, 0, width, height);
		line(width, 0, 0, height);

		stroke(INK2);
		strokeWeight(100.0f);
		line(0, 0, width, height);
		line(width, 0, 0, height);

		fill(INK1);
		noStroke();
		for (int i = 1; i < S; i++) {
			star(i * width / S, i * height / S, 0.5f);
			star((S - i) * width / S, i * height / S, 0.5f);
		}

		String executionPath = System.getProperty("user.dir");
		executionPath = executionPath.replace("\\", "/");
		//save(executionPath + "./the-dukes-of-hazzard.png");
		
		exit();
	}

	public void star(float x, float y, float size) {

		pushMatrix();
		translate(x, y);
		scale(size, size);
		beginShape();
		vertex(0, -50);
		vertex(29, 40);
		vertex(-47, -15);
		vertex(47, -15);
		vertex(-29, 40);
		endShape(CLOSE);
		popMatrix();
	}
}
