package Tree;

public class BST {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
			this.left =null;
			this.right = null;
		}
	}
	
	public static Node insert(Node root, int val)
	{
		if (root == null) {
			root = new Node(val);
			return root;
		}
		
		if (root.data > val) {
			root.left = insert(root.left,val);
		}else {
			root.right = insert(root.right,val);
		}
		return root;
	}
	
	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	//search the node in BST*****************************************
	public static boolean search(Node root, int key) {
		if (root==null) {
			return false;
		}
		
		if (root.data==key) {
			return true;
		}
		
		if (root.data>key) {
			return search(root.left,key);
		}
		
		else {
			return search(root.right,key);
		}
	}
	//*****************************************************
	
	//Delete Node-----------------------------------------
	
	public static Node delete(Node root, int val) {
		if (root.data < val) {
			root.right = delete(root.right,val);
		}
		else if (root.data > val) {
			root.left = delete(root.left,val);
		}
		else {//voila
			//case01 - leaf node
			if (root.left == null && root.right == null) {
				return null;
			}
			
			//case02 single child
			if (root.left == null) {
				return root.right;
			}
			if (root.right == null) {
				return root.left;
			}
			
			//case03 both children
			Node IS = findInorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
			
		}
		return root;
	}
	
	public static Node findInorderSuccessor(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}
	//------------------------------------------------------------------
	
	//print in range 
	public static void PrintInRange(Node root, int k1,int k2) {
		if (root == null) {
			return;
		}
		if (root.data >= k1 && root.data <= k2) {
			PrintInRange(root.left, k1, k2);
			System.out.print(root.data+" ");
			PrintInRange(root.right, k1, k2);
		}
		else if (root.data < k1) {
			PrintInRange(root.left, k1, k2);
		}
		else {
			PrintInRange(root.right, k1, k2);
		}
	}
	
	public static void main(String[] args) {
		int values[] = {8,5,3,1,4,6,10,11,14};
		Node root = null;
	
		for (int i = 0; i < values.length; i++) {
			root = insert(root,values[i]);
		}
	
		inorder(root); 
		System.out.println();
		
		
		//search
//		if (search(root, 8)) {
//			System.out.println("found");
//		}
//		
//		else
//		{
//			System.out.println("Not found");
//		}
		
//		root =  delete(root, 5);
//		System.out.println();
		

//		inorder(root); 
		
		//print in range
		inorder(root); 
		System.out.println();
		PrintInRange(root, 5, 12);
	
	}
}
