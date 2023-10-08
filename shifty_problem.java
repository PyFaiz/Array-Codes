public class shifty_problem {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        shift_by_one(array);
        int i=0;
        while(i<array.length){
            System.out.printf("%d ",array[i]);
            i++;
        }
    }


    public static int[] shift_by_one(int[] array){
        for(int i=1;i<array.length;i++){
            array[i-1] = array[i-1]+array[i];
            array[i] = array[i-1]-array[i];
            array[i-1] =  array[i-1]-array[i];
        }
        return array;
    }
}
