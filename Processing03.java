/**
 * Test program #3: Printing text and changing its properties. Detecting mouse
 * clicks. 
 * 
 * 
 * Introduces:
 * 
 * - adding text to the display
 *  text("string to print", x, y)
 *             - prints the string at the specified position
 *             
 * - specifying text properties
 *  textSize( size)
 *             - set the font size
 *  fill( redLevel, greenLevel, blueLevel)
 *             - specifies the color to be used for the next text
 *  textAlign( [RIGH, CENTE, LEFT] )
 *             - specifies text alignement with respect to the position
 *               used in the text( ... ) method
 *             
 * - detecting mouse clicks
 *  mousePressed - data field becomes true if any of the mouse buttons
 *                 has been pressed in the last iteration of the draw() method
 *        
 * - changing color of the background after the initial setup: simply call the
 *   background() method inside the draw loop
 *               
 *  For more details see http://processing.org/reference/ 
 */
package processing;

import processing.core.PApplet;

public class Processing03 extends PApplet 
{
	public void setup() 
	{
//		set the background color to white
		background(255,255,255); 
		size(500, 500);		
	}

	public void draw() 
	{	
//		print text on the canvas: the font size is 32, the text color is black,
//		the text as centered on its x and y coordinates
		textSize(32);
		fill(0,0,0);
		textAlign(CENTER);
		text("Click to change the color", 250, 250); 
		
//		change the background color to a random new color when mouse click
//		is detected
		if (mousePressed )
			background( random(0,255), random(0,255), random(0,255) );
		
		
	}
}
