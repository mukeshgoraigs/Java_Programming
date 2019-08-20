package P1;

public class Test1 {
	public static void main(String[] args) {
		System.out.println(m(100));
	}
	private static int m(int i) {
		try {
			System.out.println("Hi i MA try");
			int x=i/0;
			return x;
		}catch (Exception e) {
			System.out.println("hi i am catch");
		}finally {
			System.out.println("hi am finally");
		}
		return i;
	}
}
