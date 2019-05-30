import java.util.*;
import java.lang.*;
public class StringReverse {
	public static void main(String args[]) {
		String str;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to reverse:");
		str=sc.next();
		n=str.length();
		String rev=" ";
		for(int i=n-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse of the string is=" + rev);
	}

}
