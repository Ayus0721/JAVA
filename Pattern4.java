import java.util.*;

public class Pattern4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

        int row = sc.nextInt();
        
        for(int i= row; i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
