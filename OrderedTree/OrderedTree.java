import java.util.*;
import java.util.List;

public class OrderedTree {
	private Object root;
	private List subtrees;
	private int size;
	
	public OrderedTree() {
		this.subtrees = new LinkedList();//empty tree
	}
	public OrderedTree(Object root) {
		this.root = root;
		subtrees = new LinkedList(); //empty list
		size = 1;
	}
	
	public List subtees() {
		return this.subtrees;
	}
	
	public OrderedTree(Object root, List trees) {
		this(root);
		for(Iterator it = trees.iterator(); it.hasNext();) {
			Object object = it.next();
			if(object instanceof OrderedTree) {
				OrderedTree tree = (OrderedTree)object;
				subtrees.add(tree);
				size += tree.size();
			}
		}
	}
	public int size() {
		return size;
	}
	
	/***********ť ����**********/
	public void levelorder(OrderedTree tree) {
		LinkedList<OrderedTree> q = new LinkedList<>(); //ť ����
		q.add(tree); //���ڷ� tree_A�� ������ ��
		//������ ���� ��忡 ������ ���� ������, ���̻� �˻��� ����Ʈ���� ���� ������
		while(!q.isEmpty()) {
		for(Iterator it = q.peek().subtrees.iterator(); it.hasNext();) { //Ʈ���� �Ϲ�ȭ ���Ѿ� ��
			q.add((OrderedTree) it.next()); //����Ʈ������ ��Ʈ�� q�� �߰�
		}
	
		System.out.print(" " + q.poll().root);
		}
		
	}
	
}
