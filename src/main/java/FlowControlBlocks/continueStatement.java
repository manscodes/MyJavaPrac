package FlowControlBlocks;

public class continueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++)
		{
			if(i>3 && i<6)
			{
				continue;
			}
			System.out.println(i+"*");
		}
	}

}
