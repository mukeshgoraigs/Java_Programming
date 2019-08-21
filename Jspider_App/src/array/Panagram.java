package array;

import java.util.Scanner;

public class Panagram {

	static boolean isPanagram(String st) {
		int[] count=new int[26];
		char[] ch=st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>=65&&ch[i]<=90)
				count[ch[i]-65]++;
			if(ch[i]>=97&&ch[i]<=122)
				count[ch[i]-97]++;
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i]==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:-");
		String s=sc.nextLine();
		boolean rs=isPanagram(s);
		if(rs)
			System.out.println("panagram");
		else
			System.out.println("not");
	}
	
}
