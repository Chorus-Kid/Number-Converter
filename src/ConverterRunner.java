import java.util.Scanner;
import java.util.Arrays;

class ConverterRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Converter!");
        System.out.println("--------------------------------");
        System.out.print("Enter the base of your number (2, 8 or 10): ");

        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        int base = Integer.parseInt(choice);

        System.out.print("Enter your number: ");
        String number = s.nextLine();
        int n = Integer.parseInt(number);

        s.close();

        NumberConverter nc = new NumberConverter(n, base);
        if (nc.base == 10) {
            System.out.println("Binary number: " + nc.displayConvertedNumber(nc.convertToBinary()));
            System.out.println("Octal number: " + nc.displayConvertedNumber(nc.convertToOctal()));
        }
        else if (nc.base == 2) {
            System.out.println("Octal number: " + nc.displayConvertedNumber(nc.convertToOctal()));
            System.out.println("Decimal number: " + nc.displayConvertedNumber(nc.convertToDecimal()));
        }
        else if (nc.base == 8) {
            System.out.println("Binary number: " + nc.displayConvertedNumber(nc.convertToBinary()));
            System.out.println("Decimal number: " + nc.displayConvertedNumber(nc.convertToBinary()));
        }
        else {
            System.out.println("Whar");
        }
    }
}

