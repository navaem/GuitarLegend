import Animations.GLBackground;
import Element.GuitarFret;
import Element.Note;
import Element.RedNote;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.management.ThreadInfo;
import java.util.EventListener;
import java.util.concurrent.TimeUnit;

import static java.awt.event.KeyEvent.VK_G;

/*
*@author Ed Nava
*@version 1.0
*This app will recreate a GuitarHero-like game for my enjoyment and programming
*skill development.
*More documentation to follow.
*/
public class GuitarLegendApp extends Application {



	//main method
	public static void main(String[] args) {
		launch(args);
	}

	@Override
    public void start(Stage theStage) {

    	theStage.setTitle("Guitar Legend");

    	Group root = new Group();
 
    	Scene gNeck = new Scene(root);
    	theStage.setScene(gNeck);
    	Canvas canvas = new Canvas(1280, 720);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        GLBackground.startBgnd(gc);
		theStage.show();

		GuitarFret guitar  = new GuitarFret();

		//guitar.drawFretExecution();
        root.getChildren().add(guitar.getGroup());
//        gNeck.setOnKeyPressed((event) -> {
//			guitar.drawFretExecution();
//			System.out.println(event);
//		});
//        gNeck.setOnKeyReleased(event -> {
//        	System.out.println(event);
//		});
//        gNeck.setOnKeyTyped((event)->{System.out.println(event);});


       	//guitar.drawFretExecution();
       	//guitar.drawFretExecution();


		//guitar.drawFretExecution();

        GameLoop gl = new GameLoop(root);
        gl.start();
        
    }

}