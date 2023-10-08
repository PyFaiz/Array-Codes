public class shifty_problem_2_revisit {

    public static void reverse(int[] array,int start,int end){
        while(start <= end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void print_array(int[] arr){
        int i=0;
        while(i<arr.length){
            System.out.printf("%d ",arr[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5,6,7};
        shifter(arr, 2, "right");
        shifter(arr2, 3, "left")    ;
        print_array(arr);
        System.out.println();
        print_array(arr2);
    }
    public static int[] shifter(int[] array,int k,String shift){
        int n = array.length;
        if(shift == "right")
        {  
                reverse(array, n-k, n-1);
                reverse(array, 0, n-k-1);
                reverse(array, 0, n-1);
            return array;
        }
        else
        {
            reverse(array, 0, k-1);
            reverse(array, k, n-1);
            reverse(array, 0, n-1);
            return array;
        }
    }
}
