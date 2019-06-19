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

	public void insert(int x) { //원소 삽입
		
		if(x > key) { //새로 들어온 원소 값이 key보다 클 때 오른쪽 정렬
			if(this.right == null) { //오른쪽이 비었으면
				this.right = new BinaryTree(x);//오른쪽에 삽입
			} else {
				right.insert(x); //재귀 이용하여 다시 돌기 없을떄까지
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
	
	
	public void postorder(BinaryTree t) { //후위 순위
	
		if(t != null) { //트리에 더이상 돌 노드가 없을떄까지 재귀적 반복
			postorder(t.left); //왼쪽 노드를 탐색
			postorder(t.right); //오른쪽 노드를 탐색
			System.out.println("Key " + t.key + " is Visited");
			//방문한 순서대로 출력하기
		}
		
	}
	
	public int height(BinaryTree t) { //높이 측정하기
		//왼쪽 오른쪽 원소를 따로 세서
		//많이 카운트 된 쪽의 원소를 return
		//밑에 내려가서 올라오면서 count
		
		if(t==null) return 0; //base case
		return 1 + Math.max(height(t.left), height(t.right));
		
	}
		
	

	
}
