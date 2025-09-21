package Week_5;

import java.util.Scanner;
public class Hexadecimal_Decimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Decimal to Hexadecimal");
        System.out.println("2. Hexadecimal to Decimal");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice){
            case 1:
                System.out.print("Enter a decimal number: ");
                int decimalNum = scan.nextInt();
                String hexNumber = Integer.toHexString(decimalNum).toUpperCase();
                System.out.println("Hexadecimal: " + hexNumber);
                break;

            case 2:
                System.out.print("Enter a hexadecimal number: ");
                String hexNum = scan.nextLine();
                try{
                    int decimal = Integer.parseInt(hexNum, 16);
                    System.out.println("Decimal: " + decimal);
                }catch (NumberFormatException e){
                    System.out.println("Invalid hexadecimal number.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }
        scan.close();
    }
}