import processing.core.PApplet;

public class MainApp extends PApplet {
	public static void main(String[] args) {
		PApplet.main("MainApp");
	}

	Logica app;

	public void settings() {
		size(1000, 800);
	}

	public void setup() {

	}

	public void draw() {
		app.pintar();
		background(255);
	}

	public void mousePressed() {
		app.click();

	}
}
