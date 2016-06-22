

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.*;


public class Sq {
	private int xLeft;
	private int yTop;
	private int width;
	private int height;
	
	//constructor
	public Sq(int x, int y)
	{
		xLeft = x;
		yTop = y;
		width = 50;
		height = 50;
	}
	
	public void draw(Graphics g)
	{
		g.fillRect(xLeft, yTop, width, height);
	}
}
