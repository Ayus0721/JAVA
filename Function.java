import java.util.*;
public class Function {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();

        int sum = calculateSum(x, y);
        System.out.println(sum);

    }
    
}
