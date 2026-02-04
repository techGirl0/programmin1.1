package week4_data_structure;

public class Arrays {
    public static void main(String[] args) {
      // 2D arrays
      int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

      System.out.println("Rows: " + myNumbers.length);            
      System.out.println("Cols in row 0: " + myNumbers[0].length); 
      System.out.println("Cols in row 1: " + myNumbers[1].length); 

      // Looing through 2D arrays

      int[][] myNumbers2 = { {1, 4, 2}, {3, 6, 8, 5, 2} };

      for (int row = 0; row < myNumbers2.length; row++) {
        for (int col = 0; col < myNumbers[row].length; col++) {
          System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers2[row][col]);
        }
      }
  
  }
}