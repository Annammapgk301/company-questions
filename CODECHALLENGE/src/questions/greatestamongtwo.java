package questions;
import java.util.Scanner;
public class greatestamongtwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		if(n1>n2 && n1>n3)
		{
		System.out.print(n1+" is biggest");
		}
		else if(n2>n1 && n2>n3)
		{
		System.out.println(n2+"  is biggest");
		}
		else
		{
		System.out.println(n3 +"  is biggest");
		}

		}

	}


