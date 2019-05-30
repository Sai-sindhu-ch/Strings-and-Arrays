import java.util.*;
import java.io.*;
public class ArraySort {
	public static void main(String args[]) {
		String str;
		int n;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		n=str.length();
		char c[]=str.toCharArray();
	    for(int i=0;i<n-1;i++) {
	    	for(int j=i+1;j<n;j++) {
	    		if(c[i]>(c[j])) {
	    			temp=c[i];
	    			c[i]=c[j];
	    			c[j]=temp;
	    		}
	    		
	    	}
	    	
	    }
	    for(int i=0;i<n;i++)
	    System.out.println(c[i]);
	}

}
