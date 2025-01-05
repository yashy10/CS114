

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many applicants are here?");
        int num = input.nextInt();
        Job[] jobs = new Job[num];

        for(int i = 0; i < jobs.length; i++){
            System.out.println("Please enter your name, number and reply (true/false) if you are good at the skills(word processing, spreadsheets, databases, and graphic)");
            jobs[i] = new Job(input.next(),input.nextInt(),input.nextBoolean(),input.nextBoolean(),input.nextBoolean(),input.nextBoolean());
            System.out.println(jobs[i].getName());
        }



    }
}