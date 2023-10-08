public class shifty_problem_2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,5,6};
        shift_by_x(array, 2, "left");
        for(int i =0;i<array.length;i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println();
        shift_by_x(array2, 2, "right");
        for(int i =0;i<array2.length;i++){
            System.out.printf("%d ",array2[i]);
        }
    }
    public static int[] shift_by_x(int[] array,int k,String shift){
        if(shift=="right")
        {
            for(int i=array.length-1;i>=k;i--){
                int temp = array[i];
                array[i] =array[i-k];
                array[i-k]=temp;
            }
            return array;
        }
        else if(shift=="left"){
            for(int i=0;i<array.length-k;i++){
                int temp = array[i];
                array[i] =array[i+k];
                array[i+k]=temp;
            }
            return array;
        }
        else{
            return array;
        }
    }
}
