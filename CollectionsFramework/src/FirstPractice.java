import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FirstPractice {
	
	public static void main(String[] args) {
		
		List ls=new ArrayList();
		
		List ls1 =new LinkedList();
		ls1.add("Puneeth");
		ls1.add("Puneeth2");
		ls1.add("Dude ");
		
		Iterator itr =ls1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("");
		
		for (int i=0; i<ls1.size(); i++)
		{
			
			System.out.println(ls1.get(i));
		}
		
		HashMap objhashmap=new HashMap<String, String>();
		String s="Puneeth=Puni=Test=test2";
		
		String [] s1=s.split("=");
		
	for (String string : s1) {
		
		System.out.println(string);
		objhashmap.put(string, string);
	}
		System.out.println(objhashmap);
		
		
	}

}
