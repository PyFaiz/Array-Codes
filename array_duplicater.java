public class array_duplicater {
    public static void main(String[] args) {
        int[] array = {1,1,2,2,2,3,3};
        System.out.println(remove_duplicate(array));
    }

    public static int remove_duplicate(int[] array)
    {
        int size =  array.length;   
        int i = 0;
        for(int j=1;j<size;j++){
            if(array[i]!=array[j]){
                i++;
                array[i]=array[j];
            }
        }
        int k=0;
        while(k<size){
            System.out.printf("%d ",array[k]);
            k++;
        }
        System.out.println();
        return i+1;
    }
}
