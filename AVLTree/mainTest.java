package AVLTree;

public class mainTest {
	public static void main (String args[]) {
		
		System.out.println("飘府甫 积己钦聪促.");
		
		AVLTree avl = new AVLTree(14);
		
		avl.grow(17);
		avl.grow(11);
		avl.grow(7);
		avl.grow(53);
		avl.grow(4);
		avl.grow(13);
		avl.grow(12);
		avl.grow(8);

		System.out.println("积己等 飘府 : " + avl.toString());
		
		System.out.println("53 昏力 : " + avl.remove(avl, 53).toString());
		System.out.println("11 昏力 : " + avl.remove(avl, 11).toString());
		System.out.println("7 昏力 : " + avl.remove(avl, 7).toString());
		System.out.println("12 昏力 : " + avl.remove(avl, 12).toString());
		System.out.println("14 昏力 : " + avl.remove(avl, 14).toString());
		System.out.println("13 昏力 : " + avl.remove(avl, 13).toString());
	}

}
