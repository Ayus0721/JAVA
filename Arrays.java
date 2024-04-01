import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int[] marks= new int[3];
        // marks[0]=86;
        // marks[1]=67;
        // marks[2]=32;

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[]=new int[size];

        System.out.println("Enter the value in array ");
        for(int i=0;i<size;i++){
            marks[i]= sc.nextInt();
        }
        System.out.println("elements stored in arrays are");
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
