package AVLTree;

import binarytree.BinaryTree;

public class AVLTree {
	
	private int key, height;
	private AVLTree left, right;
	public static final AVLTree NIL = new AVLTree();
	
	public AVLTree(int key) {
		this.key = key;
		left = right = NIL;
	}
	
	private AVLTree() {
		left = right = this;
		height = -1;
	}
	
	private AVLTree(int key, AVLTree left, AVLTree right) {
		this.key = key;
		this.left = left;
		this.right = right;
		height = 1 + Math.max(left.height, right.height);
	}
	
	public int size() {
		if(this == NIL) return 0;
		return 1 + left.size() + right.size();
	}
	
	
	public String toString() {
		if(this == NIL) return " ";
		return left + " " + key + " " + right;
	}
	
	public boolean add(int key) {
		int oldSize = size();
		grow(key);
		return size() > oldSize;
	}
	
	public AVLTree grow(int key) {
		if(this == NIL) return new AVLTree(key);
		if(key == this.key) return this;
		if(key < this.key)
			left = left.grow(key);
		else
			right = right.grow(key);
		rebalance();
		height = 1 + Math.max(left.height, right.height);
		return this;
	}
	

	
	public AVLTree remove(AVLTree root, int keyValue) {
		
		AVLTree small = new AVLTree(); //�ּҰ� ã��
		
		if(root == NIL) return NIL;
		
		if(root.key > keyValue) { //���� Ű> ã������ Ű
			root.left = remove(root.left, keyValue);
		} else if(root.key < keyValue) { //���� Ű< ã������ Ű
			root.right = remove(root.right, keyValue);
		} else { //ã������ Ű ���� ������ Ű ���� ��ġ�� ��
			
			if((root.left == NIL) && (root.right != NIL)) { //�����ʿ��� ����Ʈ���� ���� ���
				root = root.right;
				root.right = NIL;
			}
			else if((root.left != NIL) && (root.right == NIL)) { //���ʿ��� ����Ʈ���� ���� ���
				root= root.left;
				root.left = NIL;
			}
			else if((root.left != NIL) && (root.right != NIL)) { //���� �� ����Ʈ���� ���� ���
				
				//�����Ǵ� �κ�
				
				root.key = minimum(root.right).key; //Ű �ٲٱ�
				root.right = remove(root.right, root.key);
				
			} else if((root.left == NIL) && (root.right == NIL)) { //����Ʈ���� ���� ���
				root = NIL;
			}
		}
		height = 1 + Math.max(left.height, right.height);
		rebalance();
		return root;
		
	}
	
	public AVLTree minimum(AVLTree Node) {
		if (Node.left != NIL) {
			Node.left = minimum(Node.left);
		}
		return Node;
	}
		

	
	public void rebalance() {
		if(right.height > left.height+1) {
			if(right.left.height > right.right.height)
				right.rotateRight();
			rotateLeft();
		}
		else if(left.height > right.height+1) {
			if(left.right.height > left.left.height)
				left.rotateLeft();
			rotateRight();
		}
	}
	
	private void rotateLeft() {
		left = new AVLTree(key, left, right.left);
		key = right.key;
		right = right.right;
	}
	
	private void rotateRight() {
		right = new AVLTree(key, left.right, right);
		key = left.key;
		left = left.left;
		
	}

}
