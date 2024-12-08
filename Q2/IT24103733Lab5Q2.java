import java.util.Scanner;

public class IT24103733Lab5Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //Variables defined..
        int newMembers;
        
        System.out.print("Enter the number of new members introduced: ");
        newMembers = scanner.nextInt();

        switch(newMembers) {
        
            case 0 : System.out.print("No prize!");
                      break;
            case 1: System.out.print("Prize is a : Pen");
                       break;
            case 2 : System.out.print("Prize is an : Umbrella");
                       break;           
            case 3: System.out.print("Prize is a : Bag");
                       break;
            case 4: System.out.print("Prize is a : Travelling Chair ");
                       break;
             /* Representation of boolean values are possible. so added an if else loop 
              * if else loop is added to the default: case. 
              */
            default: 
                 if (newMembers>=5) {
                    System.out.print("The prize is a: Headphone");
                 } else {
                    System.out.print("The number of members entered must be equal or greater than 0. please recheck and try again.");

                 }
                      break;

            
            
        }  
        


    }
}