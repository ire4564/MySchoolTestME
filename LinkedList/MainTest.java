
public class MainTest {
	public static void main (String args[]) {
		MyLinkedList ma = new MyLinkedList(5);
		ma.print();
		ma.removemultiples(3);
		System.out.println("removemultipels(3)ȣ��");
		ma.print();
		System.out.println("reverse()ȣ��");
		ma.reverse();
		ma.print();
	}

}
