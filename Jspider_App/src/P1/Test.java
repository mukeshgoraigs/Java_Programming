package P1;

public class Test {
	private static int increment(int i) {
		int num=(++i)+(i++);
		return num;
	}
	public static void main(String[] args) {
	for (int i = 0; i < 5; increment(i)) {
		System.out.print(i);
	}
	}
}
