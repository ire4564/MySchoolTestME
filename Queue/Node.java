package Queue6ÁÖÂ÷;

public class Node {
	
	Node next;
	Object data;
	Node pre;
	
	public Node(Object data2) {
		data = data2;
		next = null;
		pre = null;
	}
	public Node getNext() {
		return next;
	}
	public Node getPrev() {
		return pre;
	}
	public Object getData() {
		return data;
	}
	public void setNext(Node node) {
		next = node;
	}
	public void setPrev(Node node) {
		pre = node;
	}
	public void setData(Object obj) {
		data = obj;
	}

}
