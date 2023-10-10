public class find_the_missing_num {
    public static void main(String[] args) {
       int[] array = {1,2,4,5};
       System.out.println(find_the_missing(array, 5));
    }

    public static int summer(int N){
        int sum = 0;
        for(int i=1;i<=N;i++){
            sum +=i;
        }
        return sum;
    }

    public static int find_the_missing(int[] nums,int N){
            int predicted_sum = summer(N);
            int actual_sum  = 0;
            int missing;
            for(int i=0;i<nums.length;i++){
                actual_sum += nums[i];
            }
            missing = predicted_sum - actual_sum;

            return missing;
        }
}
