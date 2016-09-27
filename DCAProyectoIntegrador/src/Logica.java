import processing.core.PApplet;
import processing.core.PImage;
import java.io.File;
import java.io.FilenameFilter;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;


public class Logica {
	
	PApplet app;
	
	private Logica log;
	private int play = 0, posX = 0, posY = 0, numIma = 4, rsize = 0,rota = 0, y = 87, var = 0;
	private boolean aumento = true, gira = false, completa =false;
	private PImage[] fondo;
	private String[] clases = {".png", ".jpg", ".bmp"};
	private String folder;
	// private PImage nort;
	// arreglo de imagenes
	
	//======================================================================================================================
	
	public Logica (PApplet app) {
		
		
		
//		imagenes = new ArrayList<Image>();
//		file = new File("data/images");
//		list = file.list();
//		folder= file.getPath();
//		images = new PImage[list.length];
//		
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//			
//			images[i]= this.app.loadImage(folder + list[i]);
//		}

	}
	
	//======================================================================================================================
	
	public void pintar() {

	}
	
	//======================================================================================================================
	
	public void click() {

	}

}
