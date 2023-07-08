package Array;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] Name= {{"Manisha","Vishal"},{"Himanshu","Hiral","Nitya"}};
		String[][] Name1=Name;
		
		for(String[] n:Name1)
		{
			for(String data:n)
			{
				System.out.println(data);
			}
		}
	}

}
