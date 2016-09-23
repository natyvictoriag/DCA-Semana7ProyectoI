import java.awt.Image;
import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;
import java.util.List;
import java.io.File;

public class Logica {
	private Logica log;
	private int posX, posY;
	private ArrayList<Image> imagenes;
	private File file;
	private PImage[] images;
	private String[] list;
	private String folder;
	// private PImage nort;
	private PApplet app;
	// arreglo de imagenes

	public Logica(PApplet app) {
		imagenes = new ArrayList<Image>();
		file = new File("data/images");
		list = file.list();
		folder= file.getPath();
		images = new PImage[list.length];
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			
			images[i]= this.app.loadImage(folder + list[i]);
			
		}

	}

	public void pintar() {

	}

	public void click() {

	}

}
