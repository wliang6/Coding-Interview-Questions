package Week1;

/**
 * 
 * @author Winnie
 *Question: Given a square or rectangular matrix, print it in the following fashion:
 * alternate between printing the topmost row, then the leftmost column excluding the
 * element that was already printed with the row. Move 1 row down and 1 column right, and repeat.
For example, given the matrix:
      { { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 } };
The ideal output is:
        1, 2, 3, 4, 5
        6, 11, 16, 21
        7, 8, 9, 10
        12, 17, 22
        13, 14, 15
        18, 23
        19, 20
        24
        25
 *
 *
 *
 */

public class Week1Hard2 {

	public static void main(String[] args) {
		int[][]matrix = new int[][]{
		 { 1, 2, 3, 4, 5 },
         { 6, 7, 8, 9, 10 },
         { 11, 12, 13, 14, 15 },
         { 16, 17, 18, 19, 20 },
         { 21, 22, 23, 24, 25 }
         };
 	printRowThenCol(matrix);
}

	private static void printRowThenCol(int[][] matrix) {
	       int currRowStart = 0;
	       int currColStart = 1;
	       for (int row = 0; row < matrix.length; row++) {
	           // Print the elements from the top row first.
	           int currRow = currRowStart;
	           String rowToPrint = ""; 
	           while (currRow < matrix.length) {
	               rowToPrint += matrix[row][currRow];
	               rowToPrint += " ";
	               currRow++;
	           }
	           System.out.println(rowToPrint);
	           // Then print the elements from the leftmost column.
	           int currCol = currColStart;
	           String colToPrint = "";
	           while (currCol < matrix[0].length) { 
	               colToPrint += matrix[currCol][currRowStart];
	               colToPrint += " ";
	               currCol++;
	           }
	           System.out.println(colToPrint);
	           currRowStart++;
	           currColStart++;
	       }		
		
	}
	
	

}