public class last_coming_in_array {
    public static void main(String[] args) {
        int[] array = {3,4,13,13,13,20,40};
        int[] array2 = {3,4,13,13,13,20,40};
        System.out.println(last_occ(array, 13));
    }

    public static int last_occ(int[] array,int x)
    {
        int start = 0;
        int last = -1;
        int end = array.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(array[mid] == x){
                last = mid;
                start = mid+1;
            }
            else if(array[mid]>x){
                
                end = mid - 1;
            }
            else {
                start = mid +1;
            }
        }
        return last;
    }

}
