import java.util.List;

import processing.core.PApplet;
import processing.core.PImage;
import qrcodegen.QrCode;
import qrcodegen.QrSegment;

public class ImageLoader extends PApplet {
	final int PAPER = color(255, 255, 255);
	final int WIDTH = 800;
	final int HEIGHT = 800;
	private PImage img = null;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("ImageLoader");
	}

	public void settings() {
		size(WIDTH, HEIGHT,PDF,"filename2.PDF" );
		noLoop();
	}
	
	public void setup() {
		String executionPath = System.getProperty("user.dir");
		executionPath = executionPath.replace("\\", "/");
		String imagePath = executionPath + "/Images/spring.jpg";
		img = loadImage(imagePath);
		surface.setResizable(true);
	}


	public void draw() {
		background(PAPER);
		// œ‘ æÕº∆¨img
		image(img, (WIDTH - img.width) /2, (HEIGHT - img.height) / 2);
		
		//QR ±‡¬Î≤‚ ‘
		// Simple operation
		QrCode qr0 = QrCode.encodeText("Hello, world!", QrCode.Ecc.MEDIUM);
		// Manual operation
		List<QrSegment> segs = QrSegment.makeSegments("3141592653589793238462643383");
		QrCode qr1 = QrCode.encodeSegments(segs, QrCode.Ecc.HIGH, 5, 5, 2, false);
		int qrleft = 100;
		int qrtop = 100;
		int qrw = 5;
		fill(color(0,0,0));
		for (int y = 0; y < qr1.size; y++) {
		    for (int x = 0; x < qr1.size; x++) {
		        if(qr1.getModule(x, y) == true)
		        {
		        	rect(qrleft + x * qrw,qrtop + y * qrw,qrw,qrw);
		        }
		        else
		        {
		        	
		        }
		    }
		}
		
		exit();
	}
}
