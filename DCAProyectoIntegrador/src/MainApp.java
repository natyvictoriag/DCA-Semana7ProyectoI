import processing.core.PApplet;

public class MainApp extends PApplet {
	
	Logica app;

	public static void main(String[] args) {
		PApplet.main("MainApp");
	}

	public void settings() {
		size(1000, 800);
	}

	public void setup() {
		app = new Logica(this);
	}

	public void draw() {
		app.pintar();
		background(255);
	}

	public void mousePressed() {
		app.click();

	}
}
