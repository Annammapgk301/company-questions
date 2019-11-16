package questions;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int arm=0,r,num=n;
		while(n>0)
		{
		r=n%10;
		arm=(r*r*r)+arm;
		n=n/10;
		}
		if(num==arm)
		{
		System.out.println("Armstrong number");
		}
		else
		{
		System.out.println("Not Armstrong number");
		}
		}

}

