package 과제4주차;
public class LinkedStack implements Stack{
	private Node top; //제일 위에 있는 스텍
	private int size; //연결된 노드 갯수
	public boolean isEmpty() { //만약 노드가 아무것도 없을 경우
		return (size == 0);
	}
	public Object peek() { //스택이 공백이 아니면 top의 원소를 리턴
		if(size == 0) throw new java.util.NoSuchElementException(); //하지만 만약 공백일 경우 출력
		return top.object; 
	}
	public Object pop() { //스택이 공백이 아니면 top의 원소를 삭제 후 리턴
		if(size == 0) throw new java.util.NoSuchElementException(); //하지만 만약 공백일 경우 처리
		Object oldTop = top.object; //oldTop이라는 변수를 생성해서 top의 오브젝트를 대입한다
		top = top.next; //그리도 다음으로 이동
		--size; //사이즈 감소하기
		return oldTop;
	}
	public void push(Object object) { //주어진 원소를 스택의 톱에 추가
		top = new Node(object, top); //새로운 top 노드를 생성하여 추가
		++size; //사이즈 증가
	}
	public int size() { //스택에 있는 원소 수 리턴
		return size;
	}
	private static class Node { //기본 연결리스트 설정
		Object object; 
		Node next;
		Node(Object object, Node next) {
			this.object = object;
			this.next = next;
		}
	}

}
