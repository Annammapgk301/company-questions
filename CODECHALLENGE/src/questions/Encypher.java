package questions;
import java.util.Scanner;
public class Encypher {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		int b=s.nextInt();
		int c=(int)a;
		int d=c+b;
		System.out.println((char)d);

	}

}
