package com.chainsys.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHashMapDemo {
	public static void main(String args[])
	{
		usingGenericMapDemoA();
	}
public static void usingGenericMapDemoA() {
        
        HashMap<String, String> secondMap=new HashMap<String, String> ();
        System.out.println("Size "+secondMap.size()); secondMap.put ("k1", "ABcd");
        secondMap.put ("k2", "ABcd"); secondMap.put ("k3", "ABcd");
        secondMap.put ("k4", "ABcd"); System.out.println("Size "+secondMap.size());
        Set<Map.Entry<String, String>> setofMapEntry = secondMap.entrySet ();
        Iterator<Map.Entry<String, String>> mapIterator = setofMapEntry.iterator ();
        while (mapIterator.hasNext ())
        {
        Map.Entry<String, String> mapEntry =
        (Map.Entry<String, String>) mapIterator.next(); 
        System.out.print (mapEntry.getKey() + ": ");
        System.out.println (mapEntry.getValue () );
        }
	}
}
