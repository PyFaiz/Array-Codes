public class lower_bound_expert {
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
        return current_smol;
    }
    public static void main(String[] args)
    {
        int[] arra2 = {1,3,4,5,6,7};
        int x = 2;
        System.out.println(find_lower_bound(arra2, x));
    }
}
