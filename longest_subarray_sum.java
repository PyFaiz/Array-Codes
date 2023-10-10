public class longest_subarray_sum {
    public static void main(String[] args) {
        int[] array = {-1, 1, 1};
        System.out.println(longest_sum(array, 1));
    }

    public static int longest_sum(int[] array,int k){
        int count = 0;
        int max = 0;
        int sum = 0;
        for(int i=0;i<array.length;i++){    
            sum = 0;
            count = 0;
            sum += array[i];
            count++;
            for(int j=i+1;j<array.length;j++){
                sum += array[j];
                count++;
                if(sum == k){
                    if(max<=count){
                        max = count;
                    }
                }
            }
        }



        return max;

    }

}
