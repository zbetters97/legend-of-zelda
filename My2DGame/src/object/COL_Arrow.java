package object;

import entity.Entity;
import main.GamePanel;

public class COL_Arrow extends Entity {

	GamePanel gp;
	
	public COL_Arrow(GamePanel gp) {
		super(gp);
		this.gp = gp;

		type = type_collectable;
		name = "Arrow";
		value = 1;
		down1 = setup("/objects/arrows_full", gp.tileSize - 15, gp.tileSize - 15);
		image1 = setup("/objects/arrows_full", gp.tileSize - 15, gp.tileSize - 15);
		image2 = setup("/objects/arrows_empty", gp.tileSize - 15, gp.tileSize - 15);
	}
	
	public boolean use(Entity user) {
		gp.playSE(1, 6);
		gp.ui.addMessage("Arrows +" + value + "!");
		user.arrows += value;
		return true;
	}
}