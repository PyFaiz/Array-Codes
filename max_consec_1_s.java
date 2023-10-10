public class max_consec_1_s {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 0, 1};
        System.out.println(tell_me_1(array));
    }


    public static int tell_me_1(int[] array){
        int max = 0;
        int current = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == 1){
                current ++;
                if(i==array.length-1){
                    if(current>=max){
                    max = current;
                }
                }
            }
            else if(array[i] == 0){
                if(current>=max){
                    max = current;
                }
                current = 0;
            }
        }
        return max;
    }
}
