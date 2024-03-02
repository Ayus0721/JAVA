import java.util.*;


public class Calculator {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        int r = 0;
        while (r==0) {
            System.out.println("***************************************************************************************************************");
        System.out.println("                                              Welcome                         " );
        System.out.println("                           Enter The Functions you What to perform:           " );
        System.out.println("                                Press 1 for Addition                          " );
        System.out.println("                                Press 2 for Subtraction                       " );
        System.out.println("                                Press 3 for Multiplication                    " );
        System.out.println("                                Press 4 for Division                          " );
        System.out.println("                                Press 5 for Exit                              " );
        System.out.println("***************************************************************************************************************");
        
        int a = sc.nextInt();

        if (a==5){
            r=1;
        }
        else{
            System.out.println("Enter the first number " );
        float x =sc.nextFloat();
        System.out.println("Enter the second number ");
        float y = sc.nextFloat();

        
        switch(a){
            
            case 1: 
            float add = x+y;
            System.out.println("Addition of "+ x + " and " + y + " is " + add );
            break;
            case 2:
            if(x >y ){
                float sub = x-y ;
                System.out.println("Subtraction is: " + sub );
                
            } 
            else{
                float sub = y-x;
                System.out.println("Subtraction is: " + sub);
                
            }
            break;
            case 3:
                System.out.println("Multiplication of the given two numbers are " + x*y );
            break;
            case 4: 
            if (x > y){
                float divi = x/y;
                System.out.println("Division between two numbers are: " + divi);
            }      
            else{
                float divi = y/x ;
                System.out.println("Division between two numbers are: " + divi);
            }
            break;
            default:
            System.out.println("Please Enter the valid button");

        }

        }
                   
        }

    }
    
}
