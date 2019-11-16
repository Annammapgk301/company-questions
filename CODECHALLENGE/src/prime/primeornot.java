package prime;
import java.util.Scanner;
public class primeornot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int flag=0;
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println(" prime");
		}
	}

}
