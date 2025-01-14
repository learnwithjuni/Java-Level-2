import java.io.*;
import java.util.*;

/* This project stores the question bank as a map where keys are categories and values are an ArrayList of Question objects for that category. There are many different ways to design a Triva Game project, please encourage your student to brainstorm and talk through their design ideas. */

public class TriviaGame {
    private Map<String, ArrayList<Question>> questionBank; 
    private int score;

    public TriviaGame() {
        questionBank = new HashMap<>();
        score = 0;

    }

    private void loadQuestionsFromFile() {
        try {
            File myFile = new File("Questions.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String category = myReader.nextLine();
                String questionText = myReader.nextLine();
                ArrayList<String> options = new ArrayList<>(Arrays.asList(myReader.nextLine().split(",")));
                String correctAnswer = myReader.nextLine();
                Question question = new Question(questionText, options, correctAnswer);

                // Add question to the appropriate category
                if (questionBank.containsKey(category)) {
                    ArrayList<Question> questionList = questionBank.get(category);
                    questionList.add(question);
                } else {
                    ArrayList<Question> qs = new ArrayList<>();
                    qs.add(question);
                    questionBank.put(category, qs);
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading file!");
        }
    }


    // Method to display questions
    private void displayQuestion(Question question) {
        System.out.println(question.getQuestion());
        ArrayList<String> options = question.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    // Method to start the game
    public void startGame() {
        loadQuestionsFromFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Trivia Quiz Game!");
        System.out.println("Choose a category: " + questionBank.keySet());
        String category = scanner.nextLine();

        if (!questionBank.containsKey(category)) {
            System.out.println("Invalid category. Exiting game.");
            return;
        }

        ArrayList<Question> questions = questionBank.get(category); 
        for (Question question : questions) {
            displayQuestion(question); // Display question and options
            System.out.print("Your answer (enter number): ");
            int answerIndex = scanner.nextInt() - 1;

            if (question.getOptions().get(answerIndex).equals(question.getCorrectAnswer())) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + question.getCorrectAnswer() + "\n");
            }
        }

        System.out.println("Your final score: " + score + "/" + questions.size());
        saveScore(score, category);
    }

    // Static method to save high score to file
    public static void saveScore(int score, String category) {
        try (FileWriter writer = new FileWriter("highscores.txt", true)) {
            writer.write("Category: " + category + " | Score: " + score + "\n");
            System.out.println("Your score has been saved.");

        } catch (IOException e) {
          System.out.println("Error saving score.");
        }
    }

    // Method to display high scores
    public static void showHighScores() {
        try {
            File myFile = new File("highscores.txt");
            Scanner reader = new Scanner(myFile);
            String line;
            System.out.println("\nHigh Scores:");
            while (reader.hasNextLine()) {
                line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading high scores.");
        }
    }
}
