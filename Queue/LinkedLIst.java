package Queue6����;

public class LinkedLIst {
	
	private Node start;
	private int size;
	
	public void insert(Node node) {
		if(size == 0) {
			start = node;
			
		}else if(size == 1) {//ó�� ��带 ������ ��
			//���ο� ���� new node
			start.setNext(node);
			node.setPrev(start);
			start.setPrev(node);
			node.setNext(start);
		} else {
			node.setNext(start.getNext());
			node.setPrev(start);
			start.setNext(node);
			start.next.setPrev(node);
		}
		
		size++;
	}
	public LinkedLIst() {
		start = null;
	//	start.setNext(start);
	//	start.setPrev(start);
		size = 0;
	}
	
	public Node remove() {
		if(size == 0) {
			return null;
		} else{
			Node p = start;
			while(p.getNext() == start) {
				p = p.getPrev(); //��ĭ �ڷ� ����
				start.setPrev(p);
				p.setNext(start);
			}
			return p;
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public Node getStart() {
		return start;
	}

}
