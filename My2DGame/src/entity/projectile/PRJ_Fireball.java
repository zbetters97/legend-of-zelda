package entity.projectile;

import java.awt.Color;
import java.awt.Rectangle;

import application.GamePanel;

public class PRJ_Fireball extends Projectile {

	GamePanel gp;
	public static final String prjName = "Fireball";
	
	public PRJ_Fireball(GamePanel gp) {
		super(gp);
		this.gp = gp;
		
		type = type_projectile;
		name = prjName;
		attack = 2;	
		speed = 7; 
		maxLife = 60; life = maxLife;
		alive = false;
		
		hitbox = new Rectangle(12, 12, 24, 24); 		
		hitboxDefaultX = hitbox.x;
	    hitboxDefaultY = hitbox.y;
		
		getImage();
	}
	
	public void getImage() {
		up1 = setup("/projectile/fireball_down_1");
		up2 = setup("/projectile/fireball_down_2");
		down1 = up1;
		down2 = up2;
		left1 = up1;
		left2 = up2;
		right1 = up1;
		right2 = up2;
	}
	
	public Color getParticleColor() {
		Color color = new Color(240,50,0); // RED
		return color;
	}	
	public int getParticleSize() {		
		int size = 10; // 10px
		return size;
	}	
	public int getParticleSpeed() {
		int speed = 1;
		return speed;		
	}	
	public int getParticleMaxLife() {
		int maxLife = 20; // 20 frames
		return maxLife;
	}
	
	public void playSE() {
		gp.playSE(4, 2);
	}
}