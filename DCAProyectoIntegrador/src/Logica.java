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
			imaPrinsipal[i] = app.loadImage(files[i].toString());

		}
		fondo = app.loadImage("../data/pantallas/interfaz.png");
	}

	// ======================================================================================================================

	public void pintar() {
		app.image(fondo, 0, 0);

		// carga la imagen del visualizador

		imaPrinsipal[play].resize(547 + rsize, 363 + rsize);
	}

	// ======================================================================================================================

	public void click() {

	}

}
