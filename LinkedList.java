import java.util.*;
import java.lang.*;
import java.io.*;

class Node { 
    int data; 
    Node next; 
    Node(int d)  { data = d;  next=null; } 
}

class LinkedList 
{ 
    Node head;
    public void push(int d){
        Node curr=new Node(d);
        Node temp=head;
        if(head==null){
            head=curr;
            return;
        }
        while(temp.next!=null)
            temp=temp.next;
        temp.next=curr;
    }
    public int countList(Node node){
        if(node.next==null)
            return 1;
        return countList(node.next)+1;
    }
    public boolean search_element(int d){
        Node temp=head;
        while(temp!=null){
            if(temp.data==d)
                return true;
            temp=temp.next;
        }
        return false;
    }
    public int getNth(int index){
        if(index==0)
            return head.data;
        Node temp=head;
        while(index-- > 0){
            temp=temp.next;
        }
        if(index!=0)
            return -1;
        return temp.data;
    }
    public boolean checkCycle(){
        Node slow=head,fast=head;
        while(true && slow!=null && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
    public int cycleLength(){
        Node slow=head,fast=head;
        while(true){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast)
                break;
        }
        int count=1;
        fast=fast.next;
        while(fast!=slow){
            fast=fast.next;
            count++;
        }
        return count;
    }
    public Node reverseLL(Node start){
        Node Curr=start,Next=head,Prev=null;
        while(Curr!=null){
            Next=Curr.next;
            Curr.next=Prev;
            Prev=Curr;
            Curr=Next;
        }
        start=Prev;
        return start;
    }
    public boolean checkPalindrome(){
        Node slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node temp=reverseLL(slow);
        slow=head;
        while(temp!=null && slow.data==temp.data){
            slow=slow.next;
            temp=temp.next;
        }
        if(temp!=null)
            return false;
        return true;
    }
 
    public static void main(String[] args) 
    { 
        LinkedList llist = new LinkedList(); 
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);
        llist.push(7);
        llist.push(8);
        llist.head.next.next.next.next.next.next.next.next=llist.head.next.next;
        if(llist.checkCycle()){
            System.out.println("Cycle Detected");
            System.out.println("Cycle Length-->"+llist.cycleLength());
        }
        else
            System.out.println("No Cycle Detected");
    } 
} 
