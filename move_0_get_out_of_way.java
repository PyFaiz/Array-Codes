public class move_0_get_out_of_way {
    public static void main(String[] args) {
        int[] array = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        move_0_to_end(array);
        print_array(array);
    }
    public static void print_array(int[] arr){
        int i=0;
        while(i<arr.length){
            System.out.printf("%d ",arr[i]);
            i++;
        }
    }

    public static void move_0_to_end(int[] array){
        for(int i=0;i<array.length;i++){
            if(array[i] == 0){
                for(int j = i+1;j<array.length;j++){
                    if(array[j]!=0){
                        int temp  = array[i];
                        array[i]  = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
    }
}
