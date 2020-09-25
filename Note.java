import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import com.game.src.main.classes.EntityA;
import java.awt.event.KeyEvent;

public class Note extends GameObject implements EntityA {

	private String type;
	GameWindow g;
	BufferedImage a;
	private boolean falling = true;

	public Note(int x, int y, GameWindow g) {

		super(x, y);
		this.g = g;

		// this.type = type;
		SpriteSheet z = new SpriteSheet(g.getSpriteSheet());
		a = z.grabImage(1, 1, 32, 32);

	}

	public void tick() // update method
	{
		if (falling == true) {
			if (y < 460)
				y++;
			else {
				y = 0;
				y++;
			}
		}
		// note is entity a, checks to see if collision is true for colliding with a
		// buttonflash
	}

	public void render(Graphics g) // draws out image
	{
		g.drawImage(a, (int) x, (int) y, null);

	}

	@Override
	public double getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public double getY() {
		// TODO Auto-generated method stub
		return y;
	}

	public Rectangle getBounds() {

		return new Rectangle((int) x, (int) y, 32, 32);
	}

	public boolean getFalling() {
		return falling;
	}

	public void setFalling(boolean x) {
		falling = x;
	}

	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_S) {
			if (falling)
				falling = false;
			else if (!falling)
				falling = true;
		}

	}

}
