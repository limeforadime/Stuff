import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.*;

import javax.swing.JComponent;

public class CheckerComponent extends JComponent {
	static final short ROW = 8;
	static final short COL = 8;
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLACK);
	
		int[][] values = new int[ROW][COL];
		int counter = 0;
		
		
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[0].length; j++)
			{
				values[i][j] = (counter%2==0?1:0);
				counter++;
			}
			counter = (counter%2==0)?1:0;
		}
	//DISPLAY THE CHECKERBOARD
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values[0].length; j++)
			{
				Graphics2D g2 = (Graphics2D) g;
				if(values[i][j] ==1)
				{
					Sq s = new Sq(j*50, i*50);
					s.draw(g);
				}
				//System.out.print(values[i][j]);
			}
			System.out.println();
		}
	}	
}
