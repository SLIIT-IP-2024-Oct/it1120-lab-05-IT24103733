import java.util.Scanner;

public class IT24103733Lab5Q3 {
    
    // defining and assigning values to the constants
    public static final double room_charge_perDay = 48000.00;
    public static final int discount_rate_3_4Days = 10;  // 10%
    public static final int discount_rate_5_or_moreDays = 20;  // 20%
    public static final int minDay = 1;
    public static final int maxDay = 31;

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        // inputting the start date and end date of the stay
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // validation of start day and the end day
        if ((startDate < minDay || startDate > maxDay) || (endDate < minDay || endDate > maxDay)) {
            System.out.println("Error: Days must be between " + minDay + " and " + maxDay);
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        // number of days reserved
        int daysReserved = endDate - startDate;

        // determining the discount rate according to the number of days stayed
        int discountRate = 0;
        if (daysReserved >= 5) {
            discountRate = discount_rate_5_or_moreDays;
        } else if (daysReserved >= 3) {
            discountRate = discount_rate_3_4Days;
        }

        // Calculate total amount
        double totalAmount = daysReserved * room_charge_perDay;
        double discountAmount = totalAmount * discountRate / 100;
        double amountToPay = totalAmount - discountAmount;

        // Output
        System.out.println("\nRoom Charge Per Day: Rs. " + room_charge_perDay);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount: Rs." + totalAmount);
        System.out.println("Discount: " + discountAmount);
        System.out.println("Total Amount to be Paid: Rs. " + amountToPay);

        scanner.close();
    }
}
