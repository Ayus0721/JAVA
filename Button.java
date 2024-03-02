import java.util.*;

public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int Button = sc.nextInt();

       switch (Button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("khajoor khaoge ?");
            break;
            default : System.out.println("Please enter valid number");
            
        }
    }
}
