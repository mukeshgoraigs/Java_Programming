package P1;

import java.util.Scanner;

public class Prac2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int sum=0;
		int i;
		int n=sc.nextInt();
		for (i = 0; i <=n; i++) {
			i=sc.nextInt();
			sum=sum+i;
		}
		System.out.println(i+" "+sum);
	
	}
}
