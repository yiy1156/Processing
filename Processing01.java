/**
 * Test program #1: Setting up the applet and drawing rectangles at 
 * random locations. 
 * 
 * 
 * Introduces:
 * 
 * - setting up drawing area and redrawing the picture
 *  setup()    - sets up the canvas of the applet,
 *               executes once at the beginning of the program
 * 	size() 	   - called from within the setup(), sets the size of canvas
 *  draw()     - executes in continuous loop until the applet is closed
 *  
 * - drawing rectangles
 *  rect(topLeft_x, topLeft_y, width, height)
 *             - draws rectangle at specified place and with specified dimensions
 *             
 * - generating random numbers 
 *  random(low, high)
 *             - returns floating point number in the specified range 
 *             
 *  For more details see http://processing.org/reference/ 
 */
package processing;

import processing.core.PApplet;


public class Processing01  extends PApplet
{
//	this method runs once at the beginning to setup the drawing
//	area
	public void setup()
	{
//		set the size of the canvas for your "drawing:
		size(500,500);
	}
	
//	this method will execute in a loop (by default, you do not need
//	to do anything special)
	public void draw()
	{
//		this draws a rectangle with both sides equal to 10 
//		(that makes it a square) at a randomly generated x,y coordinates;
//      the method random(0,500) generates a random number from 0 to 500		
		rect (random(0,500), random(0,500), 10, 10);
	}
	
}
