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
	
	/***********큐 생성**********/
	public void levelorder(OrderedTree tree) {
		LinkedList<OrderedTree> q = new LinkedList<>(); //큐 생성
		q.add(tree); //인자로 tree_A가 들어오게 됨
		//마지막 리프 노드에 도달할 했을 때까지, 더이상 검사할 서브트리가 없을 때까지
		while(!q.isEmpty()) {
		for(Iterator it = q.peek().subtrees.iterator(); it.hasNext();) { //트리를 일반화 시켜야 함
			q.add((OrderedTree) it.next()); //서브트리들의 루트를 q에 추가
		}
	
		System.out.print(" " + q.poll().root);
		}
		
	}
	
}
