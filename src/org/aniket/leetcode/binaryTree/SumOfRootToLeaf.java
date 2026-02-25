package org.aniket.leetcode.binaryTree;

public class SumOfRootToLeaf 
{
	public static void inOrderTraversal(TreeNode node)
	{
		if(node == null) return;
		
		inOrderTraversal(node.left);
		System.out.print(node.data + " ");
		inOrderTraversal(node.right);
	}
	
	public static int generateAllPath(TreeNode root, int current)
	{
		if(root == null) return 0;
		
		current = current * 2 + root.data;
		
		if(root.left == null && root.right == null) return current;
		
		return generateAllPath(root.left, current) + generateAllPath(root.right, current);
	}
	
	public static int getSumOfRoot(TreeNode root)
	{
		return generateAllPath(root,0);
	}

	public static void main(String[] args) 
	{
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(0);
		node.right = new TreeNode(1);
		node.left.left = new TreeNode(0);
		node.left.right = new TreeNode(1);
		node.right.left = new TreeNode(0);
		node.right.right = new TreeNode(1);
		
		inOrderTraversal(node);
		int res = getSumOfRoot(node);
		System.out.println(res);
	}

}
