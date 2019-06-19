package week8Homework;

public class HashTable_Closed {
	private final Entry NIL = new Entry (null, 0, null); //엔트리가 remove로 인해 지워졌을 경우 처리 
	private Entry[] entries; //엔트리1 생성
	private Entry[] Entries; //엔트리2 생성
	private int size; //사이즈 측정을 위한 변수
	private float loadFactor;
	
	public HashTable_Closed(int capacity, float loadFactor) { 
		entries = new Entry[capacity];
		this.loadFactor = loadFactor;
	}
	
	public HashTable_Closed(int capacity) {
		this(capacity, 0.75F);
	}
	
	public HashTable_Closed() { 
		this(20);
	}
	
	private class Entry { //엔트리 기본 설정
		Object key, value; //키 값과 기존 데이터 값(value)
		public Entry next; //체이닝을 하기 위한 next 생성
		
		Entry (Object k, Object v, Entry n) { 
			key = k; value = v;
			next = n;
		}
		public String toString() { //String 처리
			return key + "=" + value;
		}
	}
	
	private int hash(Object key) { 
		if (key == null) //만약 key가 null일 경우
			throw new IllegalArgumentException(); ;//처리
			return (key.hashCode() & 0x7FFFFFFF) % entries.length; //그게 아니라면 해쉬값 리턴하기
	}
	
	private void rehash() { //공간이 없을 경우 rehash를 이용해 배열 크기 늘려주기
		Entry[] oldEntries = entries;
		Entries = new Entry[2*oldEntries.length+1];
		for(int k = 0; k<oldEntries.length; k++) {
			Entry entry = oldEntries[k];
			if(entry == null || entry == NIL) continue;
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
	

	public Object get(Object key) { //확인하기
		int h = hash(key); //h는 hash값
		for(Entry e = entries[h]; e != null; e = e.next) { //만약 e가 비어있지 않을 경우 확인하는 단계
			if (e.key.equals(key))return e.value; //탐색 성공
		}
		return null; //찾지 못했을 경우
	}
	
	public Object put(Object key, Object value) { //삽입하기
		int h = hash(key);
		for(Entry e  = entries[h]; e != null; e = e.next) { //비어있지 않을 경우
			if(e.key.equals(key)) { //key가 찾는 키와 같을 경우에는
				Object oldValue = e.value; //그냥 value 값만 갱신하기
				e.value += " ," + value;
				return oldValue; 
			}
		}
		
		entries[h] = new Entry(key, value, entries[h]);
			++size;
			if(size > loadFactor*entries.length) rehash(); //제한 범위를 넘었을 경우 rehash 설정
			return null;
		}
	
	public Object remove (Object key) { //지우는 동작 *현재에서는 필요 없지만 미리 만들어둠
		int h = hash(key);
		for(Entry e = entries[h], prev = null; e != null; prev = e, e= e.next) {
			if(e.key.equals(key)) {
				Object oldValue = e.value;
				if(prev == null) entries[h] = e.next;
				else prev.next = e.next;
				--size;
				return oldValue;
			}
		}
		return null;
	}
	
	public int size() { //사이즈 리턴
		return size;
	}
}


