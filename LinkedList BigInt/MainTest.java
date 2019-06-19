package 과제3주차;

public class MainTest {
	public static void main (String args[]) {
		BigInt Big = new BigInt(5647322);
		System.out.println(Big);
		BigInt a = new BigInt(49340);
		BigInt b = new BigInt(634340);
		System.out.println("multiple(4)호출");
		System.out.println(Big.multiple(4));
		System.out.println("a(자기자신)과 b의 비교 결과 : " + a.compareMe(b));
		System.out.println("b(자기자신)과 a의 비교 결과 : " + b.compareMe(a));
		
		
	}

}
