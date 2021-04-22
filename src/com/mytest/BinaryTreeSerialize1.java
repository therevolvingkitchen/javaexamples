package com.mytest;

public class BinaryTreeSerialize1 {

	// Root of Binary Tree 
	public TreeNode root; 
  
    BinaryTreeSerialize1() 
    { 
        root = null; 
    } 
  
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
  
        /* first print data of node */
        System.out.print(node.val + " "); 
  
        /* then recur on left sutree */
        printPreorder(node.left); 
  
        /* now recur on right subtree */
        printPreorder(node.right); 
    } 
  
    // Wrappers over above recursive functions 
    void printPreorder() { printPreorder(root); } 
  
    
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(TreeNode node) 
    { 
        if (node == null) 
            return; 
  
        //System.out.print(node.val + " "); 
        
        /* first recur on left child */
        printInorder(node.left); 
  
        /* then print the data of node */
        System.out.print(node.val + " "); 
  
        /* now recur on right child */
        printInorder(node.right); 
    } 
  
    // Wrappers over above recursive functions 
    void printInorder() { printInorder(root); } 
    
    
    // Driver method 
    public static void main(String[] args) 
    { 
    	BinaryTreeSerialize1 tree = new BinaryTreeSerialize1(); 
    	
        tree.root = new TreeNode(1); 
        tree.root.left = new TreeNode(2); 
        tree.root.right = new TreeNode(3); 
        tree.root.left.left = new TreeNode(4); 
        tree.root.left.right = new TreeNode(5); 
        tree.root.left.left.left = new TreeNode(6); 
        tree.root.left.left.right = new TreeNode(7); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(); 
        

        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
        
    } 

}
