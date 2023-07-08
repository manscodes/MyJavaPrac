package ReadWriteData;

import java.util.Scanner;

public class InputOutputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);

		  System.out.println("Enter Float:");
		  float a=input.nextFloat();
		  System.out.println("Entered Float:"+ a);
		  
		  System.out.println("Enter string:");
		  String s=input.next();
		  System.out.println("Entered String:"+ s);
	}

}
