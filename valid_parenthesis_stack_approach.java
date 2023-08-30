public class valid_parenthesis_stack_approach {
    static class Stack{
    private char arr[];
    public int top;
    private int capacity;

    Stack(int size){
        arr=  new char[size];
        capacity  =size;
        top = -1; 
    }
    public void push(char x){
        if(top == capacity-1){
            System.out.println("Stack Overflow");
        }
        else{
            //System.out.println("Inserting");
            arr[++top] = x;
        }
    }
    public int get_top_value(){
        return top;
    }
    public void pop(){
        if (top == -1){
            System.out.println("Stack is Empty");
            //return Integer.parseInt(null);
        }
        else{
            //System.out.println("Item Poped:");
            top--;
        }
    }
    public char get_top(){
        return arr[top];
    }
    public void print_stack(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i] + " ");
        }
    }
    }


    public static boolean valid(String s){
        int size=  s.length();
        Stack st = new Stack(size);
        if(size==1){
            return false;
        }
        for(int i=0;i<size;i++){
            if (s.charAt(i) == '('){
                st.push('(');
            }
            else if ((s.charAt(i) == ')') && (st.get_top_value() != (-1))){
                if(st.get_top() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if (s.charAt(i) == '['){
                st.push('[');
            }
            else if ((s.charAt(i) == ']') && (st.get_top_value() != (-1))){
                if(st.get_top() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if (s.charAt(i) == '{'){
                st.push('{');
            }
            else if ((s.charAt(i) == '}') && (st.get_top_value() != (-1))){
                if(st.get_top() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if (((s.charAt(i) == ')') || (s.charAt(i) == ']') || (s.charAt(i) == ']')) && (st.get_top_value() == -1)){
                return false;
            }
        }

        if(st.get_top_value() != (-1)){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(valid("([)]"));
    }
}
