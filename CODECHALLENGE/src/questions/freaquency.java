package questions;
import java.util.Scanner;
public class freaquency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=sc.next().charAt(0);
		int freaquency=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				freaquency++;
				
			}
		}
		System.out.println(freaquency);
	}

}
