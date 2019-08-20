package array;

public class StringSelectionSort {
	public static void main(String[] args) {
		String[] a= {"mukesh","pawan","rishav","amit"};
		int min=0;
		String temp="";
		for (int i = 0; i < a.length; i++) {
			min=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j].compareTo(a[min])<0) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
