/**
 * Test program #10: Loading images
 *  
 * 
 * Introduces:
 * 
 * - loading images
 *  PImage     - class that represents images
 *  loadImage ("image_file");
 *             - loads an image from the file called image_file
 *               and return PImage object
 *               
 * - manipulating images
 *  PImage.get(i, j) 
 *             - gets the color of the i,j pixel 
 *  PImage.set(i, j, color) 
 *             - sets the color of the i,j pixel 
 * 
 *  For more details see http://processing.org/reference/ 
 */
package processing;

import processing.core.PApplet;
import processing.core.PImage;

public class Processing10 extends PApplet 
{	
	//dimensions of the canvas
		int xMax = 600;
		int yMax = 400;

		PImage bunny;
		PImage bunny_r;
		PImage turtle;
		PImage turtle_r;	
		
		int counter;
		
		public void setup() 
		{
			size(xMax,yMax);
			background (0, 188, 0);
			
			bunny = loadImage("bugs-bunny.png");
			turtle = loadImage("CECIL.png");
			

			turtle_r = new PImage( turtle.width, turtle.height, ALPHA) ;
			for( int i=0; i < turtle.width; i++ ){
				for(int j=0; j < turtle.height; j++){
					turtle_r.set( turtle.width - 1 - i, j, turtle.get(i, j) );
				}   
			}
			
			bunny_r = new PImage( bunny.width, bunny.height, ALPHA) ;
			for( int i=0; i < bunny.width; i++ ){
				for(int j=0; j < bunny.height; j++){
					bunny_r.set( bunny.width - 1 - i, j, bunny.get(i, j) );
				}   
			}
			counter = 0;
						
		}
		
		public void draw()
		{
			counter++;
			if (counter/60 == 0)
			{
				background (0, 188, 0);
				image ( bunny, 350, 50, 200, 234 );
				image ( turtle, 50, 50, 200, 246 ); 
			}
			else if (counter/60 == 1)
			{
				background (0, 188, 0);
				image ( bunny_r, 50, 50, 200, 234 );
				image ( turtle_r, 350, 50, 200, 246 );
			}
			else 
				counter = 0;
		}
		
}
