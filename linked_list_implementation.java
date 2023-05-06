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
                    size++;
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
            void insertatbegin(int data){
                if(head == null){
                    add(data);
                }
                else{
                    Node temp = new Node(data);
                    temp.next = head;
                    head = temp;
                }
                size++;
            }
            void insert(int data,int idx){
                if(idx == 0 ){
                    insertatbegin(data);
                }
                else if(idx == size){
                    add(data);
                }
                else if(idx > size || idx < 0){
                    System.out.println("Wrong Index!!");
                    return;
                }
                else{
                    Node temp = new Node(data);
                    Node t = head;
                    for(int i=1;i<idx;i++){
                        t = t.next;
                    }
                    temp.next = t.next;
                    t.next = temp;
                    size++;
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
        ll.insertatbegin(4);
        ll.display();
        ll.insert(12, -2);
        ll.display();
        System.out.println(ll.size);
    }
}
