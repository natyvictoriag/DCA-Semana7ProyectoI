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
	private int play = 0, posX = 0, posY = 0, numIma = 4, rsize = 0, rota = 0, y = 87, var = 0;
	private boolean aumento = true, gira = false, completa = false;
	private PImage[] fondo;
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

	}

	// ======================================================================================================================

	public void pintar() {

	}

	// ======================================================================================================================

	public void click() {

	}

}
