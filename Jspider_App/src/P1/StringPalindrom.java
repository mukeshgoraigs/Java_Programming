package P1;

import java.util.Scanner;

public class StringPalindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:-");
		String s=sc.nextLine();
		String s1="";
		String temp="";
		temp=s;
		for (int i = s.length()-1; i >=0; i--) {
			s1=s1+s.charAt(i);
		}
		if(s1.equals(temp)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a plindrome");
		}
	}
}
