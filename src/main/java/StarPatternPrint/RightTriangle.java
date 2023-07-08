package StarPatternPrint;

import java.util.*;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows in pattern");
		rows = in.nextInt();

		for (int i = 1; i <= rows; i++) {
			System.out.print(" ");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
