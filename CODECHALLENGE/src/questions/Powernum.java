package questions;
import java.util.Scanner;
public class Powernum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=sc.nextInt();
		int p=(int)Math.pow(num,n);
System.out.println(p);
	}

}
