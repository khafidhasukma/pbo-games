package week4;

public class Quiz {
    // questions for the quiz
    private String[] questions = {
        "Ibu Kota Indonesia adalah?",
        "Siapa Presiden Indonesia saat ini?",
        "Siapa penemu lampu?",
        "Hewan apa yang paling pendiam?",
        "Planet terbesar di tata surya?",
        "Berapa jumlah hari dalam satu minggu?",
        "Apa nama ibu kota Jawa Barat?",
        "Siapa penemu gravitasi?",
        "Siapa manusia pertama yang mendarat di bulan?",
        "Rumus luas persegi panjang adalah?"
    };

    // options for each question
    private String[][] options = {
        {"1. Jakarta", "2. Bandung", "3. Surabaya", "4. Yogyakarta"},
        {"1. Jokowi", "2. Prabowo", "3. SBY", "4. Gus Dur"},
        {"1. Thomas Alva Edison", "2. Albert Einstein", "3. Isaac Newton", "4. Galileo Galilei"},
        {"1. Harimau", "2. Semute", "3. Gajah", "4. Kucing"},
        {"1. Jupiter", "2. Mars", "3. Bumi", "4. Saturnus"},
        {"1. 5", "2. 6", "3. 7", "4. 8"},
        {"1. Bandung", "2. Jakarta", "3. Bogor", "4. Depok"},
        {"1. Albert Einstein", "2. Isaac Newton", "3. Galileo Galilei", "4. Thomas Alva Edison"},
        {"1. Neil Armstrong", "2. Yuri Gagarin", "3. Buzz Aldrin", "4. John Glenn"},
        {"1. p x l", "2. p + l", "3. p x p", "4. l x l"}
    };

    // correct answers for each question
    private int[] correctAnswers = {1, 2, 1, 2, 1, 3, 2, 2, 1, 1};

    // score for the quiz
    private int score = 0;

    // method to get total question count
    public int getQuestionCount() {
        return questions.length;
    }

    // method to display question
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for(int j = 0; j < options[index].length; j++) {
            System.out.println(options[index][j]);
        }
    }

    // method to check user answer
    public void checkAnswer(int index, int userAnswer) {
        if(userAnswer == correctAnswers[index]) {
            System.out.println("Jawaban Anda benar!");
            score += 10;
            System.out.println("Skor Anda saat ini: " + score);
        } else {
            System.out.println("Salah! Jawaban yang benar adalah " + options[index][correctAnswers[index] - 1]);
        }
    }

    // method to get final score
    public int getScore() {
        return score;
    }
}