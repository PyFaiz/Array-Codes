public class basic_linked_list {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(7);
        Node n4 = new Node(9);
        n1.next = n2;
        n2.next = n3    ;
        n3.next = n4;

        Node temp = n1;
        for(int i=0;i<4;i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
