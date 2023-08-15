import java.util.HashSet;
public class string_play_leet {
    public static Boolean checker(String str){
        {
            HashSet<Character> char_set = new HashSet<>();
            for(int c  = 0; c< str.length();c++)
            {
                char_set.add(str.charAt(c));
            }
            return char_set.size() == str.length();
        }
    }
    public static void main(String[] args){
        String s1 = "pwwkew";
        String s2 =  new String();
        int big = 0;
        //HashSet<Integer> nums = new HashSet<>();
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<=s1.length();j++){
                s2 = s1.substring(i,j);
                //System.out.println(checker(s2));
                if(checker(s2)){
                    int k = s2.length();
                    if(k>=big){
                        big =k;
                    }
                }    
            }
        }
        System.out.print(big);
    }
}
