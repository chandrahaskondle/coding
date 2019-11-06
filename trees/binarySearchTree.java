import java.util.*;
import java.lang.*;
import java.io.*;

class BinarySearchTree{
    private static Node root;
    private static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    
    public void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public Node addRec(int key, Node root){
        if( root==null )
            return (new Node(key));
        else if( root.data> key)
            root.left= addRec(key, root.left);
        else
            root.right= addRec(key, root.right);
        return root;
    }
	
	pubilc Node deleteRec(int key, Node root){
	    
	}
	
    public boolean searchNodeRecursive(int key, Node root){
        if( root==null )
			return false;
		else{
			if( root.data==key )
				return true;
			else if( key < root.data )
				return searchNodeRecursive( key, root.left );
			else
				return searchNodeRecursive( key, root.right );
		}
    }
    
    public static void main(String args[]){
        int arr[]={11, 6, 8, 19, 4, 10, 5, 17, 43, 49, 31};
        BinarySearchTree bst=new BinarySearchTree();
        for(int i=0;i<arr.length;i++)
            root=bst.addRec(arr[i],root);
        bst.inorder(root);
		System.out.println(bst.searchNodeRecursive(1,root));
		
    }
    
}
