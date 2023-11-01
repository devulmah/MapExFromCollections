
package com.ct.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(122, "Akshay");
		map.put(123, "Rishi");
		map.put(124, "Sanju");
		map.put(126, "Karthik");
		map.put(125, "revanth");
		map.put(128, "naidu");
		map.put(127, "reshma");
		System.out.println(map);
	Set<Integer> keys = map.keySet();
		Iterator<Integer> Itr1 = keys.iterator();
		while (Itr1.hasNext()) {
			System.out.println(Itr1.next());
		}
		

		Set<Entry<Integer, String>> entries = map.entrySet();
		Iterator<Entry<Integer, String>> Itr = entries.iterator();
		while (Itr.hasNext()) {
			Entry<Integer, String> entry = Itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

	}

}
