import java.util.*;
import java.io.*;
public class ConsonantCount {
	public static void main(String args[]) {
		String str;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
				count++;
			}
		}
		System.out.println("the number of consonants in string are=" +count);
	}

}
