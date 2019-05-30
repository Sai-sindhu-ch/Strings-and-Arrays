import java.util.*;
import java.io.*;
public class ReverseNumber {
	public static void main(String args[]) {
		int num,n,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to reverse:");
		n=sc.nextInt();
		while(n!=0) {
			num=n%10;
			rev=(rev*10)+num;
			n=n/10;
		}
		System.out.println("reverse of a number is=" + rev);
	}

}
