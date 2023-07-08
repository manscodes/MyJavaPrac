package Array;

public class SumAvgArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = { 1, 12, 0, 9, 8, 56, 78, 32, -9 };
		int sum = 0;
		double avg = 0;
		for (int n : number) {
			sum += n;
		}
		int avglen = number.length;
		avg = (double)sum/(double)avglen;
		
		System.out.println("Sum of array: "+sum);
		System.out.println("Sum of avrage: "+avg);
	}

}
