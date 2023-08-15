public class InsertionSort {
    static void isort(int array1[],int n){
        for(int i=0;i < n;i++){
            for(int j=i;j > 0 && array1[j-1]>array1[j];j--){
                int temp = array1[j];
                    array1[j] = array1[j-1];
                    array1[j-1] = temp;
            }
        }

        for(int i=0;i<5;i++){
            System.out.print(array1[i] + " ");
        }
    }
    
    
    
    public static void main(String[] args) {
        int array1[] = {5,3,1,7,8};
        int size = array1.length;
        isort(array1,size);
    }
}
