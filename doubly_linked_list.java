public class doubly_linked_list {
    public static class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data = data;
        }
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
        Node temp =  a;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }


    }   
}
