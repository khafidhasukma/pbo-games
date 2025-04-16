package week5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();
        
        TextGame game1 = new TextGame();
        game1.displayResult(input);

        System.out.println();

        TextGame game2 = new FancyTextGame();
        game2.displayResult(input);

        scanner.close();
    }
}
