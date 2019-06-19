package Queue6주차;

public class Queue {
	
	LinkedLIst Linked;
	
	public Queue() {
		this.Linked = new LinkedLIst();
	}
	
	void add(Object o) { //삽입을 앞에서 하고 삭제를 뒤에서 하는 걸로 바꿔야함
		Node newNode = new Node(o);
		Linked.insert(newNode);
		//o를 값으로 하는 노드를 Queue에 삽입
	}
	Object remove() {
		return Linked.remove().getData();
	
		//큐에서 노드를 하나 삭제하고 값 반환
	}
	boolean empty() {
		if(Linked.getSize() == 0) {
			return true;
		} else {
			return false;
		}
		//큐가 비어있는지에 대한 여부 반환
	}
	Object first() {
		//현재 Queue에 맨 처음 삽입된 노드 값 반환
		return Linked.getStart().getData();
	}
	int size() {
		return Linked.getSize();
		//현재 Queue에 있는 원소의 개수를 반환
	}
}
