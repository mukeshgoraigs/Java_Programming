package P1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(10);
		list.add(10);
		System.out.println(list.size());
		list.remove(new Integer(10));
		System.out.println(list.size());
	}
}
