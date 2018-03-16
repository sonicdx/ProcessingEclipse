import processing.core.PApplet;

public class EX01_Clock extends PApplet {

	float secondsRadius;
	float minutesRadius;
	float hoursRadius;
	float clockDiameter;
	float pointRadius;
    float old_s = 0.0f;
    int lastSecond = -1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(EX01_Clock.class.getName());
	}

	public void settings() {
		size(600, 600);
		
		float radius = min(width, height) / 2;
		secondsRadius = radius * 0.72f;
		pointRadius = radius * 0.82f;
		minutesRadius = radius * 0.60f;
		hoursRadius = radius * 0.50f;
		clockDiameter = radius * 1.8f;
	}

	public void setup() {
		fill(192,50,20);
		this.smooth();
	}

	public void draw() {
		this.background(this.color(255,255,255));
		translate(this.width/2, this.height/2);

		// Draw the clock background
		fill(80);
		noStroke();
		ellipse(0, 0, clockDiameter, clockDiameter);
		  
		// Angles for sin() and cos() start at 3 o'clock;
		// subtract HALF_PI to make them start at the top
		float s = map(second(), 0, 60, 0, TWO_PI) - HALF_PI;
		float m = map(minute() + norm(second(), 0, 60), 0, 60, 0, TWO_PI) - HALF_PI; 
		float h = map(hour() + norm(minute(), 0, 60), 0, 24, 0, TWO_PI * 2) - HALF_PI;
		  
		
		// Draw the hands of the clock
		stroke(255);
		strokeWeight(1);
		float target_s = s;
		if(old_s > target_s)
		{
			target_s += this.TWO_PI;
		}
		old_s += (target_s - old_s) * 0.1f;
		if(old_s > this.TWO_PI)
		{
			old_s -= this.TWO_PI;
		}
		line(0, 0, cos(old_s) * secondsRadius, sin(old_s) * secondsRadius);
	
		strokeWeight(2);
		line(0, 0,cos(m) * minutesRadius, sin(m) * minutesRadius);
		strokeWeight(4);
		line(0, 0,cos(h) * hoursRadius, sin(h) * hoursRadius);
		  
		// Draw the minute ticks
		strokeWeight(2);
		stroke(color(0,255,0));
		beginShape(POINTS);
		for (int a = 0; a < 360; a+=6) {
		    float angle = radians(a);
		    float x = cos(angle) * pointRadius;
		    float y = sin(angle) * pointRadius;
		    vertex(x, y);
		}
		endShape();
		
		fill(0);
		translate(-this.width/2, -this.height/2);
		this.text("Clock V1 Demo", 0, 15);
	}

}
