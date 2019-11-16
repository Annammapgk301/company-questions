package questions;
import java.util.Scanner;
public class Lowercase {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				char ch=sc.next().charAt(0);
				int temp = 0;
				if(ch>'A' && ch<'Z')
				{
				temp=(int)ch;
					ch=(char) (temp+32);
					
				}
				System.out.println(ch);
					}

		

	}


