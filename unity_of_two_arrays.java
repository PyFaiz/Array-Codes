import java.util.ArrayList;
public class unity_of_two_arrays {
    public static void print_array(int[] arr){
        int i=0;
        while(i<arr.length){
            System.out.printf("%d ",arr[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};
        ArrayList<Integer> union = unite(arr1, arr2);
        for(int val:union){
            System.out.print(val + " ");
        } 
    }

    public static ArrayList<Integer> unite(int[] array1,int[] array2){
        int i=0,j=0;
        ArrayList<Integer> union = new ArrayList<>(); 
        while(i<array1.length && j<array2.length){
            if(array1[i]<=array2[j]){
                if(union.size()==0 || union.get(union.size()-1)!=array1[i]){
                    union.add(array1[i]);
                }
                i++;
            }
            else {
                if(union.size()==0 || union.get(union.size()-1)!=array2[j]){
                    union.add(array2[j]);
                }
                j++;
            }
        }
        while(i<array1.length){
            if(union.get(union.size()-1)!=array1[i]){
                union.add(array1[i]);
            }
            i++;

        }
        while(j<array2.length){
            if(union.get(union.size()-1)!=array2[j]){
                union.add(array2[j]);
            }
            j++;
        }
        return union;
        }
    }
