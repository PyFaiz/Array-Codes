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

    public static void insertAtIndex(int data,Node head,int idx){
        Node s = head;
        for(int i=1;i<=idx-1;i++){
            s = s.next;
        }

        Node r = s.next;
        Node t = new Node(data);
        s.next = t;
        t.previous = s;
        t.next = r;
        r.previous = t;
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
        //display(a);
        insertAtIndex(9, a, 2);
        display(a);

    }   
}
