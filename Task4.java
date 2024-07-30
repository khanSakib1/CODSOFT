import java.util.Scanner;

class Question {
    private String questionText;
    private String[] options;
    private char correctAnswer;

    public Question(String questionText, String[] options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }


    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((char)('A' + i) + ". " + options[i]);
        }
    }


    public boolean isCorrectAnswer(char answer) {
        return Character.toUpperCase(answer) == correctAnswer;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = new Question[] {
            new Question("What is the capital of India?", new String[] {"Mumbai", "Delhi", "Kolkata", "Chennai"}, 'B'),
            new Question("Who is known as the Father of the Indian Nation?", new String[] {"Jawaharlal Nehru", "Subhash Chandra Bose", "Mahatma Gandhi", "Sardar Patel"}, 'C'),
            new Question("Which Indian city is known as the Silicon Valley of India?", new String[] {"Hyderabad", "Mumbai", "Bengaluru", "Pune"}, 'C')
        };

        int score = 0;


        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Your answer: ");
            char answer = scanner.next().charAt(0);

            if (question.isCorrectAnswer(answer)) {
                System.out.println("Correct! Well done.");
                score++;
            } else {
                System.out.println("Incorrect. Better luck next time.");
            }
        }

    
        System.out.println("You scored " + score + " out of " + questions.length);
        scanner.close();
    }
}
