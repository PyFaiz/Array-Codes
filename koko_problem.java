public class koko_problem
{
    public static void main(String[] args){
        int[] arr = {30,11,23,4,20};
        System.out.println(eat_speed(arr,5));
    }
    public static int eat_speed(int[] piles,int h){
        int start = 1;
        int end = find_max(piles);
        int result = end;

        while(start<=end){
            int mid = (start + end)/2;
            int hours = 0;
            for(int i=0;i<piles.length;i++){
                hours += Math.ceil((double)(piles[i]) /(double)(mid));
            }
            if(hours <=h){
                result = Math.min(result,mid);
                end = mid -1;
            }
            else{
                start  = mid +1;
            }
        }
        return result;
    }


    public static int find_max(int[] arr){
        int i; 
        int max = arr[0]; 
        for (i = 1; i < arr.length; i++) 
            if (arr[i] > max) 
                max = arr[i]; 
         
        return max; 
    }
}