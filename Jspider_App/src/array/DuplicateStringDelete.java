package array;

public class DuplicateStringDelete {
	public static void main(String[] args) {
		String a= "mukeshgoraiaaamukesh";
		String s="";
		for (int i = 0; i <a.length()-1; i++) {
			char c=a.charAt(i);
			char c1=a.charAt(i+1);
			if(c!=c1) {
				s=s+c;
			}
		
		
		}
		System.out.println(s);
	}
}
