import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import com.game.src.main.classes.EntityB;

public class ButtonFlashSticks extends GameObject implements EntityB { // this is not to be confused with the NOTE class which
																	// will be the moving notes that fall on screen
	// this is not to be confused with the NOTE class which will be the moving notes
	// that fall on screen

    private double i;
	private int z;
	GameWindow g;
	
	private BufferedImage bbutton2; // sprite for b button
	
	private BufferedImage stickUp2;
	private BufferedImage stickDown2;
	private BufferedImage stickLeft2;
	private BufferedImage stickRight2;
	private BufferedImage stickURight2;
	private BufferedImage stickULeft2;
	private BufferedImage stickDRight2;
	private BufferedImage stickDLeft2;
	private BufferedImage cUp2;
	private BufferedImage cDown2;
	private BufferedImage cLeft2;
	private BufferedImage cRight2;
	private BufferedImage cURight2;
	private BufferedImage cULeft2;
	private BufferedImage cDRight2;
	private BufferedImage cDLeft2;
	private BufferedImage zbutton2;
	public ButtonFlashSticks(double x, double y, GameWindow g) {
		super(x, y);
		this.g = g;
		SpriteSheet ss = new SpriteSheet(g.getSpriteSheet());
		
		bbutton2 = ss.grabImage(4, 4, 32, 32);
		
		zbutton2 = ss.grabImage(7, 4, 32, 32);
		//stick
		stickUp2 = ss.grabImage(1, 6, 32, 32);
		stickDown2 = ss.grabImage(5, 5, 32, 32);
		stickLeft2 = ss.grabImage(3, 5, 32, 32);
		stickRight2 = ss.grabImage(7, 5, 32, 32);
		stickURight2 = ss.grabImage(8, 5, 32, 32);
		stickULeft2 = ss.grabImage(2, 6, 32, 32);
		stickDRight2 = ss.grabImage(6, 5, 32, 32);
		stickDLeft2 = ss.grabImage(4, 5, 32, 32);
		// c stick
		cDown2 = ss.grabImage(4, 6, 32, 32);
		cUp2 = ss.grabImage(7, 6, 32, 32);
		cLeft2 = ss.grabImage(1, 7, 32, 32);
		cRight2 = ss.grabImage(2, 7, 32, 32);
		// c stick diagonals
		cURight2 = ss.grabImage(8, 6, 32, 32);
		cULeft2 = ss.grabImage(6, 6, 32, 32);
		cDLeft2 = ss.grabImage(3, 6, 32, 32);
		cDRight2 = ss.grabImage(5, 6, 32, 32);

	}

	public void keyPressed(KeyEvent e) {

    	
        
       
        if (e.getKeyCode() == KeyEvent.VK_Z) {
            x = 347;
            y = 345;
        }
        
        if (e.getKeyCode() == KeyEvent.VK_UP) { 
            x = 264;
            y = 364;
            z=1;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        	x = 264;
            y = 364;
            z=2;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        	x = 264;
            y = 364;
            z=3;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        	x = 264;
            y = 364;
            z=4;
        }
        if (e.getKeyCode() == KeyEvent.VK_1) {
        	x = 264;
            y = 364;
            z=5;
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
        	x = 264;
            y = 364;
            z=6;
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
        	x = 264;
            y = 364;
            z=7;
        }
        if (e.getKeyCode() == KeyEvent.VK_4) {
        	x = 264;
            y = 364;
            z=8;
        }
      //c stick (needs a z coord simply because there are so many sprites going into 390, 440)
        if (e.getKeyCode() == KeyEvent.VK_U) {
            x = 327;
            y = 397;
            z=1;
        }
        if (e.getKeyCode() == KeyEvent.VK_H) {
        	x = 327;
            y = 397;
             z= 2;
        }
        if (e.getKeyCode() == KeyEvent.VK_J) {
        	x = 327;
            y = 397;
             z = 3;
        }
        if (e.getKeyCode() == KeyEvent.VK_K) {
        	x = 327;
            y = 397;
             z = 4;
        }
        
        // c stick diagonal inputs
        if (e.getKeyCode() == KeyEvent.VK_5) {
        	x = 327;
            y = 397;
            z = 5;
        }
        if (e.getKeyCode() == KeyEvent.VK_6) {
        	x = 327;
            y = 397;
            z = 6;
        }
        if (e.getKeyCode() == KeyEvent.VK_7) {
        	x = 327;
            y = 397;
            z = 7;
        }
        if (e.getKeyCode() == KeyEvent.VK_8) {
        	x = 327;
            y = 397;
            z = 8;
        }

	}

	public void keyReleased(KeyEvent e) {
		
		
		
		if (e.getKeyCode() == KeyEvent.VK_UP) {

			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {

			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {

			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {

			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_4) {

			x = -100;
			y = -100;
			z = 0;
		}
		// c stick diagonals: // try an if statement within an if statement? instead of
		// the and?
		if (e.getKeyCode() == KeyEvent.VK_5) {
			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_6) {
			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_7) {
			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_8) {
			x = -100;
			y = -100;
			z = 0;
		}

		// c stick
		if (e.getKeyCode() == KeyEvent.VK_U) {
			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_H) {
			x = -100;
			y = -100;
			z = 0;
		}

		if (e.getKeyCode() == KeyEvent.VK_J) {
			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_K) {
			x = -100;
			y = -100;
			z = 0;
		}
		if (e.getKeyCode() == KeyEvent.VK_Z) {

			x = -100;
			y = -100;
		}
		
	
	}

	public void tick() // update method
	{

	}

	public void render(Graphics g) // draws out image
	{
		
        if (x == 313 && y == 372) {
            g.drawImage(bbutton2, (int) x, (int) y, null);
        }
        
        if (x == 264 && y == 364 && z == 1) {
            g.drawImage(stickUp2, (int) x, (int) y, null);
        }
        if (x == 264 && y == 364 && z == 2) {
            g.drawImage(stickDown2, (int) x, (int) y, null);
        }
        if (x == 264 && y == 364 && z == 3) {
            g.drawImage(stickLeft2, (int) x, (int) y, null);
        }

        if (x == 264 && y == 364 && z == 4) {
            g.drawImage(stickRight2, (int) x, (int) y, null);
        }

        if (x == 264 && y == 364 && z == 5) {
            g.drawImage(stickURight2, (int) x, (int) y, null);
        }

        if (x == 264 && y == 364 && z == 6) {
            g.drawImage(stickULeft2, (int) x, (int) y, null);
        }

        if (x == 264 && y == 364 && z == 7) {
            g.drawImage(stickDRight2, (int) x, (int) y, null);
        }

        if (x == 264 && y == 364 && z == 8) {
            g.drawImage(stickDLeft2, (int) x, (int) y, null);
        }

        if (x == 327 && y == 397 && z == 1) {
            g.drawImage(cUp2, (int) x, (int) y, null);
        }
        if (x == 327 && y == 397 && z == 2) {
            g.drawImage(cLeft2, (int) x, (int) y, null);
        }
        if (x == 327 && y == 397 && z == 3) {
            g.drawImage(cDown2, (int) x, (int) y, null);
        }
        if (x == 327 && y == 397 && z == 4) {
            g.drawImage(cRight2, (int) x, (int) y, null);
        }
        if (x == 327 && y == 397 && z == 5) {
            g.drawImage(cURight2, (int) x, (int) y, null);
        }
        if (x == 327 && y == 397 && z == 6) {
            g.drawImage(cULeft2, (int) x, (int) y, null);
        }
        if (x == 327 && y == 397 && z == 7) {
            g.drawImage(cDRight2, (int) x, (int) y, null);
        }
        if (x == 327 && y == 397 && z == 8) {
            g.drawImage(cDLeft2, (int) x, (int) y, null);
        }
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

	public double getI() {
		return i;
	}
	public void setI(double i) {
	   this.i = i;
	}
	public Rectangle getBounds() {

		return new Rectangle((int) x, (int) y, 32, 32);
	}
	public int getZ() {
		return z;
	}

}