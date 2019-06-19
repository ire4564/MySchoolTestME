
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
		for (int i = 0; i < s; i++) { // 0���� s����ŭ �ݺ��Ͽ� s���� ������ ���� ����
			if (size == 0) { // ���� ����� ���ٸ�, �ƹ��͵� ��尡 �������� �ʴ´ٸ� newNode�� ù���� ���ο� ���
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
	         if(p.data%x==0){//ù���� ��忡 ��������� ���
	            start= start.next;
	            size--;
	            continue;
	         }
	         for(int i=0; i<size; i++){//������� start�� ����� �ƴϴ�
	            if(p.data%x==0){//������
	               for(int j=1; j<i;j++){//�ش� ��� ���������� �̵�
	                  before = before.next;
	               }
	               before.next = p.next;//����
	               size--;//��������ϰ�
	               break;//for�� Ż���ؼ� �ٽ� ó������
	            }
	            if(p.next==null){//������ �°��̹Ƿ� �Լ�����
	               return;
	            }
	            p=p.next;//�������� �̵�
	         }
	      }
	}	      
	
	public void reverse() {	//����Ʈ�� �Ųٷ� ������
		Node p,c,n; //Node start�� �����ϴ� �ɾ���� ���� ������ �� Node�� �����ϱ� ���� ��� ����
		p = start; //p�� start�� ����
		c = null; //�� ��带 �����Ѵ�(reverse�� ����� ���� ù���� ���)
		while(p != null) { //p�� null�� �ɶ�����
			n = c; 
			c = p; //p�� �����ϴ� ��� c�� ����
			p = p.next; //p�� �ɾ���� �ϰ�
			c.next = n; //c�� next�� n�� Node�� ������ �����Ų��
		}

		start = c; //�������� start�� �Ű��༭ null Node�� ����ش�
	}

	      


	void print() {
		System.out.print("���� ����Ʈ�� ���� : ");
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
