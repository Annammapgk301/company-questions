package questions;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Principal amount");
		int p=sc.nextInt();
		System.out.println("Rate per annum");
		int r=sc.nextInt();
		System.out.println("Time in year");
		int t=sc.nextInt();
		double I=(p*r*t)/100;
		System.out.println("simple interest "+I);
		
	}

}
