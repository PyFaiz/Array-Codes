public class floor_and_ceil {
    public static void main(String[] args) {
        int[] array = {3, 4, 4, 7, 8, 10};
        System.out.println(find_lower_bound(array, 5));
    }
    
    
    public static int find_lower_bound(int[] arra,int x)
    {
        int n = arra.length;
        int start = 0;
        int current_smol = n;
        int end = n;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arra[mid]>=x)
            {       
                current_smol = mid;
                end = mid-1;
            }
            else if(arra[mid]<x)
            {
                start = mid+1;
            }
        }
        return arra[current_smol];
    }    
}
