package Element;
import java.util.Random;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;


public class Note {
	private int xPos;
	private int yPos;
	private int width;

	private ImageView image;
	
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

    public Note(int x,int y,String imageName){
    	this.xPos = x;
    	this.yPos = y;
    	this.image = new ImageView(imageName);
	}

//	public String getColor() {
//		Random rand = new Random();
//		int value = rand.nextInt(5);
//		String possibleColors[]= new String[5];
//		possibleColors[0]= "blueNote.png";
//		possibleColors[1]= "greenNote.png";
//		possibleColors[2]= "orangeNote.png";
//		possibleColors[3]= "redNote.png";
//		possibleColors[4]= "yellowNote.png";
//		this.color = possibleColors[value];
//		return this.color;
//	}

//	public void drawNote() {
//		getColor();
//		System.out.println("drawing notes");
//			if(this.color=="blueNote.png") {
//				Image blueNote = new Image(this.color, bluewidth, blueheight, true, true);
//				gc.drawImage(blueNote, bluexPos, blueyPos);
//		}
//			if(this.color=="greenNote.png") {
//				Image greenNote = new Image(this.color, greenwidth, greenheight, true, true);
//				gc.drawImage(greenNote, greenxPos, greenyPos);
//		}
//			if(this.color=="orangeNote.png") {
//				Image orangeNote = new Image(this.color, orangewidth, orangeheight, true, true);
//				gc.drawImage(orangeNote, orangexPos, orangeyPos);
//		}
//			if(this.color=="redNote.png") {
//				Image redNote = new Image(this.color, redwidth, redheight, true, true);
//				gc.drawImage(redNote, redxPos, redyPos);
//		}
//			if(this.color=="yellowNote.png") {
//				Image yellowNote = new Image(this.color, yellowwidth, yellowheight, true, true);
//				gc.drawImage(yellowNote, yellowxPos, yellowyPos);
//		}
//		}
	
	public void updatePos() {
		if (this instanceof RedNote){

		}
		if (this instanceof BlueNote){
			if (yPos % 20 == 0) {
				xPos++;
			}
			if (yPos % 10 == 0) {
				width++;
			}
		}



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