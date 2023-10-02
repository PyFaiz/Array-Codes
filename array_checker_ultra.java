public class array_checker_ultra {
    public static void main(String[] args) {
        int[] arrra =  {1,2,10,4,5};
        System.out.println(checker(arrra));
    }

    public static boolean checker(int[] array){
        for(int i=1;i<array.length;i++)
        {
            if(array[i-1]>array[i]){
                return false;
            }
        }
        return true;
    }
}
