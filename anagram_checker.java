public class anagram_checker {
    public static void main(String[] args) {
        String a = "RULES";
        String b = "LESRT";
        System.out.println(checker(a, b));
    }

    public static String sorted(String wordSt)
    {
        char[] word=wordSt.toCharArray();

    for(int i=0;i<(word.length-1);i++){
        for(int j=i+1;j>0;j--){
            if(word[j]<word[j-1]){
                char temp=word[j-1];
                word[j-1]=word[j];
                word[j]=temp;
            }
        }
    }
    wordSt=String.valueOf(word);
    return wordSt;
    }
    public static boolean checker(String a , String b)
    {
        if(sorted(a).equals(sorted(b))){
            return true;
        }
        else{
            return false;
        }
    }

}
