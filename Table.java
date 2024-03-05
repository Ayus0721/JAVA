import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want to find table ");

        int n = sc.nextInt();
        int table = 0;

        for (int i=1; i<=10;i++){
            table = n*i;
            System.out.println(n + " times " + i + " is " + table);
        
        }
        
    }
    

    
}
