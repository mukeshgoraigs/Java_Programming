package P1;

import java.util.Scanner;

public class GrayCode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int s=0 ;
		int r;
		while(n!=0) {
			
			r=n%2;
			
			s=(s*10)+r;
			//n--;
			n=n/2;
			
		}
		System.out.println(s);
	}
}
