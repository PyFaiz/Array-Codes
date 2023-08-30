public class Stack{
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size){
        arr=  new int[size];
        capacity  =size;
        top = -1; 
    }
    public int push(int x){
        if(top == capacity-1){
            System.out.println("Stack Overflow");
            return Integer.parseInt(null);
        }
        else{
            System.out.println("Inserting");
             return arr[++top] = x;
        }
    }

    public int pop(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return Integer.parseInt(null);
        }
        else{
            //System.out.println("Item Poped:");
            return arr[top--];
        }
    }

    public void print_stack(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.print_stack();
    }
}