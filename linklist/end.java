import java.util.*;

public class end {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void insert(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            Node lst = head;
            while (lst.next != null) {
                lst = lst.next;
            }
            lst.next = temp;
        }
    }

    public void display() {
        Node n = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        end s = new end();
        s.insert(40);
        s.insert(50);
        s.display();
    }
}