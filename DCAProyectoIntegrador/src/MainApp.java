import processing.core.PApplet;

public class MainApp extends PApplet {
	
	Logica app;

	public static void main(String[] args) {
		PApplet.main("MainApp");
	}

	public void settings() {
		size(1000, 600);
	}

	public void setup() {
		app = new Logica(this);
	}

	public void draw() {
		background(255);
		app.pintar();
		
	}

	public void mousePressed() {
		app.click();

	}
}
