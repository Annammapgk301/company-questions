package questions;
import java.util.Scanner;
public class Sumofprime {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int s1=sc.nextInt();
int s2=sc.nextInt();
int sum=0;
for(int i=s1;i<=s2;i++)
{
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			sum=sum+i;
		}
	}
}
System.out.println(sum);
	}}


