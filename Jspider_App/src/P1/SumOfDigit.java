package P1;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence:-");
		String str=sc.nextLine();
		int sum=0;
		char ch[]=str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if(ch[i]>=48&&ch[i]<=57)
				sum=sum+ch[i]-48;
		}
		System.out.println(sum);
	}
}
