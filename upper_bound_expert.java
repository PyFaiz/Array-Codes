public class upper_bound_expert {
    public static void main(String[] args) {
        
    }

    public static int find_upper_bound(int[] array,int x)
    {
        int end = array.length;
        int start = 0;
        int current_big = end;
        while(start<=end)
        {
            int mid = (start + end)/2;
            if(array[mid] >= x){
                current_big = mid;
                end = mid -1; 
            }
            else if(array[mid]>x){
                start = mid +1;
            }
        }
        return current_big;
    }
}
