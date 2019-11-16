package questions;
import java.util.Scanner;
public class Strongnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int a=n;
		int m;
		int f;
		int i;
		int sm=0;
		while(n!=0)
		{
		f=1;
		m=n%10;
		for(i=1;i<=m;i++)
		{
		f=f*i;
		}
		sm=sm+f;
		n=n/10;
		}
		if(sm==a)
		System.out.print("Strong number");
		else
		System.out.print("Not Strong number");

		}

	}


