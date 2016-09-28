import processing.core.PApplet;
import processing.core.PImage;
import java.io.File;
import java.io.FilenameFilter;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Logica {

	private PApplet app;

	int play = 0, rsize = 0;
	private boolean aumento = true, gira = false, completa = false;
	private PImage fondo;
	private String[] clases = { ".png", ".jpg", ".bmp" };
	private PImage[] ima = new PImage[20];
	private PImage[] imaPrinsipal = new PImage[20];

	// ======================================================================================================================

	public Logica(PApplet app) {

		this.app = app;

		// file que conecta a la carpeta
		File carpeta = new File("../data/images");

		// arreglo con los tipos de archivos
		String[] clases = new String[] { "jpg", "png", "bmp" };

		// identifica las extensiones de las imagenes
		FilenameFilter filtroIma = new FilenameFilter() {

			public boolean accept(File carpeta, String nombre) {
				for (final String ext : clases) {
					if (nombre.endsWith("." + ext)) {
						return true;
					}
				}
				return false;
			}
		};

		// arreglo de tipo File que guarda donde estan las imagenes (su
		// direccion)
		File[] files = carpeta.listFiles(filtroIma);

		// Me carga las imagenes
		for (int i = 0; i < files.length; i++) {
			ima[i] = app.loadImage(files[i].toString());
		}

		fondo = app.loadImage("../data/pantallas/interfaz.png");
	}

	// ======================================================================================================================

	public void pintar() {
		app.image(fondo, 0, 0);

		// carga la imagen del visualizador
		ima[play].resize(547 + rsize, 363 + rsize);
	}

	// ======================================================================================================================

	public void click() {

		System.out.println("Pos X " + app.mouseX + " pos Y " + app.mouseY);

		// Adelante en el visualizador
		if (app.mouseX < 966 && app.mouseX > 860 && app.mouseY < 682 && app.mouseY > 621) {
			play += 1;
		} else
		// Atras en el visualizador
		if (app.mouseX < 700 && app.mouseX > 633 && app.mouseY < 680 && app.mouseY > 619) {
			// correr = 19;
			play -= 1;
		}

		if (play > 19) {
			play = 0;

		}
		if (play < 0) {
			play = 19;
		}

	}

}
