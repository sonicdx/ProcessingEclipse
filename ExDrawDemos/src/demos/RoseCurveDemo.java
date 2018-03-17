package demos;

import processing.core.PApplet;
import controlP5.ControlP5;

public class RoseCurveDemo extends PApplet {
	private ControlP5 cp5;
	private float r;
	private int v1;
	private int n = 8;
	private int d = 4;
	private int cir_loop_count = 1;
	private int move_step = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(RoseCurveDemo.class.getName());
	}
	
	public void settings() {
		size(600, 600, P2D);
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
		  .setCaptionLabel("Points To Draw")
		  .setColorCaptionLabel(color(20, 20, 20));

		cp5
		  .addSlider("cir_loop_count")
		  .setPosition(350, 40)
		  .setSize(200, 20)
		  .setRange(1,50)
		  .setValue(1)
		  .setCaptionLabel("loop count")
		  .setColorCaptionLabel(color(20, 20, 20));		
		
		cp5
		  .addSlider("n")
		  .setPosition(40, 70)
		  .setSize(200, 20)
		  .setRange(1, 7)
		  .setColorCaptionLabel(color(20, 20, 20));		
		
		cp5
		  .addSlider("d")
		  .setPosition(40, 100)
		  .setSize(200, 20)
		  .setRange(1, 9)
		  .setColorCaptionLabel(color(20, 20, 20));			
	}

	public void draw() {
		this.background(this.color(255, 255, 255));
		translate(this.width / 2, this.height / 2);

		// Draw the minute ticks
		float all_curve_len = 360.0f  * cir_loop_count;
		this.strokeWeight(2);
		this.stroke(color(0, 0, 0));
		this.beginShape(POINTS);
		for(float rad =0.0f;rad<all_curve_len;rad+=( all_curve_len / (float)v1 ))
		{
			float rr = r * 0.8f;
			float kr = rr * sin(((float)n / (float)d) * radians(rad));
			
			float x = cos(radians(rad)) * kr;
			float y = sin(radians(rad)) * kr;
			
			this.vertex(x,y);
		}
		this.endShape();
		
		//draw move object
		this.fill(this.color(255,0,0));
		move_step = (move_step + 1) % v1;
		{
			float rad = all_curve_len / (float)v1  * move_step;
			float rr = r * 0.8f;
			float kr = rr * sin(((float)n / (float)d) * radians(rad));
			float x = cos(radians(rad)) * kr;
			float y = sin(radians(rad)) * kr;
			
			this.ellipse(x, y, 5, 5);
		}
		 
		
		this.resetMatrix();
	}

}
