// java code implementing binaryTree with some important functions ( insertion, deletion, searching )

import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryTree{
    private static Node root;
	private static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public void PreOrder(Node curr){
	    System.out.print(curr.data+" ");
	    if(curr.left!=null)
	        PreOrder(curr.left);
	    if(curr.right!=null)
	        PreOrder(curr.right);
	}
	
	public void InOrder(Node curr){
	    if(curr.left!=null)
	        InOrder(curr.left);
	    System.out.print(curr.data+" ");
	    if(curr.right!=null)
	        InOrder(curr.right);
	}
	
	public void PostOrder(Node curr){
	    if(curr.left!=null)
	        PostOrder(curr.left);
	    if(curr.right!=null)
	        PostOrder(curr.right);
	    System.out.print(curr.data+" ");
	}
	
	public void BFS(Node curr){
	    Queue<Node> queue=new LinkedList<Node>();
	    queue.add(root);
	    while(!queue.isEmpty()){
	        Node curr_node=queue.remove();
	        System.out.print(curr_node.data+" ");
	        if(curr_node.left!=null)
	            queue.add(curr_node.left);
	        if(curr_node.right!=null)
	            queue.add(curr_node.right);
	    }
	}
	
	public static void main(String args[]){
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		Node curr_node=root.left;
		curr_node.left=new Node(4);
		curr_node.right=new Node(5);
		curr_node=root.right;
		curr_node.left=new Node(6);
		curr_node.right=new Node(7);
		BinaryTree binaryTree=new BinaryTree();
		binaryTree.PreOrder(root);
		System.out.println();
		binaryTree.InOrder(root);
		System.out.println();
		binaryTree.PostOrder(root);
		System.out.println();
		binaryTree.BFS(root);
	}
	
}
