package week6Homework;


public class Square{ //제곱조사
	
	private final Entry NIL = new Entry (null, 0);
	private Entry[] entries;
	private Entry[] Entries;
	private double LoadFactor;
	private int size = 0;
	private int fin = 0;
	
	private class Entry {
		Object key;
		int value;
		
		Entry (Object k, int v) {
			key = k; value = v;
		}
	}
	public Square() {
		LoadFactor = 0.75;
		entries = new Entry[11];
	}
	
	public Object get(Object key) {
		
		int h = hash(key);
		for(int i = 0; i < entries.length; i++) {
			int j = (h+i)%entries.length;
			Entry entry = entries[j];
			if(entry == null) break;
			if(entry == NIL) continue;
			if(entry.key.equals(key)) return entry.value;
		}
		return null;
	}
	
	private int hash(Object key) {
		return (key.hashCode() & 0x7FFFFFFF) % entries.length;
	}
	
	private void rehash() {
		Entry[] oldEntries = entries;
		entries = new Entry[2*oldEntries.length+1];
		for(int k = 0; k<oldEntries.length; k++) {
			Entry entry = oldEntries[k];
			if(entry == null) 
				continue;
			
			int h = hash(entry.key);
			for(int i = 0; i < entries.length; i++) {
				int j = (h+i)%entries.length; 
				if(entries[j] == null) {
					entries[j] = entry;
					break;
				}
			}
		}
	}

	
	public Object Square_put(Object key, int value) { //제곱조사 알고리즘
		int h = hash(key); //테이블의 인덱스
		if(LoadFactor*entries.length < size) {
			//rehash
			rehash();
		}
		for(int i = 0; i < entries.length; i++) { 
			int j = (h+i*i)%entries.length; 
			Entry entry = entries[j];
			if(entry == null) { //삽입하기
				entries[j] = new Entry(key, 1);
				++size;
				return null;
			} if(entry == NIL) continue;
			if(entries[j].key.equals(key)) {
				//key가 동일하면 빈도수 올리고
				entries[j].value++;
			} else if(!entries[j].equals(key)) {
				fin++;
			}//key가 다르면 충돌!	
		}
		return null;
	}
	
	public int crash() {
		return fin;
	}

	public int size() {
		return size;
	}
	
	public int fin() {
		return fin;
	}
	
	public Object remove(Object key) {
		int h = hash(key);
		for (int i = 0; i<entries.length; i++) {
			int j = (h+i)%entries.length;
			if(entries[j] == null) break;
			if(entries[j].key.equals(key)) {
				Object value = entries[j].value;
				entries[j] = NIL;
				--size;
				return value;
			}
		}
		return null;
	}

}
