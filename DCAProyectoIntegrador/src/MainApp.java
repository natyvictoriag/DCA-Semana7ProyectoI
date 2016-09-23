import processing.core.PApplet;

public class MainApp extends PApplet {
	Logica log;

	public static void main(String[] args) {
		PApplet.main("MainApp");
	}

	public void settings() {
		size(1000, 800);
	}

	public void setup() {

	}

	public void draw() {
//		log.pintar();
		background(255);
	}

	public void mousePressed() {
		log.click();

	}
}
