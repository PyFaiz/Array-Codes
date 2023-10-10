public class appear_one_by_one_pls {
    public static void main(String[] args) {
        int[] array = {2,2,1};
        System.out.println(find_singles_xor(array));
        // System.out.println(find_singles(array));
    }

    public static int find_singles(int[] array){
        int single = 0;
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum = 0;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    sum++;
                }
            }
            if(sum<2){
                single = array[i];
            }
        }
        
        return single;
    }

    public static int find_singles_xor(int[] array){
        int xor = array[0];
        for(int i=1;i<array.length;i++){
            xor = xor ^ array[i];
        }
        return xor;
    }
}
