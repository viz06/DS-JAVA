import java.util.*;
public class insert {  
  
 
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public Node head = null;  
  
    public void addAtStart(int data) {  
    
        Node n = new Node(data);  
  
    
        if(head == null) {  
    
            head = n;   
        }  
        else {  
        
            Node temp = head;  
            head = n;  
           
            head.next = temp;  
        }  
    }  
  
   
    public void display() {  
        
        Node a = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(a != null) {  
            
            System.out.print(a.data + " ");  
            a = a.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) {  
  
        InsertStart list = new InsertStart();  
  
        
        list.addAtStart(1);  
        list.display();  
 
        list.addAtStart(2);  
        list.display();  
  
        
        list.addAtStart(3);  
        list.display();  
  
    
        list.addAtStart(4);  
        list.display();  
    }  
}