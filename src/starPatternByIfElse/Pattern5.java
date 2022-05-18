package starPatternByIfElse;

public class Pattern5 {
	public static void main(String[] args) {
		//    *         
		//   * *        
		//  * * * 
		// * * * *    
		//* * * * *       
		// * * * *         
		//  * * *
		//   * *
		//    *
		int space=3;
		int star=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=0;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}System.out.println();
			if(i<5)
			{
				space--;
				star++;
			}else
			{
				space++;
				star--;
			}
		}
	
	}

}
