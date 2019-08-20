package P1;

public class ConstructorDemo {
	static int count=0;
	public ConstructorDemo() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		ConstructorDemo c=new ConstructorDemo();
		ConstructorDemo c2=new ConstructorDemo();
	}
}
