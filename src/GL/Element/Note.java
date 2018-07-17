import java.util.Random;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;


public class Note {
	private String color;
	
	private int bluexPos;
	private int blueyPos;
	private int greenxPos;
	private int greenyPos;
	private int orangexPos;
	private int orangeyPos;
	private int redxPos;
	private int redyPos;
	private int yellowxPos;
	private int yellowyPos;
	
	private int bluewidth;
	private int blueheight;
	private int greenwidth;
	private int greenheight;
	private int orangewidth;
	private int orangeheight;
	private int redwidth;
	private int redheight;
	private int yellowwidth;
	private int yellowheight;
	
	private String imName;
	private GraphicsContext gc;


    public Note(GraphicsContext gc) {
    	this.gc = gc;
    	this.bluexPos = 548;
    	this.blueyPos = 150;
    	this.greenxPos = 548+38;
    	this.greenyPos = 150;
    	this.orangexPos = 548+38+38;
    	this.orangeyPos = 150;
    	this.redxPos = 548+38+38+38;
    	this.redyPos = 150;
    	this.yellowxPos = 548+38+38+38+38;
    	this.yellowyPos = 150;
    	
    	this.bluewidth= 30;
    	this.blueheight=40;
    	this.greenwidth= 30;
    	this.greenheight=40;
    	this.orangewidth= 30;
    	this.orangeheight=40;
    	this.redwidth= 30;
    	this.redheight=40;
    	this.yellowwidth= 30;
    	this.yellowheight=40;
    }

	public String getColor() {
		Random rand = new Random();
		int value = rand.nextInt(5); 
		String possibleColors[]= new String[5];
		possibleColors[0]= "blueNote.png";
		possibleColors[1]= "greenNote.png";
		possibleColors[2]= "orangeNote.png";
		possibleColors[3]= "redNote.png";
		possibleColors[4]= "yellowNote.png";
		this.color = possibleColors[value];
		return this.color;
	}

	public void drawNote() {
		getColor();
		System.out.println("drawing notes");
			if(this.color=="blueNote.png") {
				Image blueNote = new Image(this.color, bluewidth, blueheight, true, true);
				gc.drawImage(blueNote, bluexPos, blueyPos);
		}
			if(this.color=="greenNote.png") {
				Image greenNote = new Image(this.color, greenwidth, greenheight, true, true);
				gc.drawImage(greenNote, greenxPos, greenyPos);
		}
			if(this.color=="orangeNote.png") {
				Image orangeNote = new Image(this.color, orangewidth, orangeheight, true, true);
				gc.drawImage(orangeNote, orangexPos, orangeyPos);
		}
			if(this.color=="redNote.png") {
				Image redNote = new Image(this.color, redwidth, redheight, true, true);
				gc.drawImage(redNote, redxPos, redyPos);
		}
			if(this.color=="yellowNote.png") {
				Image yellowNote = new Image(this.color, yellowwidth, yellowheight, true, true);
				gc.drawImage(yellowNote, yellowxPos, yellowyPos);
		}
		}
	
	public void updatePos() {
		blueyPos++;
	
		
		if (blueyPos % 4 == 0) {
			bluexPos--;
		}
	
	
		if (blueyPos % 10== 0) {
			bluewidth++;
	}
	greenyPos++;
	
		
		if (greenyPos % 7 == 1) {
			greenxPos--;
		}
	
	
		if (greenyPos % 10 == 0) {
			greenwidth++;
	}
	orangeyPos++;
	
		
		if (orangeyPos % 20 == 0) {
			orangexPos--;
		}
	
	
		if (orangeyPos % 10 == 0) {
			orangewidth++;
	}
	redyPos++;
	
		
		if (redyPos % 20 == 0) {
			redxPos++;
		}
	
	
		if (redyPos % 10 == 0) {
			redwidth++;
	}
	yellowyPos++;
	
		
		if (yellowyPos % 7 == 0) {
			yellowxPos++;
		}
	
	
		if (yellowyPos % 10 == 0) {
			yellowwidth++;
	}
	}
}