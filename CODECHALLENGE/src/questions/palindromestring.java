package questions;
import java.util.Scanner;
public class palindromestring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str,rev="" ;
		System.out.println("Enter the string:");
		   str=sc.next();

		int length=str.length();
		int i;
		for(i=length-1;i>=0;i--)

		rev=rev+str.charAt(i);

		if(str.contentEquals(rev))
		{
		System.out.println("String is Palindrome");
		}
		else
		{
		System.out.println("String is not Palindrome");
		}

		}

		


	}

