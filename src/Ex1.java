import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int userInput = scanner.nextInt();

        if (isPalindrome(userInput)) {
            System.out.println(userInput + " является палиндромом.");
        } else {
            System.out.println(userInput + " не является палиндромом.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    }
