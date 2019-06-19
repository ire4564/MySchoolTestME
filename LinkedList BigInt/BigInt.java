package 과제3주차;

public class BigInt {

	private Node start;
	public int size;
	
	private class Node {
		int data;
		Node next;

		public Node(int input) {
			this.data = input;
			this.next = null;
		}
	}
	public BigInt(int n) {
		if(n<0) throw new IllegalArgumentException(n+"<0");
		start = new Node(n%10);
		Node p = start;
		n /= 10;
		while (n>0) {
			p = p.next = new Node(n%10);
			n/= 10;
			size++;
			}
		}
	public BigInt(String s) {
		if (s.length() == 0)
			throw new IllegalArgumentException("empty string");
		start = new Node(digit(s, s.length()-1));
		Node p = start;
		for(int i = s.length()-2; i >= 0; i--)
			p = p.next = new Node(digit(s, i));
			size++;
	}
	
	private int digit(String s, int i) {
		String ss = s.substring(i, i+1);
		return Integer.parseInt(ss);
	}
	

	public int compareMe(BigInt y) {
		if(y.size > size) {  //에초에 size가 작을경우
			return -1;
		}
		if(y.size < size) { //자릿수(size)가 클 경우
			return 1;
		}
		if(y.size == size) { //자릿수가 같을 경우는 비교 시작
			Node temp1 = start;
			Node temp2 = y.start;
	
			for(int my =0; my<size; my++) {	
				temp1 = temp1.next;
				temp2 = temp2.next; //끝까지 temp1,2를 보내버리기
					}
				if(temp1.data > temp2.data) { //제일 첫번쨰 자리 비교시 
					return 1;
				} else if(temp1.data < temp2.data) { //작을 경우
					return -1;
				} else if(temp1.data == temp2.data) { //첫번쨰 자리가 같을 경우 두번쨰 자리 비교 시작
					temp1 = start;
					temp2 = y.start;
					for(int i=0; i<size-1; i++) {
						temp1=temp1.next;
						temp2=temp2.next;
					}if(temp1.data > temp2.data) { //두번쨰 자리 비교시 
						return 1;
					} else if(temp1.data < temp2.data) { //작을 경우
						return -1;
					} 
				}
			}
		return 0;
	}
		//y와 크기를 비교
		//y보다 크면 1
		//y와 같으면 0
		//y보다 작으면 -1을 리
	
	public BigInt multiple(int k) {
		
		//숫자의 크기를 k배 한 값을 BigInt class타입으로 리턴
		Node temp = start; //start를 참고하는 temp 생성
		int o_num = temp.data * k; //기존 데이터에 곱하기 k배를 한다
		
		BigInt num10 = new BigInt(o_num%10); //계산한 자릿수들 중에 10의 자리를 추출해서 저장
		Node r = num10.start; //start Node 설정
		temp = temp.next; //temp 이동
		
		while(temp != null) { //temp가 null이 아닐떄까지 실행
			o_num = o_num/10 + temp.data * k; //저장된 십의자리 숫자랑 새로 k배한 숫자 더하기
			r.next = new Node(o_num%10); //나눈 나머지(일의자리 숫자)만 노드 바로 생성해서 연결하기
			temp = temp.next; 
			r = r.next;
		}
		
		o_num/=10;
		while(o_num > 0) { //size만큼 실행하고 남은 십의자리수 처리
			r = r.next = new Node(o_num%10); //마지막 남은 수 맨앞에 붙이기
			o_num/=10; 
		}
		return num10; 
	
	}
	
	
	public String toString() {
		if(start == null) {
			return "[]";
		}
		Node temp = start;
		String str = "현재 저장된 숫자 : ";
		String num = "";
		
		while(temp.next != null) {

			num = temp.data + num;
			temp = temp.next;
		}
		str += temp.data + num;
		
		return str + "";
	
	}
}
