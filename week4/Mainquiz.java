package week4;
import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = new Quiz();

        System.out.println("Selamat data di Quiz Pengetahuan Umum!");
        System.out.println("Jawab semua pertanyaan dengan memilih nomor jawaban yang benar.");

        // looping for each question
        for(int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i);
            System.out.print("Jawaban Anda: ");
            int userAnswer = scanner.nextInt();
            quiz.checkAnswer(i, userAnswer);
        }

        // display final score
        System.out.println("\nQuiz selesai!");
        int totalScore = quiz.getQuestionCount() * 10;
        System.out.println("\nSkor akhir Anda adalah " + quiz.getScore() + " dari " + totalScore);

        // conditional message for user based on their score
        if(quiz.getScore() == totalScore) {
            System.out.println("Selamat! Anda mendapatkan skor sempurna!");
        } else if(quiz.getScore() >= totalScore * 0.7) {
            System.out.println("Bagus! Anda mendapatkan skor di atas rata-rata.");
        } else {
            System.out.println("Belajar lagi ya!");
        }

        // ask user to play again
        System.out.println("Masukkan nama:");
        scanner.nextLine(); // Consume the leftover newline character
        String nama = scanner.nextLine();
        System.out.println("Halo, " + nama + "! Apakah kamu ingin bermain lagi? (ya/tidak)");
        
        if(scanner.nextLine().equalsIgnoreCase("ya")) {
            main(args);
        } else {
            System.out.println("Terima kasih telah bermain!");
        }
    }
}
