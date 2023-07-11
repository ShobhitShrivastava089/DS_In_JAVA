package Tree;

import Tree.BinaryTreeB.Node;

public class AllAboutTree {
	
	static class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this .data = data;
		this.left=null;
		this.right=null;
		
		}
	}
	
	//height of the tree ----------------------
		public static int height(Node root) {
			if (root == null) {
				return 0;
			}
			int lh = height(root.left);
			int rh = height(root.left);
			return Math.max(lh, rh)+1;
			
	}
	
	
		//count ??????????????????????????
		public static int count(Node root) {
			if (root == null) {
				return 0;
			}
			
			int leftcount = count(root.left);
			int rightcount = count(root.right);
			
			return leftcount + rightcount +1;
			
		}
		
		//sum of nodes ++++++++++++++++++++++++++++
		public static int sum(Node root) {
			if (root == null) {
				return 0;
			}
			
			int leftsum = sum(root.left);
			int rightsum = sum(root.right);
			
			return leftsum + rightsum + root.data;
			
		}
		
		
		
		//for the Subtree********************
		public static boolean isIdentical(Node node, Node subRoot) {
			if (node==null && subRoot == null) {
				return true;
			}
			
			else if (node == null || subRoot==null || node.data != subRoot.data ) {
				return false;
			}
			
			if (!isIdentical(node.left, subRoot.left)) {
				return false;
			}
			
			if (!isIdentical(node.right, subRoot.right)) {
				return false;
			}
			
			return true;
		}
		
		
		//for the subtree***************************
		public static boolean isSubtree(Node root, Node subRoot)
		{
			if (root == null) {
				return false;
			}
			if (root.data == subRoot.data) {
				if (isIdentical(root,subRoot)) {
					return true;
				}
			}
			
//			boolean leftAns = isSubtree(root.left, subRoot);   1st approach
//			boolean rightAns = isSubtree(root.right, subRoot);
			//return leftAns || rightAns;
			
			return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
		}
		
		public static void Klevel(Node root, int level, int k) {
			if (root == null) {
				return;
			}
			if (level == k) {
				System.out.print(root.data+" ");
				return;
			}
			Klevel(root.left,level+1,k);
			Klevel(root.right,level+1,k);
			
		}
		
		
	
	public static void main(String[] args) {
		//main Tree
		Node root= new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
		//subtree
		
//		Node subroot = new Node(2);
//		subroot.left = new Node(4);
//		subroot.right= new Node(5);
		
		
//		System.out.println(height(root));
//		System.out.println(count(root));
//		System.out.println(sum(root));
		
//		System.out.println(isSubtree(root, subroot));  //subroot 
		
		int k=3;
		
		Klevel(root, 1, k);
		
	}
	

}
