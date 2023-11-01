public class doubly_linked_list {
    public static class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        Node temp  = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void insertattail(Node head,int data){
        Node temp = head;
        while(temp.next != null){
            temp  = temp.next;
        }
        Node t = new Node(data);
        temp.next = t;
        t.previous = temp;
    }

    public static Node insertatbegin(int data,Node head){
        Node temp = new Node(data);
        temp.previous  = null;
        temp.next = head;
        head.previous = temp;
        head = temp;
        return temp;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        a.previous = null;
        a.next = b;
        b.previous = a;
        b.next = c;
        c.previous = b;
        c.next = d;
        d.previous  = c;
        d.next = null;
        insertattail(a, 90);
        display(a);


    }   
}
