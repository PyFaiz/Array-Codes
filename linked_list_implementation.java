import javax.xml.transform.Templates;

public class linked_list_implementation {
    public static class Linked_list{
            Node head =  null;
            Node tail = null;
            int size = 0;
            void add(int data){
                    Node temp = new Node(data);
                    if(head == null){
                        head = temp;
                    }
                    else 
                    {
                        tail.next = temp;
                    }
                    tail = temp;
            }
            void display(){
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data);
                    if(temp.next!=null) System.out.print(" -> ");
                    else System.out.println();
                    temp = temp.next;
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
        Linked_list ll = new Linked_list();
        ll.add(5);
        ll.add(6);
        ll.add(20);
        ll.display();
    }
}
