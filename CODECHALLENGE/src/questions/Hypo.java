package questions;
import java.util.Scanner;
public class Hypo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int sq=(s1*s1)+(s2*s2);
		double hypo=(double) Math.sqrt(sq);
		System.out.println(hypo);
	}

}
