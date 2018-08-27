import Element.Note;
import Element.OrangeNote;
import Element.RedNote;
import Element.YellowNote;
import Element.BlueNote;
import Element.GreenNote;
import Element.GuitarFret;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;


public class GameLoop extends AnimationTimer {
	private GraphicsContext gc;
	private Note[] notes;
	
	public GameLoop(Group root) {
		GuitarFret guitar1 = new GuitarFret(Color.GREEN, 479, 600);

		// guitar.drawFretExecution();
		root.getChildren().add(guitar1.getGroup());

		GuitarFret guitar2 = new GuitarFret(Color.RED,560,600);

		// guitar.drawFretExecution();
		root.getChildren().add(guitar2.getGroup());

		GuitarFret guitar3 = new GuitarFret(Color.YELLOW,640,600);

		// guitar.drawFretExecution();
		root.getChildren().add(guitar3.getGroup());

		GuitarFret guitar4 = new GuitarFret(Color.BLUE,720,600);

		// guitar.drawFretExecution();
		root.getChildren().add(guitar4.getGroup());

		GuitarFret guitar5 = new GuitarFret(Color.ORANGE,801,600);

		// guitar.drawFretExecution();
		root.getChildren().add(guitar5.getGroup());

		Note[] notes =  new Note[5];
		for (int i = 0; i< 5; i++) {
			if (i == 0)
				notes[i] = new BlueNote();
			if (i == 1) {
				notes[i] = new GreenNote();
			}
			if (i == 2) {
				notes[i] = new OrangeNote();
			}
			if (i == 3) {
				notes[i] = new RedNote();
			}
			if ( i == 4) {
				notes[i] = new YellowNote();
			}
			root.getChildren().add(notes[i].getImage());
			notes[i].drawNote();
		}
		this.notes = notes;
	}
	
	
	@Override
	public void handle(long now) {
		//start game
		//load pictures and song
		//initialize scanner inputs
		System.out.println(now);
		//load score counter
		
		//draw everthing

		//update positions
		for(Note note: notes) {
			note.getImage();
			note.updatePos();
			
		}
		//fire commands

		//check score

		//things like that
	}
}