
import java.util.Random;

public class MyLinkedList {

	private Node start;
	private int size;

	private class Node {
		int data;
		Node next;

		public Node(int input) {
			this.data = input;
			this.next = null;
		}
	}

	public MyLinkedList(int s) {
		Node temp = null;
		Random rng = new Random();
		for (int i = 0; i < s; i++) { // 0부터 s번만큼 반복하여 s개의 랜덤한 정수 생성
			if (size == 0) { // 만약 사이즈가 없다면, 아무것도 노드가 존재하지 않는다면 newNode가 첫번쨰 새로운 노드
				temp = new Node(rng.nextInt(20));
				start = temp;
				size++;
			} else {
				temp = temp.next = new Node(rng.nextInt(20));
				size++;
			}
		}
	}
	void removemultiples(int x) {

	      while(true){
	         Node p = start;
	         Node before = start;
	         if(p.data%x==0){//첫번쨰 노드에 배수있으면 잡기
	            start= start.next;
	            size--;
	            continue;
	         }
	         for(int i=0; i<size; i++){//여기오면 start는 배수가 아니다
	            if(p.data%x==0){//배수라면
	               for(int j=1; j<i;j++){//해당 노드 직전노드까지 이동
	                  before = before.next;
	               }
	               before.next = p.next;//제거
	               size--;//사이즈감소하고
	               break;//for문 탈출해서 다시 처음으로
	            }
	            if(p.next==null){//끝까지 온것이므로 함수종료
	               return;
	            }
	            p=p.next;//다음으로 이동
	         }
	      }
	}	      
	
	public void reverse() {	//리스트를 거꾸로 뒤집기
		Node p,c,n; //Node start를 참고하는 걸어나가는 참조 변수와 빈 Node를 생성하기 위한 노드 생성
		p = start; //p는 start를 참조
		c = null; //빈 노드를 생성한다(reverse를 만들기 위한 첫번쨰 노드)
		while(p != null) { //p가 null이 될때까지
			n = c; 
			c = p; //p를 참조하는 노드 c를 생성
			p = p.next; //p를 걸어나가게 하고
			c.next = n; //c의 next에 n의 Node를 가져와 연결시킨다
		}

		start = c; //마지막에 start를 옮겨줘서 null Node를 끊어내준다
	}

	      


	void print() {
		System.out.print("현재 리스트의 구조 : ");
		Node temp = start;
		for (int i = 0; i < size; i++) {
			if(temp.next != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}	
		}
		System.out.println(temp.data);
	}
	

}
