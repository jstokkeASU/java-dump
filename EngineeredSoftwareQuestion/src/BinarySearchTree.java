
public class BinarySearchTree {
	
	class Node {
		int value;
		Node left, right;
		
		public Node(int item) {
			value = item;
			left = null;
			right = null;
		}
		
	}
	
	Node root;
	int count = 0;
	
	BinarySearchTree(){
		root = null;
	}
	/* A recursive function to insert a new key in Tree */
	void insert(int value) {
		root = insertObj(root, value);
	}
	
	Node insertObj(Node root, int value) {
		/* If tree is empty, return a new node */
		if (root == null) {
			root = new Node(value);
			return root;
		}
		/* Else recur down tree */
		if (value < root.value) {
			root.left = insertObj(root.left, value);
		}
		else if (value > root.value) {
			root.right = insertObj(root.right, value);
		}
		/* return unchanged node */
		return root;
	}
	
	void inOrder() {
		inOrderObj(root);
	}
	
	void inOrderObj(Node root) {
		if (root != null) {
			inOrderObj(root.left);
			System.out.println(root.value);
			inOrderObj(root.right);
		}
	}
	public Node search(Node root, int value) {
		/* If tree is empty or value is root */
		if (root == null || root.value == value) {
			return root;
		}
		/* If value is less than root */
		else if (root.value > value) {
			return search(root.left, value);
		}
		/* If value is more than root */
		return search(root.right, value);
	}
	
	int getCount() {
		int total = getCountObj(root);
		return total;
	}
	
	public int getCountObj(Node root) {
		if (root != null) {
			count++;
			getCountObj(root.left);
			getCountObj(root.right);
		}
		int total = count;
		return total;
	}
	public boolean containsValue(Node current, int value) {
		if (current == null) {
			return false;
		}
		if (current.value == value) {
			return true;
		}
		return value < current.value ? containsValue(current.left, value) : containsValue(current.right, value);
	}

}
