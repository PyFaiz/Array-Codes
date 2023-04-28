import java.util.Arrays;
public class basic_hashing {
    public static void main(String[] args){
            //int arr[] = new int[5];
            int arr[] = {2,2,3,4,4,2};
            //Arrays.fill(arr, 0);
            int n=arr.length;
            int hashh[] =  new int[20];
            Arrays.fill(hashh,0);
            int k =  hashh.length;
            for(int i=0;i<n;i++){
                hashh[arr[i]] +=1;
            }
            for(int j=0;j<k;j++){
                if(hashh[j]!=0){
                    System.out.println(j+" "+hashh[j]);
                }
            }
    }
}
