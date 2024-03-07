import java.util.*;

public class Pattern2 {
    public static void main(String [] args){

        Scanner se = new Scanner(System.in);

        System.out.println("Enter the number of rows ");
        int row = se.nextInt();
        
        System.out.println("Enter the Number of coloums ");
        int col = se.nextInt();
        

        for (int i = 1; i<= col; i++){
            for (int j = 1; j<= row;j++){
                if (i==1 || j==1 ||i==row || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
    
}
