package P1;

import java.util.Scanner;

public class DuplicateString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the String: ");
	//	String s="mukeshgorai";
		//String s=sc.nextLine();
//		char c[]=s.toCharArray();
//		int size=c.length;
//		int i,j;
//		int count=0;
//		for (i = 0; i < size; ++i) {
//			count=0;
//			for (j = 0; j < size; ++j) {
//				if(c[j]==c[i])
//					count++;
//			}
//		}
//		System.out.println("the charactor of string "+c[i]+"is present of "+count+" times");
		int a[]=new int[26];
		System.out.println("Enter the number: ");
		String s=sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>=65&&s.charAt(i)<=90) {
				a[s.charAt(i)-65]++;
			}
			else if(s.charAt(i)>=97&&s.charAt(i)<=122) {
				a[s.charAt(i)-97]++;
			}
		}
		for (int i = 0; i <26; i++) {
			if(a[i]!=0)
			System.out.println((char)(i+65)+" "+a[i]);
		}
	}
}
