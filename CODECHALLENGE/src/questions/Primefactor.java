package questions;
import java.util.Scanner;
public class Primefactor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i;
		System.out.println("number");
		num=sc.nextInt();
		for(i=2;i<num;i++)
		{
			while(num%i==0)
			{
				System.out.println(i+"");
				num=num/i;
			}
		}
		if(num>2)
		{
			System.out.println(num);
		}
	}

}
