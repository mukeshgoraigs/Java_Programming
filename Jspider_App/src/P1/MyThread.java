package P1;

public class MyThread {
	public static void main(String[] args) {
		Mthread m=new Mthread();
		m.run();
		for (int i = 0; i <10; i++) {
			System.out.println("Main Thread");
		}
	}
}
 class Mthread extends MyThread{
	 public void run() {
		 for (int i = 0; i <10; i++) {
			System.out.println("Child Thread");
		}
	 }
}