package Queue6주차;

public class LinkedLIst {
	
	private Node start;
	private int size;
	
	public void insert(Node node) {
		if(size == 0) {
			start = node;
			
		}else if(size == 1) {//처음 노드를 삽입할 때
			//새로운 노드는 new node
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
				p = p.getPrev(); //한칸 뒤로 가서
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
