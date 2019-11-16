package questions;
import java.util.Scanner;
public class Arclength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		int r=sc.nextInt();
		System.out.println("Enter Angle");
		int angle=sc.nextInt();
		int arc=(int) (2*(3.14)*r*(angle/360));
		System.out.println("Arc Length is:"+arc);
		}
		}