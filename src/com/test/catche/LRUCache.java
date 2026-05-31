package com.test.catche;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K, V>{
	private final int capacity;
	public LRUCache(int capacity){
		
		super(capacity,0.75f ,true);
		
		this.capacity = capacity ;
		
	}
	
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > capacity ;
	}

	public static void main(String[] args) {

		 LRUCache<Integer, String> lruCache = new LRUCache<>(3);
		 lruCache.put(1, "A");
		 lruCache.put(2, "B");
		 lruCache.put(3, "C");
		 
		 lruCache.get(1);
		 
		 lruCache.put(4,"D");
		 lruCache.get(1);
		 
		 lruCache.put(5,"E");
		 
		 System.out.println(lruCache);
		
	}

}
