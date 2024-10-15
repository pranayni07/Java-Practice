package logicalPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapStudy {

	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String> ();
		
		//put command---To add elements in HashMap
		hm.put("MH12","Pune");
		hm.put("MH14","PCMC");
		hm.put("MH29","Yavatmal");
		hm.put("MH13", "Solapur");
		
		System.out.println(hm);
		
		//get command---To fetch elements in HashMap using proper key
		System.out.println(hm.get("MH12"));

		//containsKey command---To make sure is this key present in HashMap
		System.out.println(hm.containsKey("MH29"));
		
		//containsValue command---To make sure is this value present in HashMap
		System.out.println(hm.containsValue("Yavatmal"));
		
		Set<Entry<String,String>> mySet=hm.entrySet();
		for(Entry<String, String> m:mySet)
		{
			System.out.println(m);
		}
	}

}
