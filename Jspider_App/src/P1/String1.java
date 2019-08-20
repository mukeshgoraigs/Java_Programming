package P1;

public class String1 {
	public static void main(String[] args) {
		String s1="Merit";
		String s2="Merit";
		String s3=new String("Merit");
		if(s1==s2) {
			System.out.println("s1,s2 both are equal");
		}
		if(s1==s3) {
			System.out.println("s1,s3 both are equal");
		}
		if(s2==s3) {
			System.out.println("s2,s3 both are same");
		}
	}
}
