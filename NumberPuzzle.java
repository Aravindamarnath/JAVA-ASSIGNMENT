import java.util.Scanner;

public class NumberPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        if (isValidNumber(number)) {
            int result;
            if (number > 50) {
                result = findDifferenceOfDigits(number);
            } else {
                result = findDifferenceOfReversedDigits(number);
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid number");
        }
    }

    public static boolean isValidNumber(int number) {
        return number >= 10 && number <= 99;
    }

    public static int findDifferenceOfDigits(int number) {
        int tensDigit = number / 10;
        int onesDigit = number % 10;
        return tensDigit - onesDigit;
    }

    public static int findDifferenceOfReversedDigits(int number) {
        int onesDigit = number % 10;
        int tensDigit = number / 10;
        return onesDigit - tensDigit;
    }
}
