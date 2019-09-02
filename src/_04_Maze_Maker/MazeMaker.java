package _04_Maze_Maker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class MazeMaker{
	
	private static int width;
	private static int height;
	
	private static Maze maze;
	
	private static Random randGen = new Random();
	private static Stack<Cell> uncheckedCells = new Stack<Cell>();
	
	
	public static Maze generateMaze(int w, int h){
		width = w;
		height = h;
		maze = new Maze(width, height);
		
		//4. select a random cell to start
	int randcellx = randGen.nextInt(maze.getWidth());
	int randcelly = randGen.nextInt(maze.getHeight());
		
		
		//5. call selectNextPath method with the randomly selected cell
		selectNextPath(maze.getCell(randcellx, randcelly));
		
		return maze;
	}

	//6. Complete the selectNextPathMethod
	private static void selectNextPath(Cell currentCell) {
		//A. mark cell as visited
		currentCell.setBeenVisited(true);
		//B. check for unvisited neighbors using the cell
		ArrayList<Cell> unvisneighbor  = getUnvisitedNeighbors(currentCell);
		//C. if has unvisited neighbors,
		if(unvisneighbor.size()> 0) {
			Cell newcell = unvisneighbor.get(randGen.nextInt(unvisneighbor.size()));
			uncheckedCells.push(newcell);
			removeWalls(currentCell , newcell);
			currentCell = newcell;
			selectNextPath(currentCell);
			
		}
			//C1. select one at random.
			
			//C2. push it to the stack
		
			//C3. remove the wall between the two cells

			//C4. make the new cell the current cell and mark it as visited
		
			//C5. call the selectNextPath method with the current cell
			
			
		//D. if all neighbors are visited
		else{
			if(!uncheckedCells.isEmpty()) {
				currentCell = uncheckedCells.pop();
				selectNextPath(currentCell);
			}
		}
			//D1. if the stack is not empty
			
				// D1a. pop a cell from the stack
		
				// D1b. make that the current cell
		
				// D1c. call the selectNextPath method with the current cell
				
			
		
	}

	//7. Complete the remove walls method.
	//   This method will check if c1 and c2 are adjacent.
	//   If they are, the walls between them are removed.
	private static void removeWalls(Cell c1, Cell c2) {
		if(c1.getX() == c2.getX()) {
			if(c2.getY() > c1.getY()) {
				c2.setSouthWall(false);
				c1.setNorthWall(false);
			}
			else {
				c2.setNorthWall(false);
				c1.setSouthWall(false);
			}
		}
		else if(c1.getY() == c2.getY()) {
			if(c2.getX() > c1.getX()) {
				c2.setWestWall(false);
				c1.setEastWall(false);
			}
			else {
				c2.setEastWall(false);
				c1.setWestWall(false);
			}
		}
	}
	
	//8. Complete the getUnvisitedNeighbors method
	//   Any unvisited neighbor of the passed in cell gets added
	//   to the ArrayList

	private static ArrayList<Cell> getUnvisitedNeighbors(Cell c) {
		int x = c.getX();
		int y = c.getY();
		
		ArrayList<Cell> UnvisistedNeighbors = new ArrayList<Cell>();
	//	if(x ) {
			
	//	}
		
		return null;
	}
}
