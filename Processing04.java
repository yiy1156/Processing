/**
 * Test program #4: Detecting mouse clicks and recognizing their type. Changing 
 * refresh rate (frame rate).
 * 
 * 
 * Introduces:
 * 
 * - changing speed of the loop
 *  frameRate( numberOfRepeatsPerSecond )
 *             - indicates how many times per second the draw loop should be
 *               repeated
 *             
 * - detecting which mouse button is clicked
 *  mouseButton - data field can be either LEFT, RIGHT or CENTER indicating 
 *                which mouse button was clicked
 *               
 *  For more details see http://processing.org/reference/ 
 */
package processing;

import processing.core.PApplet;

public class Processing04 extends PApplet 
{	
	public void setup() 
	{
		background(255,255,255); 
		size(500, 500);	
//		set the refresh rate to 10 times per second (default is 60 times per second)
		frameRate( 10 );
//		print text on the canvas: the font size is 32, the text color is black,
//		the text is centered on its x and y coordinates
		textSize(20);
		fill(0,0,0);
		textAlign(CENTER);
		text("Click a mouse button" , 250, 50); 
	}

	public void draw() 
	{			
//		repaint the background of the canvas whenever the mouse is clicked,
//      change the fill color for the circles depending on the last click
		if (mousePressed )
		{
			if (mouseButton == LEFT) {
				background(255,255,255); 
				fill(0,0,0);
				text("Last click was LEFT click." , 250, 450);		
				fill(255,0,0);	
				text("Click a mouse button" , 250, 50); 
			}
			else if (mouseButton == RIGHT  ) {
				background(255,255,255); 
				fill(0,0,0);
				text("Last click was RIGHT click." , 250, 450);
				fill(0,255,0);
				text("Click a mouse button" , 250, 50); 
			}
			else  {
				background(255,255,255); 
				fill(0,0,0);
				text("Last click was CENTER click." , 250, 450);
				fill(0,0,255);
				text("Click a mouse button" , 250, 50); 
			}
		
		}
		
		ellipse(random(0,500), random(100,400), 10, 10);
				
	}
}
