public class BinarySearch {
    static void BinarySearch(int array1[],int n,int x){
        int start = 0;
        int end = n-1;
        boolean found = false;
        int index = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(array1[mid]>x){
                end = mid -1;
            }
            else if(array1[mid] < x){
                start= mid+1;
            }
            else if(array1[mid]==x){
                found = true;
                index = mid;
                break;
            }
        }
        if(found){
            System.out.println("Element found at index " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
        int size = arr.length;
        BinarySearch(arr, size, 5);
    
    }
}
