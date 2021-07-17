/**
 * Test program #2: Changing color of the background and fill color
 * of shapes. 
 * 
 * 
 * Introduces:
 * 
 * - setting color of the background
 *  background( redLevel, greenLeve, blueLevel)    
 *             - fills the background with specified color
 * 	
 * - drawing ellipse using different colors
 *  ellipse(center_x, center_y, radius_x, radius_y)
 *             - draws rectangle at specified place and with specified dimensions
 *  fill( redLevel, greenLevel, blueLevel)
 *             - specifies the color to be used to draw the next shape
 * 
 *  For more details see http://processing.org/reference/ 
 */
package processing;

import processing.core.PApplet;

public class Processing02  extends PApplet
{

	public void setup()
	{
//		Set the background color of the canvas: the three values 
//		represent levels of red, green and blue. They should be between
//		0 and 255.
		background( 0,0,0);
		size(500,500);
	}

	public void draw()
	{
		//background( 0,0,0);
//		Calling fill() method before the shape is drawn changes the fill color 
//		for the next drawn shape, the circles appear in different colors.
		fill( random(0,255),  random(0,255),  random(0,255) );
		ellipse(random(0,500), random(0,500), 30, 10);
	}
	
}
