import java.util.*;
import java.lang.*;
public class ReverseArray {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array:");
		n=sc.nextInt();
		int a[]=new int[n];
		int rev[]=new int[n];
		System.out.println("enter numbers in array:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=n-1;i>=0;i--) {
			System.out.println(a[i]);
		}
			
	}

}
