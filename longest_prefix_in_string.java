import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class longest_prefix_in_string {
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
        FastReader s = new FastReader();
        int n = s.nextInt();
        String[] st = new String[n];
        for(int i=0;i<n;i++){
            st[i] = s.nextLine();
        }
        System.out.println(longestcommonprefix(st));

    }


    public static String longestcommonprefix(String[] strs){
        int x = strs.length - 1;
        sort(strs);
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i) == strs[x].charAt(i)){
                sb.append(strs[0].charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }

    public static void sort(String[] strs){
        int size = strs.length;
        for(int i = 0;i<size-1;i++){
            for(int j = i+1;j<strs.length;j++){
                if (strs[i].compareTo(strs[j]) > 0){
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }
    }

}
