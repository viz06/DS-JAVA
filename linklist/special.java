import java.util.*;
class Node {
    int data;
    Node next;
}
class special {

    private Node head;

    {
    public void insert(int data) {
       
        Node n = new Node();
        n.data = data;
        n.next = null;

       
        if (this.head == null) {
            head = n;
            return;
        }

        
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }

       
        temp.next = n;
    }
    }

    public void insertNth(int data, int position) {
       
        Node n = new Node();
        n.data = data;
        n.next = null;


        if (this.head == null) {
           
            if (position != 0) {
                return;
            } else { 
                this.head = n;
            }
        }

        if (head != null && position == 0) {
            n.next = this.head;
            this.head = node;
            return;
        }

        Node c = this.head;
        Node p = null;

        int i = 0;

        while (i < position) {
            p = c;
            c = c.next;

            if (c == null) {
                break;
            }

            i++;
        }

           n.next = c;
        p.next = n;
    }

     {
    public void print() {
        if (this.head == null) {
            return;
        }
     
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
     }

}
public class Main {

  public static void main(String[] args) {
      special list = new special();
      list.insert(10);
      list.insert(20);
      list.insert(30);
      list.print();
      list.insertNth(25, 2);
      list.print();
  }
}