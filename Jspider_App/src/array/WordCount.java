package array;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Sentence:-");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int wc=0;
		for (int i = 0; i < c.length; i++) {
			if(i==0&&c[i]!=' '||c[i]!=' '&&c[i-1]==' ')
				
				wc++;
		}
		System.out.println("Number of words:- "+wc);
	}
}
