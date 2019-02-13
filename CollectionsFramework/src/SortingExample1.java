import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample1 {

	public static void main(String[] args) {
		List ls = new ArrayList<Integer>();
		ls.add(108);
		ls.add(102);
		ls.add(109);
		ls.add(104);
		ls.add(105);
		
		Collections.sort(ls);
		System.out.println(ls);
	}
}
