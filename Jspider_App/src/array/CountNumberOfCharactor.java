package array;

import java.util.Scanner;

public class CountNumberOfCharactor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentence:- ");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int[] count=new int[128];
		for (int i = 0; i < c.length; i++) {
			{
				//if(c[i]>=65&&c[i]<=90)
				count[c[i]]++;
			}
		}
			for (int j = 0; j < count.length; j++) {
				//if(c[i]>=65&&c[i]<=90)
				if(count[j]!=0)
					System.out.println((char)j+"-->"+count[j]);
			}
		}
	}

