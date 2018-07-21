package Animations;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;


/*
* @author Eduardo Nava
* @version 1.0
* this class will render the background
*/
public class GLBackground {
	

	public static void startBgnd(GraphicsContext gc) {
		Image background = new Image("nirvana.gif");
        gc.drawImage(background, 0, 0);
        

        gc.setFill(Color.SADDLEBROWN);
        double[] neckX = {550 ,410, 870, 730}; //bw = 460 tw = 180
        double[] neckY = {140 ,720, 720, 140}; // h = 580
        double[] fretsX = {586, 502, 594, 622, 658, 686, 778, 694};
        double[] fretsY = {140, 720, 720, 140, 140, 720, 720, 140};
        gc.fillPolygon(neckX, neckY, 4);
        gc.strokePolygon(neckX, neckY, 4);
        gc.strokePolygon(fretsX, fretsY, fretsY.length);
	}
}