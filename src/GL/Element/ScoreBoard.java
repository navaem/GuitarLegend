package Element;

import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;


public class ScoreBoard {
    private Group scoreBoard;
    private Line XLine1;
    private Line XLine2;
    private PathTransition path;

    private QuadCurve quad1;
    private QuadCurve quad2;
    private QuadCurve quad3;
    private QuadCurve quad4;
    private QuadCurve quad5;



    // constructor should initialize the guitar fret and draw it on the screen
    public ScoreBoard() {
        this.scoreBoard = new Group();

        //the Rectangle with the circle in it
        Rectangle outerRing = new Rectangle(320, 380);
        outerRing.setFill(Color.RED);
        outerRing.setStroke(Color.BLACK);
        outerRing.setTranslateX(-160);
        outerRing.setTranslateY(-230);
        outerRing.setStrokeWidth(20);


        //Where the score is kept
        Rectangle topRing = new Rectangle(300, 80);
        topRing.setFill(Color.RED);
        topRing.setStroke(Color.BLACK);
        topRing.setTranslateX(-150);
        topRing.setTranslateY(-230);

        //	RotateTransition rT = new RotateTransition(Duration.seconds(3), topRing);
        //rT.setFromAngle(0);
        //	rT.setToAngle(360);
        //rT.setAutoReverse(true);
        //	rT.setCycleCount(4);

        //Actual score so far (much more needs to be added)
        Text scoreText = new Text (-110, -170, "\"Score\"");
        scoreText.setFont(Font.font ("Verdana",FontWeight.BOLD, 50));
        scoreText.setFill(Color.BLACK);





        //The actual circle
        Ellipse bottom = new Ellipse(130, 130);
        bottom.setFill(Color.LIGHTGREY);
        bottom.setStroke(Color.BLACK);
        Text multiplierText = new Text (-50, 70, "4");
        multiplierText.setFont(Font.font ("Verdana",FontWeight.BOLD, 200));
        multiplierText.setFill(Color.BLACK);

        //the "X"
        this.XLine1 = new Line(-110, -30,-70,30);
        this.XLine1.setStroke(Color.BLACK);
        this.XLine1.setStrokeWidth(5);
        this.XLine2 = new Line(-70, -30,-110,30);
        this.XLine2.setStroke(Color.BLACK);
        this.XLine2.setStrokeWidth(5);

        this.quad1 = new QuadCurve(-170, -130, -230, -110, -170, -90);
        this.quad1.setFill(Color.DARKGREY);
        this.quad1.setStroke(Color.BLACK);
        this.quad1.setStrokeWidth(5);

        this.quad2 = new QuadCurve(-170, -75, -230, -55, -170, -35);
        this.quad2.setFill(Color.DARKGREY);
        this.quad2.setStroke(Color.BLACK);
        this.quad2.setStrokeWidth(5);

        this.quad3 = new QuadCurve(-170, -20, -230, 0, -170, 20);
        this.quad3.setFill(Color.DARKGREY);
        this.quad3.setStroke(Color.BLACK);
        this.quad3.setStrokeWidth(5);

        this.quad4 = new QuadCurve(-170, 35, -230, 55, -170, 75);
        this.quad4.setFill(Color.DARKGREY);
        this.quad4.setStroke(Color.BLACK);
        this.quad4.setStrokeWidth(5);

        this.quad5 = new QuadCurve(-170, 90, -230, 110, -170, 130);
        this.quad5.setFill(Color.DARKGREY);
        this.quad5.setStroke(Color.BLACK);
        this.quad5.setStrokeWidth(5);

        this.scoreBoard.getChildren().addAll(outerRing, bottom, topRing, scoreText, multiplierText, XLine1,
                XLine2, quad1, quad2, quad3, quad4, quad5);
        scoreBoard.setScaleX(20.0 / 50.0);
        scoreBoard.setScaleY(20.0 / 50.0);
        scoreBoard.setTranslateX(1000);
        scoreBoard.setTranslateY(400);

    }


    public Group getScoreBoard() {
        return scoreBoard;
    };
}