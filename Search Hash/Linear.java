package week6Homework;


public class Linear{
	
	private final Entry NIL = new Entry (null, 0);
	private Entry[] entries;
	private Entry[] Entries;
	private double loadFactor;
	private int size, used = 0;
	private int fin = 0;
	
	public Linear(int capacity, float loadFactor) { 
		entries = new Entry[capacity];
		this.loadFactor = loadFactor;
	}
	
	public Linear(int capacity) {
		this(capacity, 0.75F);
	}
	
	public Linear() { 
		loadFactor = 0.75;
		entries = new Entry[11];
	}
	
	private class Entry {
		Object key;
		int value;
		
		Entry (Object k, int v) {
			key = k; value = v;
		}
	}
	
	private int hash(Object key) {
		return (key.hashCode() & 0x7FFFFFFF) % entries.length;
	}
	
	
	public Object get(Object key) {

		int h = hash(key);
		for(int i = 0; i < entries.length; i++) {
			int j = (h+i)%entries.length;
			Entry entry = entries[j];
			if(entry == null) 
				break;

			if(entry.key.equals(key)) 
				return entry.value;
		}
		return null;
	}
	
	public Object Linear_put(Object key, int value) { //선형조사 알고리즘
		
		if(loadFactor*entries.length < size) 
			//rehash
			rehash();
		
		int h = hash(key);
		for(int i = 0; i < entries.length; i++) {
			int j = (h+i)%entries.length; //선형조사 알고리즘
			Entry entry = entries[j];
			if(entry == null) {
				entries[j] = new Entry(key, value);
				++size;
				//++used;
				return null; //삽입 완료
				
			} //if(entry == NIL) continue; 
		
			if(entries[j].key.equals(key)) {
				//key가 동일하면 빈도수 올리고
				Object oldValue = entry.value;
				entry.value++;
				return oldValue;
				
			} else if(!entries[j].equals(key)) { //충돌 횟수 카운트
				fin++;
			}//key가 다르면 충돌!	
		}
		return null;
	}
	
	public int crash() {
		return fin;
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

	public int size() {
		return size;
	}
	
	public int fin() {
		return fin;
	}
	

}
