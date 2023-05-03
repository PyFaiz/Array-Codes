public class basic_linked_list {
    public static void display(Node a){
        Node temp = a;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print(" -> ");
            }
        }
    }
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

        display(n1);
        // Node temp = n1;
        // while(temp != null){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
        // for(int i=0;i<4;i++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
    }
}
