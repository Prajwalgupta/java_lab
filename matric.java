import java.util.*;

public class matric{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("Enter the number of row:");
		row=sc.nextInt();
		System.out.println("Enter the number of column:");
		col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][row];
		System.out.println("\nEnter values for matrix A : ");
		    for (int i = 0; i < row; i++) {
		      for (int j = 0; j < col; j++) {
		    	  a[i][j] = sc.nextInt();
		      }
		    }
		    System.out.println("\nEnter values for matrix B : ");
		    for (int i = 0; i < row; i++) {
		      for (int j = 0; j < col; j++) {
		    	  b[i][j] = sc.nextInt();
		      }
		    }
		    
		    System.out.println("\nMatrix multiplication is : ");
		    for (int i = 0; i < row; i++) {
		      for (int j = 0; j < col; j++) {
			// Initialize the element C(i,j) with zero
			c[i][j] = 0;
			for (int k = 0; k < col; k++) {
				c[i][j] += a[i][k] * b[k][j];
			  }
			System.out.print(c[i][j] + " ");
		      }
		      System.out.println();
		    }
	}
}

