package Element;

import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class GuitarFret {

	private Group fret;
	private QuadCurve quad;
	private PathTransition path;

	// constructor should initialize the guitar fret and draw it on the screen
	public GuitarFret(Color s, double xTrans, double yTrans ) {
		this.fret = new Group();
		Ellipse outerRing = new Ellipse(207.5, 80.5);
		outerRing.setFill(s);
		outerRing.setStroke(Color.BLACK);
		Ellipse bottom = new Ellipse(175, 68);
		bottom.setFill(Color.LIGHTGREY);
		bottom.setStroke(Color.BLACK);
		this.quad = new QuadCurve(10, 20, 175, -68, 340, 20);
		this.quad.setFill(Color.TRANSPARENT);
		this.quad.setStroke(Color.BLACK);
		this.quad.setStrokeWidth(5);
		this.quad.setTranslateX(-175);
		this.fret.getChildren().addAll(outerRing, bottom, quad);
		fret.setScaleX(9.0 / 50.0);
		fret.setScaleY(9.0 / 50.0);
		fret.setTranslateX(xTrans);
		fret.setTranslateY(yTrans);
		Path path = new Path(new MoveTo(0, 0), new LineTo(0, -40));
		PathTransition pathTransition = new PathTransition();
		pathTransition.setDuration(Duration.millis(50));
		pathTransition.setNode(this.quad);
		pathTransition.setPath(path);
		pathTransition.setInterpolator(Interpolator.LINEAR);
		pathTransition.setOrientation(PathTransition.OrientationType.NONE);
		pathTransition.setCycleCount((int) 2f);
		pathTransition.setAutoReverse(true);
		this.path = pathTransition;
	}

	// draws the fret execution quickly
	public void drawFretExecution() {
		this.path.play();
		System.out.println("drawing fret execution");
	}

	public Group getGroup() {
		return fret;
	};
}
