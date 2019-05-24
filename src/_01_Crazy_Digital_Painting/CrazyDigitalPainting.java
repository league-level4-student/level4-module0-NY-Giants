package _01_Crazy_Digital_Painting;

import java.awt.Color;

public class CrazyDigitalPainting extends ColorArrayDisplayer {
	//1. Create two final static integers for the width and height of the display.
final static int x = 500;
final static int y = 500;
	
	//2. Create a 2D array of Color objects. You will need to import
	//java.awt.Color. Initialize the size of the array using the 
	//integers created in step 1.
	
	
	public CrazyDigitalPainting() {
		Color [][] array2d = new Color[1000][1000]; 
		
		for(int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[i].length; j++) {
				array2d[i][j] = new Color(i % 18, (i * j) % 188, j % 240);
			}
		}
		ColorArrayDisplayer.displayColorsAsImage(array2d);
		//3. Open the crazy_digital_painting.png file and look at the image.
		
		//4. Iterate through the 2D array and initialize each Color object
		//   to a new color. The sample image was created using the following 
		//   pattern:
		//   colors[i][j] = new Color(i % 256, (i * j) % 256, j % 256);
		
		//5. Come up with your own pattern to make a cool crazy image.
		
		//6. Use the ColorArrayDisplayer class to call the displayColorsAsImage method 
		//   to show off your picture.
	}
	
	public static void main(String[] args) {
		new CrazyDigitalPainting();
	}
}
