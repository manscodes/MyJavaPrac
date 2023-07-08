package StarPatternPrint;

import java.util.Scanner;

public class LeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows in pattern");
		rows = in.nextInt();
		
		 for (int i=0; i<rows; i++)
		    {
		      for (int j=2*(rows-i); j>2; j--)
		      {
		        System.out.print(" ");
		      }
		      for (int column=0; column<=i; column++ )
		      {
		        System.out.print("* ");
		      }
		      //To move cursor to new line for each row
		      System.out.println();
		    }
	}

}
