import java.util.*;

public class Pattern8 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        for (int i=1 ; i<=row ; i++){
            //inner loop 
            for(int j=1 ; j<=i; j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
}
