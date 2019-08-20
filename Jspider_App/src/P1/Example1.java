package P1;

public class Example1 {

	public static void Example1Met(String x) {
		System.out.println("String");
	}
	public static void Example1Met(int i) {
		System.out.println("Int");
	}
	
public static void main(String[] args) {
	Example1Met(null);
}
}
