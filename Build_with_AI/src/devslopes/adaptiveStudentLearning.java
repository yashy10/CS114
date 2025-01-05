package devslopes;
//Made using AI(Google Gemini)
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Question {
    String question;
    String answer;
    double difficulty;

    public Question(String question, String answer, double difficulty) {
        this.question = question;
        this.answer = answer;
        this.difficulty = difficulty;
    }
}

class AdaptiveLearner {
    private double knowledgeLevel = 0.5;
    private List<Question> questionBank = new ArrayList<>();
    private Set<Question> askedQuestions = new HashSet<>();
    private Map<Question, Boolean> performanceTracker = new HashMap<>();

    public AdaptiveLearner() {
        // Initialize the question bank
        questionBank.add(new Question("What is 2+2?", "4", 0.2));
        questionBank.add(new Question("Solve for x: 2x + 5 = 11", "3", 0.5));
        questionBank.add(new Question("Integrate x^2 dx", "x^3/3 + C", 0.8));
        questionBank.add(new Question("What is the derivative of x^3?", "3x^2", 0.7));
        questionBank.add(new Question("What is 7 * 8?", "56", 0.3));
        questionBank.add(new Question("Solve for x: x^2 - 4 = 0", "2 or -2", 0.4));
        questionBank.add(new Question("What is the integral of 1/x dx?", "ln|x| + C", 0.9));
        questionBank.add(new Question("What is 15/3?", "5", 0.2));
        questionBank.add(new Question("Simplify: (x^2 + 2x + 1) / (x + 1)", "x + 1", 0.6));
        questionBank.add(new Question("What is 3^3?", "27", 0.3));
        questionBank.add(new Question("What is the derivative of sin(x)?", "cos(x)", 0.7));
        questionBank.add(new Question("Solve for x: 3x - 2 = 7", "3", 0.4));
        questionBank.add(new Question("What is 9 * 9?", "81", 0.3));
        questionBank.add(new Question("Evaluate the limit: lim x->0 (sin(x)/x)", "1", 0.8));
        questionBank.add(new Question("What is the square root of 64?", "8", 0.2));
        questionBank.add(new Question("Solve for x: 5x + 10 = 0", "-2", 0.4));
        questionBank.add(new Question("Differentiate e^x", "e^x", 0.5));
        questionBank.add(new Question("What is 6 * 7?", "42", 0.3));
        questionBank.add(new Question("Integrate cos(x) dx", "sin(x) + C", 0.7));
        questionBank.add(new Question("What is 100/4?", "25", 0.3));
        questionBank.add(new Question("Evaluate: (12 + 3) / 3", "5", 0.2));
        questionBank.add(new Question("What is the derivative of ln(x)?", "1/x", 0.8));
        questionBank.add(new Question("Simplify: (2x^2 + 6x) / 2x", "x + 3", 0.5));
        questionBank.add(new Question("What is 5^2?", "25", 0.3));
        questionBank.add(new Question("Solve for x: x^2 + 2x - 15 = 0", "3 or -5", 0.6));
        questionBank.add(new Question("Evaluate the limit: lim x->∞ (1/x)", "0", 0.6));
        questionBank.add(new Question("Integrate 3x^2 dx", "x^3 + C", 0.8));
        questionBank.add(new Question("What is 12 * 11?", "132", 0.4));
        questionBank.add(new Question("Simplify: (x^3 - x) / x", "x^2 - 1", 0.5));
        questionBank.add(new Question("What is the cube root of 27?", "3", 0.2));
    }

    public void simulateLearning(int numQuestions) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numQuestions; i++) {
            Question currentQuestion = selectQuestion();
            if (currentQuestion == null) {
                System.out.println("No more unique questions available.");
                break;
            }
            System.out.println(currentQuestion.question);
            String userAnswer = scanner.nextLine();

            askedQuestions.add(currentQuestion);
            if (userAnswer.equals(currentQuestion.answer)) {
                knowledgeLevel += 0.1;
                performanceTracker.put(currentQuestion, true);
                System.out.println("Correct!");
            } else {
                knowledgeLevel -= 0.05;
                performanceTracker.put(currentQuestion, false);
                System.out.println("Incorrect. The answer is: " + currentQuestion.answer);
            }
        }
        summarizeWeakPoints();
    }

    private Question selectQuestion() {
        for (Question question : questionBank) {
            if (question.difficulty >= knowledgeLevel && !askedQuestions.contains(question)) {
                return question;
            }
        }
        return null; // Return null if no new question matches the criteria
    }

    private void summarizeWeakPoints() {
        System.out.println("\nSummary of Weak Points:");
        for (Map.Entry<Question, Boolean> entry : performanceTracker.entrySet()) {
            if (!entry.getValue()) {
                System.out.println("- " + entry.getKey().question + " (Difficulty: " + entry.getKey().difficulty + ")");
            }
        }
    }
}

public class adaptiveStudentLearning {
    public static void main(String[] args) {
        AdaptiveLearner learner = new AdaptiveLearner();
        learner.simulateLearning(5);
    }
}
