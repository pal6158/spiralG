import java.util.*;
public class spiral {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
      System.out.println("input your row ");
      int n = sc.nextInt();
      System.out.println("input your colm");
      int m = sc.nextInt();
      int matrix[][] = new int[n][m];
      System.out.println("input your matrix");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              matrix[i][j] = sc.nextInt();
          }
      }
      System.out.println("This is yourt matrix\n");
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
      }
      System.out.println();
      int row_start = 0;
      int row_end = n - 1;
      int col_start = 0;
      int col_end = m - 1;
      while (row_start <= row_end || col_start <= col_end) {

          // 1
          for (int col = row_start; col <= col_end; col++) {
              System.out.print(matrix[row_start][col] + " ");
          }
          row_start++;

          //   2
          for (int row = row_start; row <= row_end; row++) {
              System.out.print(matrix[row][col_end] + " ");
          }
          col_end--;

          //   3
          for (int col = col_end; col >= col_start; col--) {
              System.out.print(matrix[row_end][col] + " ");
          }
          row_end--;
          for (int row = row_end; row >= row_start; row--) {
              System.out.print(matrix[row][col_start] + " ");
          }
          col_start++;
          System.out.println();
      }
    
      sc.close();
   }
}




    

