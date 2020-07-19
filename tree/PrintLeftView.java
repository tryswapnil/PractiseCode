package com.paytm.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import javax.swing.text.AbstractDocument.LeafElement;

public class PrintLeftView {

	public static void main(String[] args) {

		BSTTree bstTree = new BSTTree();
		bstTree.add(10);
		bstTree.add(15);
		bstTree.add(12);
		bstTree.add(17);
		
		bstTree.add(7);
		bstTree.add(5);
		bstTree.add(3);
		bstTree.add(4);
		
		bstTree.inOrderTrevarsal();
		
		System.out.println("Height of the tree");
		bstTree.height();
		
		System.out.println("Preorder Traversal");
		bstTree.preOrderTraversal();
		
		System.out.println("Postorder Traversal");
		bstTree.postOrderTraversal();
		
		System.out.println("Level Order Traversal");
		bstTree.levelOrderTraversal();
	
		System.out.println("checkIfBST ");
		bstTree.checkIfBST();
	
		System.out.println(" get inorder successor");
		bstTree.getInOrderSuccessor(4);
		
		System.out.println("Left view of binary tree");
		bstTree.leftViewOfBinaryTree();
	
		System.out.println("leftViewOfBinaryTreeUsingRecu using recursion");
		bstTree.leftViewOfBinaryTreeUsingRecu();
		
		System.out.println("Right view of binary tree");
		
	}
	
	
}


class BSTTree {

	Node root;
	public void add(int data) {
		root = add(root, data);
	}
	
	public void leftViewOfBinaryTree() {
		leftViewOfBinaryTree(root);
	}

	private void leftViewOfBinaryTree(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		queue.add(null);
		
		while (!queue.isEmpty()) {
			Node poll = queue.poll();
			
			if (poll != null) {
				System.out.println(poll.data + "\t");
				while (poll != null) {

					if (poll.left != null) {
						queue.add(poll.left);
					}
					if (poll.right != null) {
						queue.add(poll.right);
					}
					poll = queue.poll();
				}
				queue.add(null);
			}
		}
	}
	
	public void leftViewOfBinaryTreeUsingRecu() {
		leftViewOfBinaryTreeUsingRecu(root, 1);
	}
	int maxLevel = 0;
	private void leftViewOfBinaryTreeUsingRecu(Node node, int level) {
		
		if(node == null) {
			return;
		}
		
		if(maxLevel < level) {
			maxLevel  = level;
			System.out.println(node.data +"\t");
		}
		leftViewOfBinaryTreeUsingRecu(node.left, level+1);
		leftViewOfBinaryTreeUsingRecu(node.right, level+1);
		
	}

	public void getInOrderSuccessor(int data) {
		Node node = getInOrderSuccessor(root, data);
		System.out.println(node.data);
	}

	private Node getInOrderSuccessor(Node node, int data) {
		Node current = findNode(node, data);

		//System.out.println(findNode.data);
		
		// If the node has right subtree
		if(current == null) {
			return null;
		} else if(current.right != null) {
			return findMin(current.right);
		} else {
			Node successor= null;
			Node ancestor = root;
			while (ancestor != current) {
				if(current.data < ancestor.data) {
					successor = ancestor;
					ancestor = ancestor.left;
				} else {
					ancestor = ancestor.right;
				}
			}
			return successor;
		}
	}

	private Node findMin(Node right) {
		while (right.left != null) {
			right = right.left;
		}
		return right;
	}

	private Node findNode(Node node, int data) {
		if(node == null) {
			return null;
		}
		
		if(node.data > data) {
			node = findNode(node.left, data);
		} else if(node.data < data) {
			node = findNode(node.right, data);
		} 
		return node;
	}

	public void checkIfBST() {
		boolean checkIfBST = checkIfBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println(checkIfBST);
	}

	private boolean checkIfBST(Node node, int maxValue, int minValue) {

		if(node == null) {
			return true;
		}
		if (node.data > maxValue || node.data < minValue) {
			return false;
		}
		return checkIfBST(node.left, node.data, minValue) | 
				checkIfBST(node.right, maxValue, node.data);
	}

	public void levelOrderTraversal() {
		levelOrderTraversal(root);
	}

	private void levelOrderTraversal(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		while (!queue.isEmpty()) {
			Node poll = queue.poll();
			if(poll != null) {
				System.out.println(poll.data);
				queue.add(poll.left);
				queue.add(poll.right);
			}
		}
	}

	public void postOrderTraversal() {
		postOrderTraversal(root);
	}

	private void postOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.println(node.data);
	}

	// Root->Left-> Right
	public void preOrderTraversal() {
		preOrderTraversal(root);
	}

	private void preOrderTraversal(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.data);
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}

	private Node add(Node node, int data) {
		if(node == null) {
			node = new Node(data);
			return node;
		}
		
		if(node.data > data) {
			node.left = add(node.left, data);
		} else {
			node.right = add(node.right, data);
		}
		return node;
	}
	
	public void inOrderTrevarsal() {
		inOrderTrevarsal(root);
	}
	
	// Left-> Root-> Right
	public void inOrderTrevarsal(Node node) {
		if(node == null) {
			return;
		}
		inOrderTrevarsal(node.left);
		System.out.println(node.data);
		inOrderTrevarsal(node.right);
	}
	
	public void height() {
		int height = height(root);
		System.out.println(height);
	}

	private int height(Node node) {
		if(node == null) {
			return -1;
		}
		return Math.max(height(node.left), height(node.right))+1;
	}
}

class Node {
	
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
