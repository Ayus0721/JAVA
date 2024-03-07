import java.util.*;

public class Pattern5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        /// outter loop
        for(int i = 1; i <= row ; i++){
            //inner loop for spaces
            for(int j = 1 ;j <= row-i ; j++ ){
                System.out.print(" ");
                
            }
            // inner loop for stars
            for(int j = 1;j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
