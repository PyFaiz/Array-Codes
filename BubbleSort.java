public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {7,4,10,20,12};
        for(int i=0;i<5;i++){
            for(int j=1;j<(5-i);j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }

        for(int i=0;i<5;i++){
            System.out.print(nums[i] + " ");

        }
    }
}
