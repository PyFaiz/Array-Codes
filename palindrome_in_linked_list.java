public class palindrome_in_linked_list {
    public static class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean check_palindrome(Node head){
        Node temp = head;
        Node temp2 = head;
        while(temp.next != null){
            temp  = temp.next;
        }
        while(temp != temp2){
            if(temp.data != temp2.data){
                return false;
            }
            temp = temp.next;
            temp = temp2.next;
        }
        return true;

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
        //display(a);
        System.out.println(check_palindrome(a));
    }
}
