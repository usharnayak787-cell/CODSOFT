import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Currency Converter");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double convertedAmount = 0;
        switch (choice) {
            case 1:
                convertedAmount = amount * 0.012;
                System.out.println("Converted Amount: $" + convertedAmount);
                break;
            case 2:
                convertedAmount = amount * 83.0;
                System.out.println("Converted Amount: Rs " + convertedAmount);
                break;
            case 3:
                convertedAmount = amount * 0.011;
                System.out.printf("Converted Amount: %.2f Euro%n", convertedAmount);
                break;
            case 4:
                convertedAmount = amount * 90.0;
                System.out.println("Converted Amount: Rs " + convertedAmount);
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}

