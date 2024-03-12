import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        
        //outer loop
        for(int i= 1 ; i<= row; i++){
            //inner loop
            //spaces
            
            for(int j=row-i; j>=1; j--){
                System.out.print(" ");
            }
            
            // Number   
            for (int j=1;j<= i;j++){
                System.out.print(i +" ");
                
            }
            System.out.println();
        }

    }
}