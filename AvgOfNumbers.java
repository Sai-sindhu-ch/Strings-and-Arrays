import java.util.*;
import java.io.*;
public class AvgOfNumbers {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of integers :");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter integers in an array:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		double avg=sum/n;
		System.out.println("avg=" +avg);
	}

}
