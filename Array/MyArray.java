import java.util.Arrays;
import java.util.Random;

class MyArray {
		
	public int size = 10; //���Ұ���
	public int[] a = new int[size];
	int[] b = new int[size*2];
	
	public void makelist() {
		Random rng = new Random();
		for(int i=0; i<10; i++) {
			a[i] = rng.nextInt(100);
		}
	}

	public void removemultiples(int x) {
		for(int i=0;i<10;i++) { //�迭�����߿���
			if((a[i]%x)==0) { //2�� ����� ã����
				System.arraycopy(a, i+1, a, i, size-(i+1));
				size--;
				}
			}
		for(int i=0;i<10;i++) { //�ߺ��� ���ֱ� ���ؼ� 
			if((a[i]%x)==0) { 
				System.arraycopy(a, i+1, a, i, size-(i+1));
				size--;
				}
			}
		}
		// ����
		//size ���� ����
	public void doublelength() {
		//���� �迭���� 2�� ū �迭 ����
		//a�� ���� ���� �� ����
		System.arraycopy(a, 0, b, 0, size);
		a=b;
		
	}

	public void print() {
		System.out.println("������ �迭 a�� ������ �����ϴ�.");
		System.out.print("�迭�� ���� : ");
		for (int i=0; i<size; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println(" | �迭�� ũ�� : " + a.length);
		//�迭 a ����
	}
	
	public void print2() {
		System.out.println("�迭 a�� 2�� ����� ��� �����մϴ�.");
		System.out.print("�迭�� ���� : ");
		for (int i=0; i<size; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println(" | �迭�� ũ�� : " + a.length);
		//�迭 a ����
	
	//a.length ���
	}
	
	public void print3() {
			System.out.println("�迭 a�� ������ �� �� Ȯ���մϴ�.");
			System.out.print("�迭�� ���� : ");
			for (int i=0; i<size; i++) {
				System.out.print(a[i]+ " ");
			}
			System.out.println(" | �迭�� ũ�� : " + b.length);
			//�迭 a ����
		
		//a.length ���
		}
	}



