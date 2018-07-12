import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;


/*
*@author Ed anva
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
        gc.fillOval()

        theStage.show();


    }

}