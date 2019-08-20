package P1;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		int t=n;
		while(n!=0) {
			int r=n%10;
			sum=r+sum*10;
			n=n/10;
		}
		if(sum==t) {
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("not");
		}
	}
}
