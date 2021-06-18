package Pack2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Pack1.Class2;

public class Class4 {
	
	public static void main(String[] args) {
		
//		ArrayList arr = new ArrayList();  // normal object
//		
//		arr.add("Velocity");
//		
//		arr.get(0);
//		
//		List list = new ArrayList();  // up Cast
//		
//		list.add("Class");
		
		
		
//		HashSet<String> hasSet =  new HashSet<String>();
//		
//		hasSet.add("Velocity");
//		hasSet.add("Class");
//		hasSet.add("Feb Batch");
//		hasSet.add("Z");
//		hasSet.add("X");
//		
//		
//		Iterator<String> i = hasSet.iterator();  // 
//		
//		for(String s : hasSet) {
//			System.out.println(i.next());
//		}
//	
//		System.out.println("--------------------");
//		
//		i = hasSet.iterator();
//		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
		
		
		
		
//		HashMap<Key,Data> hashMap = new HashMap<Integer,String>();
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(20, null);
		hashMap.put(null, "Class");
		hashMap.put(40, "Feb");
		hashMap.put(25, null);
		hashMap.put(null, "Batch");
		
		for(Map.Entry<Integer, String> e : hashMap.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		Hashtable<Integer,String> hashTable = new Hashtable<Integer,String>();
		
		hashTable.put(20, "loginusername");
		hashTable.put(69, "passsword");
		hashTable.put(40, "");
		hashTable.put(25, "2021");
		hashTable.put(35, "Batch");
		
		for(Map.Entry<Integer, String> e : hashTable.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	}


