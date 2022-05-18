package starPatternByIfElse;

public class Pattern1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*********
		// *******
		//  *****
		//   ***
		//    *
		//   ***
		//  *****
		// *******
		//*********
		

		
		int space=0;
		int star=5;
		
	
		for(int i=1;i<=9;i++) {
		
		for( int j=0;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}	
		for(int l=1;l<star;l++)
		{
		    System.out.print("*");	
		}System.out.println("");
if(i<=4)
{
    star--;
  
	space++;
}else
{
	star++;
	
	space--;
}
 }
 

}

}
