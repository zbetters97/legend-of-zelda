package object;

import entity.Entity;
import main.GamePanel;

public class ITM_Hookshot extends Entity {

	GamePanel gp;
	
	public ITM_Hookshot(GamePanel gp) {
		super(gp);
		this.gp = gp;

		type = type_item;
		name = "Hookshot";
		description = "[" + name + "]\nEquip to grab things!";
		down1 = setup("/objects/ITEM_Hookshot");
		
		projectile = new PRJ_Hookshot(gp);
	}	
	
	public boolean use(Entity user) {
		if (!projectile.alive && user.shotAvailableCounter == 30) { 			
							
			projectile.set(user.worldX, user.worldY, user.direction, true, user);			
			addProjectile(projectile);
						
			user.shotAvailableCounter = 0;	
		}		
		return true;
	}
	public void playSE() {
		gp.playSE(3, 5);
	}
}