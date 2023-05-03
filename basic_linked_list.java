public class basic_linked_list {
    public static void displayr(Node a){
        if(a == null) return;
        System.out.print(a.data);
        if(a.next != null) System.out.print(" -> ");
        else System.out.println();
        displayr(a.next);
    }
    public static void displayreverse(Node a){
        if(a ==  null) return;
        displayreverse(a.next);
        System.out.print(a.data);
        if(a.data != 2) System.out.print(" -> "); 
    }
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

        displayr(n1);
        displayreverse(n1);
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
