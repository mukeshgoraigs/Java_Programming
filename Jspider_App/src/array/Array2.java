package array;

public class Array2 {
	public static void main(String[] args) {
//		int[][] a=new int[2][3];
//		a[0][0]=5;
//		a[0][1]=6;
//		a[0][2]=7;
//		a[1][0]=1;
//		a[1][1]=2;
//		a[1][2]=3;
		int[][] a={{1,2,3,4},{1,3,5},{5,6,7,8,9}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
