package logicalProgram;

public class CheckPalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=121;
		int comp=no;
		int rev=0;
		while(no>0)
		{
			int temp=no%10;   //1st temp=1  //2nd temp=2            //3rd temp=1
		    rev=temp+rev*10;  // rev=1      //rev= 2+1*10=2+10=12   //  rev=1+12*10=1+120=121
		    no=no/10;         // no=12      //no=1                  //no=0
		}
		if(rev==comp)
		{
			System.out.println("Palendrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}

}
