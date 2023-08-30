import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class number_palindrome{
    public static void main(String[] args) {
        //System.out.println("Hello")
        FastReader f = new FastReader();
        int x = f.nextInt();
        System.out.println(ispalidrome(x));

    }

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

    static public boolean ispalidrome(int x){
        String s = Integer.toString(x);
        int end = s.length() - 1;
        int start = 0;
        while(start <= end){
            if(s.charAt(start) == s.charAt(end)){
                start+=1;
                end -=1;
            }
            else {
                return false;
            }
        }
        return true;
    }
}

