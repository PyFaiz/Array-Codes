import java.util.Scanner;
class SelectionSort {
    public static void main(String args[]){
        int numbers[] = new int[10];
        int array1[] = {5,3,1,7,8};
        int array2[] = new int[5];
        Scanner scan =  new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(array1[i]<array1[j]){     
                    array1[j] = array1[i] + array1[j] - (array1[i] = array1[j]);               
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(array1[i] + " ");

        }
    }
}