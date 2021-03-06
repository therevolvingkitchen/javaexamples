package com.mytest;

import java.util.LinkedList;
import java.util.Queue;
 
/* Class to represent Tree node */
class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
 
/* Class to print Level Order Traversal */
class BFSBinaryTree {
 
    Node root;
 
    /* Given a binary tree. Print 
     its nodes in level order
     using array for implementing queue  */
//    void printLevelOrder() 
//    {
//        Queue<Node> queue = new LinkedList<Node>();
//        queue.add(root);
//        while (!queue.isEmpty()) 
//        {
//
//            Node tempNode = queue.poll();
//            System.out.print(tempNode.data + " ");
// 
//            /*Enqueue left child */
//            if (tempNode.left != null) {
//                queue.add(tempNode.left);
//            }
// 
//            /*Enqueue right child */
//            if (tempNode.right != null) {
//                queue.add(tempNode.right);
//            }
//        }
//    }
 
    
    void printLevelOrder() {
    	Queue<Node> queue= new LinkedList<Node>();
    	queue.add(root);
    	
    	while(!queue.isEmpty()) {
    		Node node=queue.poll();
    		System.out.print(node.data+" ,");
    		if (node.left!=null)
    			queue.add(node.left);
    		if (node.right!=null)
    			queue.add(node.right);
    	}
    }
    
    // Deque<Integer> stack = new ArrayDeque<>(); for Stack() Stack inherited from vector
    // Queue<Node> quue= new LinkedList<Node>(); 


    void printLevelOrderDFS(Node node) {
    	System.out.print(node.data+" ,");
    	if (node.left!=null)
    		printLevelOrderDFS(node.left);
    	if (node.right!=null)
    		printLevelOrderDFS(node.right);
    		
    }
//    void printLevelOrder() {
//    	printLevelOrderDFS(root);
//    }
    
    
    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
    	BFSBinaryTree tree_level = new BFSBinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}