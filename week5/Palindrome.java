package week5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();

        TextGame game = new TextGame();
        boolean isPalindrome = game.isPalindrome(input);

        System.out.println("Hasil: " + (isPalindrome ? "Palindrome" : "Bukan Palindrome"));
        
        scanner.close();
    }
}
