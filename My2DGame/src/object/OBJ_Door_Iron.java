package object;

import java.awt.Rectangle;

import entity.Entity;
import main.GamePanel;

public class OBJ_Door_Iron extends Entity {
	
	public static final String objName = "Iron Door";
	GamePanel gp;
	
	public OBJ_Door_Iron(GamePanel gp) {
		super(gp);
		this.gp = gp;
		
		type = type_obstacle;
		name = objName;
		down1 = setup("/objects/OBJ_DOOR_IRON");
		hitbox = new Rectangle(0, 0, 48, 48);
		collision = true;
		
		setDialogue();
	}	
	
	public void setDialogue() {
		dialogues[0][0] = "It won't budge...";	
	}
	
	public void interact() {		
		startDialogue(this, 0);
	}
	
	public void playOpenSE() {
		gp.playSE(3, 14);
	}
	public void playCloseSE() {
		gp.playSE(3, 18);
	}
}