package binarytree;

public class MainTest {
	public static void main(String args[]) {
		
		System.out.println("Tree(1)�� ������ �� ������ȸ�� �մϴ�.");
		
		BinaryTree btree = new BinaryTree(1);
		//root, ������ ���ҵ鸸 ����
		
		btree.insert(3);
		btree.insert(5);
		btree.insert(7);
		btree.insert(9);
		//����Ʋ ����
		
		btree.postorder(btree);
		//���� ��ȸ
		System.out.println("Tree(1) Height : " + btree.height(btree));
		//0���� ī��Ʈ ���� �ʰ� 1���� ī��Ʈ����, ����
		
		System.out.println("/*******************************/");
		System.out.println("Tree(2)�� ������ �� ������ȸ�� �մϴ�.");
		
		BinaryTree atree = new BinaryTree(77);
		//root, ������ ���ҵ鸸 ����
	
		atree.insert(44);
		atree.insert(55);
		atree.insert(99);
		atree.insert(66);
		atree.insert(88);
		atree.insert(22);
		//����Ʋ ����
		
		atree.postorder(atree);
		//���� ��ȸ
		System.out.println("Tree(1) Height : " + atree.height(atree));
	}

}
