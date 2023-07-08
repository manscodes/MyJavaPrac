package Array;

public class MultidimensionalArray {
	
	public static void main(String[] args) {
		int[][] a= {{1,3},{2,4,5},{8},};
		
		for(int[] n:a)
		{
			for(int data: n) {
                System.out.println(data);
            }
		}
		
		
int[][][] b={ {
        {1, -2, 3}, 
        {2, 3, 4}
      }, 
      { 
        {-4, -5, 6, 9}, 
        {1}, 
        {2, 3}
      } ,{{0,2}}
	};
		
		for(int[][] m:b)
		{
			for(int[] data1: m) {
				for(int data2: data1) {
	                System.out.println(data2);
	            }
            }
		}
	}
	
}
