import java.util.Scanner;


public class Calculator {

    /**
     * @param args
     */
    public static void main (String[] args){

        

        System.out.println("Welcome to Ryan's Calculator");
        System.out.println("Please Enter two whole numbers to add. ");
        
        int x = 0;
        int y = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sum = x + y ;
    
        System.out.println("The Sum of the two numbers is " + sum);

        sc.close();
        
        

    }
    
}
