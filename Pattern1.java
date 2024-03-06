import java.util.*;

public class Pattern1 {
    public static void main(String [] args ){

        Scanner sc = new Scanner(System.in);

        System.out.println("Solid Rectangle");
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter coloums");
        int col = sc.nextInt();

        for (int i = 1; i<=rows; i++ ){
            for(int j = 1; j <=col;j++){
                System.out.print("*");

            } 
            System.out.println("");
        }
    }
    
}
