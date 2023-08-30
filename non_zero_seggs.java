import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class non_zero_seggs{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        

    System.out.println(finding_zero_adding_insertions(arr, n));
}

    static int finding_zero_adding_insertions(int [] arra,int n){
        Set<Integer> set = new HashSet<>();
    set.add(0);
    int r = 0;
    int pre = 0;
    for(int i=0;i<n;i++){
        pre += arra[i];
        if(set.contains(pre)){
            r++;
            set.clear();
            set.add(0);
            pre = arra[i];
        }
    set.add(pre);
    }
        return r;
    }
}