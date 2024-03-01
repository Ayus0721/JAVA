import java.util.Scanner;

public class GreaterOrNot{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int n1 = s.nextInt();
        System.out.println("Enter the another number here: ");
        int n2 = s.nextInt();
        if (n1 == n2){
            System.out.println("The given two numbers are equal");
        }
        else if (n1>n2) {
            System.out.println(n1 + " is greater than " +n2 );
                        
        }
        else{
            System.out.println(n2 + " is greater than  " + n1);
        }

    }

}