import java.util.Scanner;

public class OddOrEven {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int x = sc.nextInt();
        
        if (x%2 == 0){
            System.out.println("The given number i.e. " + x + " is Even"  );

        }
        else{
            System.out.println("The Given number i.e. " + x + " is Odd " );

        }

    }
    
}
