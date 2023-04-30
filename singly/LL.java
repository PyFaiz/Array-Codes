package singly;
public class LL{
    private node head;
    private node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        node Node = new node(val);
        Node.next = head;
        head = Node;
        if(tail ==  null){
            tail = head;
        }  
        size +=1;
    }

    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    private class node {   
        private int value;
        private node next;
        public node(int value){
            this.value =  value;
        }
    }
}


