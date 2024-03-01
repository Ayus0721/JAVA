import java.util.*;

public class SquareAndCube {
    public static void main(String[] args){
        
        Scanner a = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int x = a.nextInt();
        if (x % 2 == 0){
            System.out.println("the given number is Even \nso,");
            System.out.println("square of " + x +" is " + x*x);
        }
        else{
            System.out.println("the given number is Odd \nso,");
            System.out.println("cube of " + x + " is " + x*x*x);
        }

    }
}
