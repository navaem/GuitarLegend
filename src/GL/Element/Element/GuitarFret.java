package Element;

import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;

public class GuitarFret {

    Group fret;
    QuadCurve quad;
    //constructor should initialize the guitar fret and draw it on the screen
    GuitarFret(){
        this.fret = new Group();
        Ellipse outerRing = new Ellipse(215,30);
        Ellipse bottom = new Ellipse(235,33);
        this.quad = new QuadCurve(0,0,215,30,430,0);
        this.fret.getChildren().addAll(outerRing,bottom,quad);
        fret.setScaleX(1.0/50.0);
        fret.setScaleY(1.0/50.0);
    }


    //draws the fret execution quickly
    private void drawFretExecution() {
        this.quad.setTranslateY();
    }
}
