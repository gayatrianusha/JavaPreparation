import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTable1 {

	public static void main(String arg[])
	{
		//HashTable
		Map<Integer,String>map= new Hashtable<Integer,String>();
		map.put(101, "Gayatri");
		map.put(102, "Anusha");
		map.put(103, "Sajja");
		map.put(104,"sony");
		map.put(105,"Karthik");
		
		for(Map.Entry<Integer,String> m:map.entrySet())
		{
			System.out.println(m.getKey()+"............."+m.getValue());
		}
		
		//HashMap
		Map<Integer,String>map1=new HashMap<>();
		map1.put(1211,"12");
		map1.put(12131, "Ad");
		for(Map.Entry<Integer, String> m1:map1.entrySet())
		{
			System.out.println(m1.getKey()+"---------"+m1.getValue());
		}
	}
}
