import java.util.Scanner;


public class Calculator {

    /**
     * @param args
     */
    public static void main (String[] args){

        

        System.out.println("Welcome to Ryan's Calculator");
        //System.out.println("Please Enter two whole numbers . ");
       System.out.println("Please Enter two numbers . ");
        //int x = 0; //push 1 & 2
        //int y = 0;
        double y = 0;
        double x = 0;
        //int sum = 0;
        
        

        Scanner sc = new Scanner(System.in);
        //x = sc.nextInt();
        //y = sc.nextInt();
        y = sc.nextDouble();  //push 4 req
        x = sc.nextDouble(); //push 4 req

        //sum = sc.nextInt();
        //System.out.println("would you like to add or subtract"); //push 2 req
        System.out.println("would you like to add or subtract, multiply, or divide "); // push 3 req
        String opp = sc.next(); //push 2 req
        
      //int result;
      //if (opp.equalsIgnoreCase("add")) {
         //Calculate the sum of the two numbers
       // result = x + y;
        //System.out.println("The sum of " + x + " and " + y + " is: " + result);
    //} else if (opp.equalsIgnoreCase("subtract")) {
         //Calculate the difference of the two numbers
      // result = x - y;
       // System.out.println("The difference of " + x + " and " + y + " is: " + result);               //required for push 2
    //} else {
      //  System.out.println("Invalid operation selected. Please enter 'add' or 'subtract'.");
    //}

//    double result = 0;
//     switch (opp.toLowerCase()) {
//         case "add":
//             result = x + y;
//             System.out.println("The sum of " + x + " and " + y + " is: " + result);
//             break;
//         case "subtract":
//             result = x - y;
//             System.out.println("The difference of " + x + " and " + y + " is: " + result);
//             break;
//         case "multiply":
//             result = x * y;
//             System.out.println("The product of " + x + " and " + y + " is: " + result);                  // required for push 3 
//             break;
//         case "divide":
//             if (y == 0) {
//                 System.out.println("Error! Division by zero is not allowed.");   // required for push 5
//             } else {
//                 result = (double) x / y;
//                 System.out.println("The result of dividing " + x + " by " + y + " is: " + result);
//             }
//             break;
//         default:
//             System.out.println("Invalid operation selected.");
//     }
      
       // sum = x + y ;                  //  required for push 1


        double result = 0;
        switch (opp.toLowerCase()) {
            case "add":
               result = x + y;
               System.out.println("The sum of " + x + " and " + y + " is: " + result);
               break;
           case "subtract":
               result = x - y;
               System.out.println("The difference of " + x + " and " + y + " is: " + result);
               break;
           case "multiply":
               result = x * y;
               System.out.println("The product of " + x + " and " + y + " is: " + result);        // push 4 req
               break;
           case "divide":
               if (y == 0) {
                   System.out.println("Error! Division by zero is not allowed.");
               } else {
                   result = x / y;
                   System.out.println("The result of dividing " + x + " by " + y + " is: " + result);
                }
               break;
           default:
               System.out.println("Invalid operation selected.");



        
       
        
        
    
        
    //System.out.println("The Sum of the two numbers is " + sum);     //push 1 req 

        //sc.close();
        
        

    }
   sc.close();

  }
}
    

