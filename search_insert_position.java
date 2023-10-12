public class search_insert_position {
    public static void main(String[] args) {
        int[] arra = {1,2,4,7};
        System.out.println(inserted(arra, 2));
    }

    public static int inserted(int[] arra,int x)
    {
        int n = arra.length;
        int start = 0;
        int current_smol = n;
        int end = n;
        int mid = (start+end)/2;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(arra[mid]>x)
            {       
                current_smol = mid;
                end = mid-1;
            }
            else if(arra[mid]<x)
            {
                start = mid+1;
            }
            else if(arra[mid] == x){
                return 1;
            }
        }
        return current_smol;
    }

    
}

