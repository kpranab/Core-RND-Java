package com.rnd.algo.bst;

public class BinaryTree {

	private Node root;

	public BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();

		// Insert
		binaryTree.insert(50);
		binaryTree.insert(70);
		binaryTree.insertWithRecursion(15);
		binaryTree.insertWithRecursion(35);
		binaryTree.insert(30);
		binaryTree.insert(31);

		System.out.println("Inorder Traversal -----------------\n");
		binaryTree.inOrder(binaryTree.root);

		System.out.println("\n--------------------------");
		Node node = binaryTree.find(15);
		System.out.println((node == null) ? "The requested Node not found "
				: "Node : " + String.valueOf(node.value) + " is present in the Binary Tree");

		System.out.println("\nPreorder traversal -----------------\n");
		binaryTree.preOrder(binaryTree.root);
		System.out.println("\n\nPostorder traversal -----------------\n");
		binaryTree.postOrder(binaryTree.root);

		System.out.println("\n\n Find Min -------------------: " + binaryTree.findMin(binaryTree.root).value);
		System.out.println("\n Find Max -------------------: " + binaryTree.findMax(binaryTree.root).value);

	}

	public Node findMax(Node node) {
		if (node.right != null)
			return findMax(node.right);
		return node;
	}

	public Node findMin(Node node) {
		if (node.left != null)
			return findMin(node.left);
		return node;
	}

	// left root right
	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			node.displayData();
			inOrder(node.right);
		}
	}

	// root left right
	public void preOrder(Node node) {
		if (node != null) {
			node.displayData();
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	// left right root
	public void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			node.displayData();
		}
	}

	public Node find(int searchValue) {
		Node current = root;
		while (current.value != searchValue) {
			if (searchValue < current.value)// Move left
				current = current.left;
			else// Move right
				current = current.right;
			if (current == null)
				return null;
		}
		return current;
	}

	public void insertWithRecursion(int value) {
		root = insertWithRecursion(root, value);
	}

	public Node insertWithRecursion(Node node, int value) {
		if (node == null)
			return new Node(value);
		// Move left if value is less than current node value
		if (value < node.value)
			node.left = insertWithRecursion(node.left, value);

		// Move right if value is greater than current value
		else if (value > node.value)
			node.right = insertWithRecursion(node.right, value);

		return node;
	}

	public void insert(int value) {
		Node node = new Node(value);
		if (root == null) {
			root = node;
		} else {
			Node currentNode = root;
			Node parent;
			while (true) {
				parent = currentNode;
				if (value < currentNode.value) {
					currentNode = currentNode.left;
					if (currentNode == null) {
						parent.left = node;
						return;
					}
				} else {
					currentNode = currentNode.right;
					if (currentNode == null) {
						parent.right = node;
						return;
					}
				}

			}
		}
	}

}

class Node {

	int value;
	Node left;
	Node right;

	Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}

	public void displayData() {
		System.out.print(value + " ");
	}
}
