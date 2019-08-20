package array;

public class kThElementFind {
	public static void main(String[] args) {
		int[] a= {89,4,5,7,90,6,76,54,57};
		int k=4;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println(a[i]);
				break;
			}
		}
	}
}
