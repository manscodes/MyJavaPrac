package FlowControlBlocks;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			if(i>4)
			{
				break;			
			}
			System.out.println(i+"*");
		}
	}

}
