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
            for(int j= 1; j<=row-i;j++){
                System.out.print(" ");

            }
            //first part of star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //second part of star
            for(int j=2;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
        for(int i=1;i<=row;i++){
            //lower half
            //for spaces
            for(int j=2; j<=i;j++){
                System.out.print(" ");
            }
            
            //stars for lower part 
            for(int j=1; j<=row-i;j++){
                System.out.print("*");
            }

            //for second part stars

            for(int j=0;j<=row-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
