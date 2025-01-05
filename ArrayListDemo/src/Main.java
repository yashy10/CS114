import java.util.*;

// Task management system
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your task managing system.");

        // Input the number of tasks
        System.out.println("How many tasks will you have: ");
        int taskNum = input.nextInt();
        input.nextLine(); // Consume newline

        // Store tasks as strings with priority and status
        ArrayList<String> fullTask = new ArrayList<>();

        for (int i = 0; i < taskNum; i++) {
            try {
                // Input priority number
                System.out.println("Please enter the priority number of this task (1 to " + taskNum + "): ");
                int priority = input.nextInt();
                input.nextLine(); // Consume newline

                if (priority < 1 || priority > taskNum) {
                    System.out.println("Invalid priority number. Please try again.");
                    i--; // Decrement counter to retry input
                    continue;
                }

                // Input task description
                System.out.println("Please enter the task description: ");
                String task = input.nextLine();

                // Input task status
                System.out.println("Please input the task status (pending or completed): ");
                String status = input.nextLine().toLowerCase();
                if (!status.equals("pending") && !status.equals("completed")) {
                    System.out.println("Invalid status. Please use 'pending' or 'completed'.");
                    i--; // Decrement counter to retry input
                    continue;
                }

                // Add task to list
                fullTask.add(priority + ": " + task + " (" + status + ")");

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
                input.next(); // Clear invalid input
                i--; // Decrement counter to retry input
            }
        }

        // Sort tasks based on priority
        Collections.sort(fullTask);

        // Display tasks
        System.out.println("\nYour tasks in priority order:");
        for (String task : fullTask) {
            System.out.println(task);
        }
    }
}
