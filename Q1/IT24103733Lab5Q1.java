import java.util.Scanner;

public class IT24103733Lab5Q1 {
    public static void main(String[] args) {

       
        //defining the variables..
        int num1, num2, num3;
        int smallestVal, largestVal;
        
     
        
        Scanner scanner = new Scanner(System.in);

        //getting user inputs
        System.out.print("Enter the first integer number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = scanner.nextInt();

        System.out.print("Emter the third integer: ");
        num3 = scanner.nextInt();
         // initialized the variables..
         smallestVal = num1;
         largestVal = num1;

        // this will compare num1 value with the other two inputs accordingly.
        
        if (num1 <= num2 && num1 <= num3) { 
            smallestVal = num1;
         } else if (num2 <= num1 && num2 <= num3) { 
            smallestVal = num2; 
        } else { smallestVal = num3; }
        
        if (num1 >= num2 && num1 >= num3) { 
            largestVal = num1; 
        } else if (num2 >= num1 && num2 >= num3) {
          largestVal = num2;
         } else { 
             largestVal = num3;
         }
                
        
        

        //outputs

        System.out.println("The numbers entered by the user: " + num1 +"," + num2 + "," + num3);
        System.out.println("The largest integer number: " + largestVal);
        System.out.println("The smaallest integer number: " + smallestVal);
    }
}