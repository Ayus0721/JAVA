import java.util.*;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner se = new Scanner(System.in);

        System.out.println("Enter the number of rows ");
        int row = se.nextInt();

        // the pattern is about half pyramid
        
        for (int i = 1; i<=row;i++){
            for (int j = 1; j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
    
}
