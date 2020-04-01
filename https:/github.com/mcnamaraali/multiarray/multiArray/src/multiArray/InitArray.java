package multiArray;

public class InitArray {

	public static void main(String[] args) {
		int[][] array1 = {{1,2,3}, {4,5,6}};
		int[][] array2 = {{1,2}, {3}, {4,5,6}}; //rows and colums of arrays
		
		System.out.println("Values in array1 by ROW are");
		outputArray(array1); //calling the method outputArray and passing array1 as a parameter to it
		System.out.printf("Values in array2 by ROW are%n");
		outputArray(array2);
	}
	
	public static void outputArray(int[][] arrayName) {
		//using the counter-controlled for loop, it loops through the rows and columns of the arrays
		for(int row = 0; row < arrayName.length; row++) {
			
			for (int cols = 0; cols < arrayName[row].length; cols++) {
				System.out.printf("%d ", arrayName[row][cols]);
			}
			//prints out a new line for every row
			System.out.println();
		}
	}

}
