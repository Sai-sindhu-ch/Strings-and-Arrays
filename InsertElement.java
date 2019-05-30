import java.util.*;
import java.io.*;
public class InsertElement {
	public static void main(String args[]) {
		int n,m,pos;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements in an array:");
		for(int i=0;i<=n-1;i++) 
			a[i]=sc.nextInt();
		System.out.println("enter index position to insert an element:");
		pos=sc.nextInt();
		System.out.println("enter an element:");
		m=sc.nextInt();
		for(int i=n-1;i<pos;i--) {
			a[i]=a[i-1];
		}
		a[pos]=m;
		for(int i=0;i<=n-1;i++)
		System.out.println(a[i]);
	}
}
