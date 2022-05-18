package logicalProgram;

public class Practice8 {
	public static void main(String[] args) {
		int no=4;
		int temp = 0;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)   //
			{
				temp++;   //1
			}
		}if(temp!=0)
		{
			System.out.println("No is not prime");
		}else
		{
			System.out.println("No is prime");
		}
	
	}

}
