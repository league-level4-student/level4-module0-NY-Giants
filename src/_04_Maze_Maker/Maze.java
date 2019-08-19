package _04_Maze_Maker;
import java.awt.Graphics;

public class Maze {
	//1. Create a 2D array of cells. Don't initialize it.
	Cell[][] mazearray;
	private int width;
	private int height;

	public Maze(int w, int h) {
		this.width = w;
		this.height = h;

		//2. Initialize the cells using the width and height varibles
		mazearray = new Cell[w][h];
		//3. Iterated through each cell and initialize it
		//   using i and j as the location
		for (int i = 0; i < mazearray.length; i++) {
			for (int j = 0; j < mazearray[i].length; j++) {
				mazearray[i][j] = new Cell(i, j);
			}
		}
		
	}

	//4. This method iterates through the cells and draws them
	public void draw(Graphics g) {
		for (int i = 0; i < mazearray.length; i++) {
			for (int j = 0; j < mazearray[i].length; j++) {
				mazearray[i][j].draw(g);
			}
		}
	}
	
	//4b. This method returns the selected cell.
	public Cell getCell(int x, int y){
		for (int i = 0; i < mazearray.length; i++) {
			for (int j = 0; j < mazearray[i].length; j++) {
				
			}
		}
		return  null;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
