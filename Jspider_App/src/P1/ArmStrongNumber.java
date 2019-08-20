package P1;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0,c=0;
		int t1=n;
		while(t1!=0) {
			t1=t1/10;
			c=c+1;
			
		}
		int t2=n;
		int arm=0;
		while(t2!=0) {
			int mul=1;
			int rem=t2%10;
		
			for (int i = 0; i < c; i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		
		}
		if(arm==n)
			System.out.println("armstrong");
		else
			System.out.println("not");
		
	}
}
