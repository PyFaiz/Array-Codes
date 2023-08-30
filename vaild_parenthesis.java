import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class vaild_parenthesis {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next());}

        long nextLong() {return Long.parseLong(next());}

        double nextDouble() { return Double.parseDouble(next());}

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    public static void main(String[] args) {
        //FastReader s = new FastReader();
        //String sc = s.nextLine();
        System.out.println(isvalid("(]"));
    }

    public static boolean isvalid(String sc){
        int size = sc.length();
        boolean found = false;
        for(int i = 0;i<size;i++){
            if(sc.charAt(i) == '('){
                found = false;
                for(int j=i+1;j<size;j++){
                    if(sc.charAt(j) == ')'){
                        found = true;
                        System.out.println("yes");
                        break;
                    }
                }
            }
            else if(sc.charAt(i) == '{'){
                found = false;
                for(int j=i+1;j<size;j++){
                    if(sc.charAt(j) == '}'){
                        found = true;
                        break;
                    }
                }
            }
            else if(sc.charAt(i) == '['){
                found = false;
                for(int j=i+1;j<size;j++){
                    if(sc.charAt(j) == ']'){
                        found = true;
                        break;
                    }
                }
            }
            

        }
        return found;
    }
}
//Note: this solutions fails testcases as it does not ceheck the order of the parenthsis like ([)] should return false but this program returns
//true but since i spended a good hour on this i should upload it