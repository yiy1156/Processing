/**
 * Test program #5: Free hand drawing with the mouse pressed. Changing color
 * of the line.
 * 
 * @author:      Joanna Klukowska
 * @since:       Oct. 31, 2013
 * 
 * Introduces:
 * 
 * - drawing lines
 *  line( x1, y1, x2, y2)
 *             - draws a line between two points
 * 
 * - changing color of lines and boarders of shapes
 *  stroke ( redLevel, greenLevel, blueLevel)
 *             - specifies the color to be used for
 *               drawing lines and borders of shapes
 *             
 * - detecting mouse click position
 *  mouseX
 *  mouseY     - x and y coordinates of the mouse in the current frame
 *  pmouseX
 *  pmouseY    - x and y coordinates of the mouse in the previous frame
 *               
 *  For more details see http://processing.org/reference/ 
 */
package lecture11_processing;

import processing.core.PApplet;

public class ProcessingExample05 extends PApplet 
{	
	public void setup() 
	{
//		set the background color to white
		background(255,255,255); 
		size(500, 500);	
//		change the line color to a random color
		stroke ( random(0,255), random(0,255), random(0,255) );
		
	}
	
	public void draw() 
	{	
//		whenever a mouse button is pressed draw a line connecting
//		current position to the mouse to previous position of the mouse
		if (mousePressed )
		{
			stroke ( random(0,255), random(0,255), random(0,255) );
			line( mouseX, mouseY, pmouseX, pmouseY );
		}
		
		
	}

}
