import java.util.*;
import java.lang.*;
public class OccurrenceOfChar {
	public static void main(String args[]) {
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		str=sc.nextLine();
		System.out.println("enter the character:");
		ch=sc.next().charAt(0);
		System.out.println(str.indexOf(ch));
	}

}
