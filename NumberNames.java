import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        String number = scanner.next();

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            String name = getNumberName(digit);
            System.out.print(name + " ");
        }
    }

    public static String getNumberName(char digit) {
        switch (digit) {
            case '0':
                return "zero";
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
            default:
                return ""; // Return empty string for invalid characters
        }
    }
}
