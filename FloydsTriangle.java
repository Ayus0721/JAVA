import java.util.*;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        int number= 1;


        for (int i = 1 ; i <=row ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(number+" ");
                number++;

            }
            System.out.println();
        }

    }
    
}
