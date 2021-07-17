/**
 * Test Program #7: Simulating continuous movement.
 * 
 * @author:      Joanna Klukowska
 * @since:       Oct. 31, 2013
 * 
 * 
 */
package lecture11_processing;

import processing.core.PApplet;

public class ProcessingExample07 extends PApplet 
{	
	//dimensions of the canvas
	int xMax = 500;
	int yMax = 300;
	//initial position of the ball
	float x = random(0,xMax);
	float y = random(0,yMax);
	//step size in ball's movement 
	float xi = 2;
	float yi = 1;
	
	public void setup() 
	{
		size(xMax,yMax);
	}
	
	public void draw() 
	{	
		//redraw the background in each iteration of the draw method
		background(127,127,127); 
		//draw the new ball "near" the old position to simulate
		//continuous motion
		//ball bounces of the sides of the canvas
		if (x >= xMax || x <= 0)
			xi = -xi;
		if (y >= yMax || y <= 0)
			yi = -yi;
		x = x+xi;
		y = y+yi;
		ellipse(x, y, 10, 10);		
		
	}

}
