import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


public class GameLoop extends AnimationTimer {
	private GraphicsContext gc;
	private Note[] notes;
	
	public GameLoop(GraphicsContext gc) {
		Note [] notes = new Note[5];
		for (int i = 0; i< 5; i++) {
			notes[i] = new Note(gc);
		}
		this.notes = notes;
	}
	
	
	@Override
	public void handle(long now) {
		//start game
		//load pictures and song
		//initailize scanner inputs
		System.out.println(now);
		//load score counter
		
		//draw everthing

		//update positions
		for(Note note: notes) {
			note.updatePos();
			note.drawNote();
		}
		//fire commands

		//check score

		//things like that
	}
}