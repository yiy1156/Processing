/**
 * Test program #8: Controlling motion with the keyboard.
 * 
 * 
 * Introduces:
 * 
 * - detecting key strokes that do not have ASCII values
 *  key == CODED 
 *             - indicates that the key most recently pressed/released 
 *               does not have an ASCII value and keyCode variable should
 *               be used to determine its type
 *  keyCode    - the values of UP, DOWN, LEFT, RIGHT indicate arrow keys 
 *             
 *  For more details see http://processing.org/reference/ 
 */
package processing;

import processing.core.PApplet;

public class Processing08 extends PApplet 
{	
	//dimensions of the canvas
	int xMax = 500;
	int yMax = 300;
	//initial position of the ball
	float x = xMax/2-50;
	float y = yMax/2;
	//step size in ball's movement 
	float xi = 2;
	float yi = 2;

	
	public void setup() 
	{
		size(xMax,yMax);
		
//      print instruction on moving the rectangle
		textSize(18);
		fill(0,0,0);
		textAlign(CENTER);
		text("Use arrow keys to move the rectangle.\n", 250, 50 );
//		reset fill color to white
		fill(255,255,255);
	}
	
	public void draw() 
	{	
		//redraw the background in each iteration of the draw method
		background(127,127,127);
		
//		control motion of the rectangle using the 
//		arrow keys
//		the rectangle "wraps" around the visible window
		
		if ( keyPressed && key == CODED )
		{
			if ( keyCode == LEFT )
				x = x - xi;
			else if (keyCode == RIGHT)
				x = x + xi;
			else if (keyCode == UP)
				y = y - yi;
			else if (keyCode == DOWN )
				y = y + yi;
			
			if (x < 0 ) x = xMax;
			else if (x > xMax) x = 0;
			
			if (y < 0 ) y = yMax;
			else if (y > yMax) y = 0;
				
		}
		rect(x, y, 100, 10);	
		
		
	}

}
