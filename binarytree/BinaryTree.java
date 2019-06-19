package binarytree;

import javax.swing.tree.TreeNode;

public class BinaryTree {
	
	private int key;
	private BinaryTree left, right;

	public BinaryTree() {
		this.left = null;
		this.right = null;
	}
	
	public BinaryTree(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
	public BinaryTree(int key, BinaryTree left, BinaryTree right) {
		 this(key);
		 this.left = left;
		 this.right = right;
	}

	public void insert(int x) { //���� ����
		
		if(x > key) { //���� ���� ���� ���� key���� Ŭ �� ������ ����
			if(this.right == null) { //�������� �������
				this.right = new BinaryTree(x);//�����ʿ� ����
			} else {
				right.insert(x); //��� �̿��Ͽ� �ٽ� ���� ����������
			}
		} else {
			
			if(x < key) {
				if(this.left == null) {
				this.left = new BinaryTree(x);
			} else {
				left.insert(x);
					}	
				}
			}	
		}
	
	
	public void postorder(BinaryTree t) { //���� ����
	
		if(t != null) { //Ʈ���� ���̻� �� ��尡 ���������� ����� �ݺ�
			postorder(t.left); //���� ��带 Ž��
			postorder(t.right); //������ ��带 Ž��
			System.out.println("Key " + t.key + " is Visited");
			//�湮�� ������� ����ϱ�
		}
		
	}
	
	public int height(BinaryTree t) { //���� �����ϱ�
		//���� ������ ���Ҹ� ���� ����
		//���� ī��Ʈ �� ���� ���Ҹ� return
		//�ؿ� �������� �ö���鼭 count
		
		if(t==null) return 0; //base case
		return 1 + Math.max(height(t.left), height(t.right));
		
	}
		
	

	
}
