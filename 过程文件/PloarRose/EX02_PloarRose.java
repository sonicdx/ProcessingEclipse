import controlP5.ControlP5;
import processing.core.PApplet;

public class EX02_PloarRose extends PApplet {
	ControlP5 cp5;
	float r;
	int v1;
	int k = 7;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(EX02_PloarRose.class.getName());
	}

	public void settings() {
		size(600, 600);
	}

	public void setup() {
		fill(192, 50, 20);
		this.smooth();
		r = min(width,height) /2;
 		cp5 = new ControlP5(this);
		cp5
		  .addSlider("v1")
		  .setPosition(40, 40)
		  .setSize(200, 20)
		  .setRange(10, 5000)
		  .setValue(500)
		  .setColorCaptionLabel(color(20, 20, 20));
		
		cp5
		  .addSlider("k")
		  .setPosition(40, 70)
		  .setSize(200, 20)
		  .setRange(1, 200)
		  .setValue(7)
		  .setColorCaptionLabel(color(20, 20, 20));		
	}

	public void draw() {
		this.background(this.color(255, 255, 255));
		translate(this.width / 2, this.height / 2);

		// Draw the minute ticks
		this.strokeWeight(2);
		this.stroke(color(0, 0, 0));
		this.beginShape(POINTS);
		for(float rad =0.0f;rad<360.0f;rad+=(360.0f / (float)v1 ))
		{
			float rr = r * 0.8f;
			float kr = rr * sin(k * this.radians(rad));
			//float x = cos(this.radians(rad)) * r * 0.8f;
			//float y = sin(this.radians(rad)) * r * 0.8f;
			
			float x = cos(this.radians(rad)) * kr;
			float y = sin(this.radians(rad)) * kr;
			
			this.vertex(x,y);
		}
		this.endShape();

		this.resetMatrix();
	}

}
