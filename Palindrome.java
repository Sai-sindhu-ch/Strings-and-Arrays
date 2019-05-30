import java.util.*;
import java.io.*;
public class Palindrome {
	public static void main(String args[]) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		str=sc.next();
		int n=str.length();
		String rev="";
		for(int i=n-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
			System.out.println(rev);
			int x=str.compareTo(rev);
				if(x==0)
					System.out.println("string is palindrome");
				else 
					System.out.println("string is not palindrome");
	}
}
