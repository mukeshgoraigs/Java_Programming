package P1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		boolean flag=false;
//		if(n==0||n==1) {
//			System.out.println("Not a prime number");
//		}else
//		{
			for (int i = 2; i <=n/2; i++) {
				if(n%i==0)
					//System.out.println("not a prime number");
				flag=true;
				break;
			}
		//}
		if(!flag) {
			System.out.println("prime"
					+ " number");
		}
		else {
			System.out.println(" not prime");
		}
			
	}
}
