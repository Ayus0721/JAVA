import java.util.*;

public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int Button = sc.nextInt();

        if (Button == 1){
            System.out.println("Hello");
        }else if (Button == 2){
            System.out.println("Namaste");
        }else if (Button == 3){
            System.out.println("Tasla Master");
        }

        else{
            System.out.println("Invalid Number");
        }
    }
}
