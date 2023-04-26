public class nineth_pattern 
{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=1;i<=5-1;i++){
            for (int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}   