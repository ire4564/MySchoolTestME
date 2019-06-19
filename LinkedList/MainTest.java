
public class MainTest {
	public static void main (String args[]) {
		MyLinkedList ma = new MyLinkedList(5);
		ma.print();
		ma.removemultiples(3);
		System.out.println("removemultipels(3)호출");
		ma.print();
		System.out.println("reverse()호출");
		ma.reverse();
		ma.print();
	}

}
