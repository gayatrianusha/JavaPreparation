import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionPractice {

	
	public static void main(String args[])
	{
		//Collections
		//ArrayList
		List<Integer>list=new ArrayList<Integer>();
		list.add(8);
		list.add(2);
		list.add(21);
		list.add(2);
		list.add(null);
		//Total Values in List
		System.out.println(list);
		//get specific value via index
		System.out.println(list.get(2));
		//add new value to list
		list.add(100);
		list.set(1, 10);
		System.out.println(list);
		//verify the value
		System.out.println(list.contains(21));
		//Delete the value
		list.remove(3);
		System.out.println(list);
		
		//HashSet
		Set<String>set=new HashSet<>();
		set.add("Mahesh");
		set.add("Rahesh");
		set.add("jahesh");
		set.add("wahesh");
		set.add("Mahesh");
		
		System.out.println(set);
		set.add(null);
		set.add(null);
		set.contains("Mahesh");
		System.out.println(set.contains("Mahesh"));
		set.remove("Rahesh");
		System.out.println(set);
		
		//HashMap
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(101, "gayatti");
		map.put(102, "Maham");
		map.put(103,"sds");
		System.out.println(map);
		System.out.println(map.entrySet());
		Set entry=map.entrySet();
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+"......."+m.getValue());
		}
		
		
		
		
	}
}
