import java.util.*;

public class Rhombus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        
        //upper half pattern
        for(int i= 1 ; i<= row; i++){
            //1st part
            for(int j=row-i; j>=1; j--){
                System.out.print(" ");
            }

            
            for(int j= 1; j<=row;j++){
                System.out.print("*");
            }
            
            System.out.println();           
        }
    } 
    
}
