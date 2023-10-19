public class odd_finder_pro {
    public static void main(String[] args) {
        String s = "7542351161";
        System.out.println(odd_finder(s));
    }
    public static String odd_finder(String num)
    {
        String lar_odd = "0";
        if(Integer.valueOf(num)%2 != 0){
            return num;
        }
        else{
            for(int i=0;i<num.length();i++){
                String sub = "";
                for(int j=i;j<num.length();j++)
                {
                    sub += num.charAt(j);
                    if(Integer.valueOf(sub)%2 != 0){
                        if(Integer.valueOf(lar_odd) <= Integer.valueOf(sub)){
                            lar_odd = sub;
                        }
                    }
                }
            }
            if(Integer.valueOf(lar_odd)==0){
                return "";
            }
            else{
                return lar_odd;
            }
        }
    }
}
