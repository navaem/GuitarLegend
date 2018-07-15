import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Note {
	private String color;
	private int xPos;
	private int yPos;
	private String imName;
	private GraphicsContext gc;


    public Note(GraphicsContext gc) {
    	this.gc = gc;

    }

	public String getColor() {
		return this.color;
	}

	public void drawNote() {
		System.out.println("drawing notes");
		Image blueNote = new Image("blueNote.png", 30, 40, true, true);
		gc.drawImage(blueNote, 548, 150);
	}
}