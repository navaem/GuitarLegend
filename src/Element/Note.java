package Element;

import java.util.Random;

import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.ScaleTransition;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class Note {
	private double xPos;
	private double yPos;
	private int width;
	private Path path;

	private ImageView image;

	private String imName;
	private GraphicsContext gc;

	public Note(double x, double y, double finalX, double finalY, String imageName) {
		this.xPos = x;
		this.yPos = y;
		this.image = new ImageView(imageName);
		this.path = new Path(new MoveTo(x, y), new LineTo(finalX, finalY));

	}

	public ImageView getImage() {
		return image;
	}
	// public String getColor() {
	// Random rand = new Random();
	// int value = rand.nextInt(5);
	// String possibleColors[]= new String[5];
	// possibleColors[0]= "blueNote.png";
	// possibleColors[1]= "greenNote.png";
	// possibleColors[2]= "orangeNote.png";
	// possibleColors[3]= "redNote.png";
	// possibleColors[4]= "yellowNote.png";
	// this.color = possibleColors[value];
	// return this.color;
	// }

	public void drawNote() {
		ScaleTransition scale = new ScaleTransition();
		scale.setDuration(Duration.millis(10000));
		scale.setFromX(.08);
		scale.setFromY(.08);
		scale.setByX(.12);
		scale.setByY(.12);
		scale.setNode(image);
		scale.play();
		PathTransition pathTransition = new PathTransition();
		pathTransition.setDuration(Duration.millis(10000));
		pathTransition.setNode(image);
		pathTransition.setPath(path);
		pathTransition.setInterpolator(Interpolator.LINEAR);
		pathTransition.setOrientation(OrientationType.NONE);
		pathTransition.setCycleCount((int) 1f);
		pathTransition.setAutoReverse(false);
		System.out.println("playing note");
		pathTransition.play();

	}

	public void updatePos() {
		if (this instanceof GreenNote) {
			if (yPos % 4 == 0) {
				xPos--;
			}
			if (yPos % 10 == 0) {
				width++;
			}
		}
		if (this instanceof RedNote) {
			if (yPos % 7 == 1) {
				xPos--;
			}
			if (yPos % 10 == 0) {
				width++;
			}
		}
		if (this instanceof YellowNote) {
			if (yPos % 20 == 0) {
				xPos--;
			}
			if (yPos % 10 == 0) {
				width++;
			}
		}
		if (this instanceof BlueNote) {
			if (yPos % 20 == 0) {
				xPos++;
			}
			if (yPos % 10 == 0) {
				width++;
			}
		}
		if (this instanceof OrangeNote) {
			if (yPos % 10 == 0) {
				xPos++;
			}
			if (yPos % 10 == 0) {
				width++;
			}
		}
	}

}
