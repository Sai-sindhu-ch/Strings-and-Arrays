import java.util.*;
import java.io.*;
public class CharToString {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of characters:");
		n=sc.nextInt();
		char[] a=new char[n];
		System.out.println("enter the characters:");
		for(int i=0;i<n;i++) {
			a[i]=sc.next().charAt(0);
		}
		String str=new String(a);
		System.out.println(str);
		
	}

}
