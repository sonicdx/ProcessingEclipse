import processing.core.PApplet;

public class StarWarsTheForceAwakens extends PApplet {
	// Star Wars The Force awakens

	final int PAPER = color(220, 210, 170);
	final int INK1 = color(255);
	final int INK2 = color(0);
	final int INK3 = color(210, 135, 10);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("StarWarsTheForceAwakens");
	}

	public void settings() {
		 size(480, 640);
		 noLoop();
	}

	public void setup() {

	}

	public void draw() {
		  translate(width/2.0f, height/2.0f);
		  scale(min(width, height) / 240.0f );
		  
		  background(PAPER);
		  
		  fill(INK1);
		  stroke(INK3);
		  
		  strokeWeight(3.0f);
		  
		  //body
		  ellipse(0, 0, 130, 130);
		  
		  arc(0, -72, 80, 80, -PI, 0);
		  arc(0, -72, 80, 23, 0, PI);
		  
		  fill(INK2);
		  ellipse(0, -92, 15, 15);
		  ellipse(18, -80, 8, 8);
		  
		  noStroke();
		  
		  fill(INK3);
		  ellipse(-13, 6, 60, 60);
		  
		  fill(INK1);
		  ellipse(-13, 6, 42, 42);
		  
	      String executionPath = System.getProperty("user.dir");
	      executionPath =executionPath.replace("\\", "/");
		  save(executionPath + "./star-wars-the-force-awakens.png");
	}

}
