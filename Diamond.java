import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = s.nextInt();

        //outer loop
        for(int i = 1; i<=row;i++){
            //upper half

            //for spaces
            for(int j=1; j<=row-i;j++){
                System.out.print(" ");

            }
            for (int j=0; j<=2*(i-1); j++){
                System.out.print("*");
            } 
            System.out.println();
        }

        //lower half
        for(int i=row;i>=1;i--){
            
            //for spaces
            for(int j=1; j<=row-i;j++){
                System.out.print(" ");

            }
            for (int j=0; j<=2*(i-1); j++){
                System.out.print("*");
            } 
            System.out.println();
            
        }
    }
}
