package binarytree;

public class MainTest {
	public static void main(String args[]) {
		
		System.out.println("Tree(1)이 생성된 후 후위순회를 합니다.");
		
		BinaryTree btree = new BinaryTree(1);
		//root, 삽입할 원소들만 만듬
		
		btree.insert(3);
		btree.insert(5);
		btree.insert(7);
		btree.insert(9);
		//이진틀 생성
		
		btree.postorder(btree);
		//후위 순회
		System.out.println("Tree(1) Height : " + btree.height(btree));
		//0부터 카운트 하지 않고 1부터 카운트했음, 높이
		
		System.out.println("/*******************************/");
		System.out.println("Tree(2)이 생성된 후 후위순회를 합니다.");
		
		BinaryTree atree = new BinaryTree(77);
		//root, 삽입할 원소들만 만듬
	
		atree.insert(44);
		atree.insert(55);
		atree.insert(99);
		atree.insert(66);
		atree.insert(88);
		atree.insert(22);
		//이진틀 생성
		
		atree.postorder(atree);
		//후위 순회
		System.out.println("Tree(1) Height : " + atree.height(atree));
	}

}
