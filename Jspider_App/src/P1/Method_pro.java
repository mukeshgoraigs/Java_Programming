package P1;

public class Method_pro {
	public void m(String s) {
		System.out.println("Hi, I'm first");
	}
	public void m(Integer i) {
		System.out.println("Hi, I'm Second");
	}
	public void m(Object o) {
		System.out.println("Hi, I'm third");
	}
	public static void main(String[] args) {
		Method_pro t=new Method_pro();
		t.m("hi,i m 4");
		t.m(new Integer(1));
		t.m(2);
		//t.m(null);
		t.m("hi i m 5");
	}
}
