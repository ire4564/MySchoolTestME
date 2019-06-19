package Queue6����;

public class Queue {
	
	LinkedLIst Linked;
	
	public Queue() {
		this.Linked = new LinkedLIst();
	}
	
	void add(Object o) { //������ �տ��� �ϰ� ������ �ڿ��� �ϴ� �ɷ� �ٲ����
		Node newNode = new Node(o);
		Linked.insert(newNode);
		//o�� ������ �ϴ� ��带 Queue�� ����
	}
	Object remove() {
		return Linked.remove().getData();
	
		//ť���� ��带 �ϳ� �����ϰ� �� ��ȯ
	}
	boolean empty() {
		if(Linked.getSize() == 0) {
			return true;
		} else {
			return false;
		}
		//ť�� ����ִ����� ���� ���� ��ȯ
	}
	Object first() {
		//���� Queue�� �� ó�� ���Ե� ��� �� ��ȯ
		return Linked.getStart().getData();
	}
	int size() {
		return Linked.getSize();
		//���� Queue�� �ִ� ������ ������ ��ȯ
	}
}
