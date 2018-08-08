import Element.Note;
import Element.OrangeNote;
import Element.RedNote;
import Element.YellowNote;
import Element.BlueNote;
import Element.GreenNote;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class GameLoop extends AnimationTimer {
	private GraphicsContext gc;
	private Note[] notes;

	public GameLoop(Group root) {
		Note[] notes = new Note[5];
		for (int i = 0; i < 5; i++) {
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
			if (i == 4) {
				notes[i] = new YellowNote();
			}
			root.getChildren().add(notes[i].getImage());
			notes[i].drawNote();
		}
		this.notes = notes;
	}

	@Override
	public void handle(long now) {
		// start game
		// load pictures and song
		// initialize scanner inputs
		System.out.println(now);
		// load score counter

		// draw everthing

		// update positions
		for (Note note : notes) {
			note.getImage();
			note.updatePos();

		}
		// fire commands

		// check score

		// things like that
	}
}