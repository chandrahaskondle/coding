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
    
    public void add(int data){
        Node new_node=new Node(data);
        while(){
            
        }
        
        if(root.data <= data){
            
        }
        else{
            
        }
    }
    
    public static void main(String args[]){
        int arr[]={11, 6, 8, 19, 4, 10, 5, 17, 43, 49, 31};
        BinarySearchTree bst=new BinarySearchTree();
        for(int i=0;i<11;i++){
            bst.add(arr[i]);
        }
    }
    
}
