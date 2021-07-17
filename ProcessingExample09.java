/**
 * Test program #9: Simple pong game.
 * This program uses a ball that moves "on its own" and a paddle that is 
 * controlled by the user. 
 * 
 * @author:      Joanna Klukowska
 * @since:       Oct. 31, 2013
 * 
 *  For more details see http://processing.org/reference/ 
 */
package lecture11_processing;

import processing.core.PApplet;

public class ProcessingExample09 extends PApplet 
{	
	//dimensions of the canvas
	int xMax = 500;
	int yMax = 300;
//rectangle properties
	//size
	float rxSize = 100;
	float rySize = 5;
	//position
	float rx = xMax/2 - rxSize/2;
	float ry = yMax - rySize;
	//increment size
	float rxi = 2;

//ball properties
	//initial position
	float bx = xMax/2;
	float by = yMax/2;
	//size
	float bxSize = 10;
	float bySize = 10;
	//step size in ball's movement 
	float bxi = random((float)1.5,3);
	float byi = -random((float)1.5,3);
	
//state of the game
	boolean gameOn = true;
	
	
	public void setup() 
	{
		size(xMax,yMax);
	}
	
	public void draw() 
	{	
		//redraw the background in each iteration of the draw method
		background(127,127,127);
		stroke(255, 255,255);
		fill(255,255,255);
		rect(0,0, 5, yMax);
		rect(xMax-5,0, 5, yMax);
		rect(0,0, xMax, 5);
		
		//move the rectangle if the player uses left and right arrow keys
		//if the rectangle is at one of the sides, it does not move past 
		//the side of the window
		
		if ( keyPressed && key == CODED )
		{
			if ( keyCode == LEFT )
				rx = rx - rxi;
			else if (keyCode == RIGHT)
				rx = rx + rxi;
			
			if (rx < 0 ) rx = 0;
			else if (rx+rxSize > xMax) rx = xMax-rxSize;
				
		}
		rect(rx, ry, rxSize, rySize);	
		
		//the ball moves until it is lost 
		if (gameOn)
		{
			//the ball bounces back from the two sides and the wall
			if (bx >= xMax-5 || bx <= 0+5)
				bxi = -bxi;
			if (by <= 0+5)
				byi = -byi;
			
			//but the bottom has to be protected by the sliding 
			//rectangle or the ball is lost
			if (by >= yMax - 5) {
				//check if the rectangle is there
				if ( bx >= rx && bx <= rx+rxSize) 
					byi = -byi;
				else
					gameOn = false;
			}
			
			bx = bx+bxi;
			by = by+byi;
			ellipse(bx, by, bxSize, bySize);	
		}
		else
		{
			textAlign(CENTER);
			text ("The ball is lost!\n"
					+ "Try again.", 250, 150);
		}
	}

}
