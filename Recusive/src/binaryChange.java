
public class binaryChange {
		

	public void binary(int num){
		
		int remain = num%2;
		
		if(num >= 2) {
			binary(num/2);
		}
		System.out.print(remain);
		
	}
	
	public void binary_count(int num, int count) {
	
		if(num >= 2) { //�Լ��� �� ������ ������ 
			binary_count(num/2, ++count);
		}
		else if(num/2 == 0) {
			System.out.println("");
			System.out.println("���� Ƚ�� : " + count);
		}
	}

}

