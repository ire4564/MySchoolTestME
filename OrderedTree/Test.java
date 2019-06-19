import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String args[]) {
		
		/****************트리 생성 *************/
		OrderedTree tree_D, tree_E, tree_B, tree_A, tree_C;
		
		OrderedTree tree_H = new OrderedTree("66");
		OrderedTree tree_G = new OrderedTree("22");
		OrderedTree tree_F = new OrderedTree("88");
		
		List subtreesOf_D = new LinkedList();
		subtreesOf_D.add(tree_G);
		tree_D = new OrderedTree("33", subtreesOf_D);
		
		List subtreesOf_E = new LinkedList();
		subtreesOf_E.add(tree_H);
		tree_E = new OrderedTree("55", subtreesOf_E);
		
		List subtreesOf_B = new LinkedList();
		subtreesOf_B.add(tree_D);
		subtreesOf_B.add(tree_E);
		tree_B = new OrderedTree("44", subtreesOf_B);
		
		List subtreesOf_C = new LinkedList();
		subtreesOf_C.add(tree_F);
		tree_C = new OrderedTree("99", subtreesOf_C);
		
		List subtreesOf_A = new LinkedList();
		subtreesOf_A.add(tree_B);
		subtreesOf_A.add(tree_C);
		tree_A = new OrderedTree("77", subtreesOf_A);
		
		OrderedTree mytree = new OrderedTree();
		System.out.print("트리 접근 순서 결과 : ");
		mytree.levelorder(tree_A);
	
		}	

}
