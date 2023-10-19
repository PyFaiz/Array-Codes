import java.util.Stack;

public class reverse_a_word{
    public static void main(String[] args) {
        String strr = "Sata Andagi";
        strr += " ";
        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for(i=0;i<strr.length();i++)
        {
            if(strr.charAt(i) == ' '){
                st.push(str);
                str = "";
            }
            else{
                str += strr.charAt(i);
            }
        }
        String ans = "";
        while(st.size() !=1){
            ans += st.peek() + " ";
            st.pop();
        }
        ans +=st.peek();
        System.out.println(ans);

    }
}