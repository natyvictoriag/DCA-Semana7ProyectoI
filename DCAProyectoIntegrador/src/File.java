import processing.core.PApplet;
import processing.core.PImage;

public class File {
	private PImage[] paisaje = new PImage[20];
	public File(PApplet app){
		//arreglo de imagenes
		paisaje[0]= app.loadImage("../data/images/nort.jpg");
		paisaje[1]= app.loadImage("../data/images/amazonas.jpg");
		paisaje[2]= app.loadImage("../data/images/animales.jpg");
		paisaje[3]= app.loadImage("../data/images/berlin.jpg");
		paisaje[4]= app.loadImage("../data/images/bora.jpg");
		paisaje[5]= app.loadImage("../data/images/borabora.jpg");
		paisaje[6]= app.loadImage("../data/images/canada.jpg");
		paisaje[7]= app.loadImage("../data/images/F12.jpg");
		paisaje[8]= app.loadImage("../data/images/islasgalapagos.jpg");
		paisaje[9]= app.loadImage("../data/images/nort.jpg");
		paisaje[10]= app.loadImage("../data/images/museof.jpg");
		paisaje[11]= app.loadImage("../data/images/paris-francia.jpg");
		paisaje[12]= app.loadImage("../data/images/paris.jpg");
		paisaje[13]= app.loadImage("../data/images/Pisa_Piazza_Miracoli.jpg");
		paisaje[14]= app.loadImage("../data/images/pisa.jpg");
		paisaje[15]= app.loadImage("../data/images/torre.jpg");
		paisaje[16]= app.loadImage("../data/images/nort.jpg");
		paisaje[17]= app.loadImage("../data/images/nort.jpg");
		paisaje[18]= app.loadImage("../data/images/nort.jpg");
		paisaje[19]= app.loadImage("../data/images/nort.jpg");
		paisaje[20]= app.loadImage("../data/images/nort.jpg");
	}

}
