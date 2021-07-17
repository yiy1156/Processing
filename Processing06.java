/**
 * Test program #6: Detecting key strokes and changing color of the line.
 * 
 * 
 * Introduces:
 *             
 * - detecting key strokes
 *  keyPressed - data field becomes true if any key on the keyboard 
 *               has been pressed in the last iteration of the draw() method
 *  key        - contains the code of the last pressed/released
 *               key on the keyboard
 *               
 *  For more details see http://processing.org/reference/ 
 */
package processing;

import processing.core.PApplet;

public class Processing06 extends PApplet 
{	
	public void setup() 
	{
//		set the background color to white
		background(255,255,255); 
		size(500, 500);	
//      set the initial "pen" color to random color
		stroke ( random(0,255), random(0,255), random(0,255) );
//      print instruction on changing the pen color	
		textSize(18);
		fill(0,0,0);
		textAlign(CENTER);
		text("Press a key to change the pen color:\n" 
				+ "   r  - red\n" 
				+ "   g  - green\n" 
				+ "   b  - blue\n", 250, 400 );
		
	}
	
	public void draw() 
	{	
//      draw lines when mouse if Pressed
		if (mousePressed )
		{
			line( mouseX, mouseY, pmouseX, pmouseY );
		}
//      change the color of the line if r, g, or b keys are pressed,
//		all other keys are ignored
		if ( keyPressed )
		{
			if (key == 'r' || key == 'R')
				stroke ( 255, 0, 0 );
			if (key == 'b' || key == 'B')
				stroke ( 0, 0, 255 );
			if (key == 'g' || key == 'G')
				stroke ( 0, 255, 0 );
		}
		
		
	}

}
