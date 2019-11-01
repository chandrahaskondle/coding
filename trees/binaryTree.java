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
    
    public void add(int key){
        if(root==null)
            root=new Node(key);
        else{
            Node temp=root;
            while( true ){
                if(key < temp.data){
                    if(temp.left==null){
                        temp.left=new Node(key);
                        break;
                    }
                    temp=temp.left;
                }
                else{
                    if(temp.right==null){
                        temp.right=new Node(key);
                        break;
                    }
                    temp=temp.right;
                }
            }
        }
    }
    
    public void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    public static void main(String args[]){
        int arr[]={11, 6, 8, 19, 4, 10, 5, 17, 43, 49, 31};
        BinarySearchTree bst=new BinarySearchTree();
        for(int i=0;i<arr.length;i++)
            bst.add(arr[i]);
        bst.inorder(root);
    }
    
}
