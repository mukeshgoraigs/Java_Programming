package array;

import java.util.Scanner;

public class NumberInEachWord {
	public static void main(String[] args) throws RuntimeException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:-");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int count=0;
		for (int i = 0; i < c.length-1; i++) {
			if(i==0&&c[i]!=' '||c[i]!=' '&&c[i-1]==' ') {
				String w="";
				while(i<c.length&&c[i]!=' ')
				{
					w=w+c[i];

					i++;
				}
//				if(w.length()>w.length()-1) {
//					
//					System.out.println(w.length()-1);
//				   
//				}
			System.out.println(w+"->"+w.length());
			}
		}
	}
}
