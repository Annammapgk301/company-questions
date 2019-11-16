package string;
import java.util.Scanner;
public class removevowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		str=str.replaceAll("[AaEeIiOoUu]","");
		System.out.println(str);

	
	}

}
