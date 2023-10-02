public class second_largers_ele_in_array {
    public static void main(String[] args) {
        int[] arra2 = {4,6,1,3,8,9};
        System.out.println(find_2nd_largest(arra2));
    }
    public static int find_2nd_largest(int[] array)
    {    
        int n = array.length;
        int first_largest_num = array[0];
        int second_largest_num = array[0];

        for(int i=0;i<n;i++)
        {
            if(array[i]>=first_largest_num)
            {
               second_largest_num = first_largest_num;
               first_largest_num = array[i];
            }
        }
        return second_largest_num;
    }
}
