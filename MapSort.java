package com.ct.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapSort {

	public static void main(String[] args) {
	TreeMap<Integer,String>map=new TreeMap<Integer,String>();
	map.put(88, "chintu");
	map.put(99, "rakhi");
	map.put(77, "pinku");
	Set<Entry<Integer, String>> entries = map.entrySet();
	
	Iterator<Entry<Integer, String>> itr=entries.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	for(Entry itr2:itr) 
{
system.out.println( itr2);
		
	}
	
	
	

	}
	

}
