package ����3����;

public class MainTest {
	public static void main (String args[]) {
		BigInt Big = new BigInt(5647322);
		System.out.println(Big);
		BigInt a = new BigInt(49340);
		BigInt b = new BigInt(634340);
		System.out.println("multiple(4)ȣ��");
		System.out.println(Big.multiple(4));
		System.out.println("a(�ڱ��ڽ�)�� b�� �� ��� : " + a.compareMe(b));
		System.out.println("b(�ڱ��ڽ�)�� a�� �� ��� : " + b.compareMe(a));
		
		
	}

}
