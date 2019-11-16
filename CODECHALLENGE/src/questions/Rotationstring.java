package questions;
import java.util.Scanner;
public class Rotationstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		if(str1.length()==str2.length())
		{
			String str3=str1+str2;
		if(str3.contains(str2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	}
}

