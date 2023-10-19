public class last_occ_in_sorted {
    public static void main(String[] args) {
        int[] arra = {3,4,13,13,13,20,40};
        int p = 13;
        System.out.println(give_last(arra.length, p, arra));
    }
    public static int give_last(int n,int key,int[] arr)
    {
        int start = 0;
    int end = n - 1;
    int res = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == key) {
        res = mid;
        start = mid + 1;

      } else if (key < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return res;
    }
}
