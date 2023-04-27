public class eleventh_pattern {
    public static void main(String[] args){
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=8-2*i;k>0;k--){
                System.out.print(" ");
            }
            for(int l=i;l>0;l--){
                System.out.print(l);
            }
                System.out.println();
        }
    } 
}   
