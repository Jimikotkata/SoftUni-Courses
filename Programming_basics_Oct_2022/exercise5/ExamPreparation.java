package FirstStepsInCoding.Lab.exercise5;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialFails = Integer.parseInt(scanner.nextLine());

        int countFailedProblems = 0;
        double sumScore = 0;
        int countProblems = 0;
        String lastProblem = "";


        while (countFailedProblems < initialFails){
            String currentProblem = scanner.nextLine();
            if (currentProblem.equals("Enough")){
                break;
            }

            int currentGrade = Integer.parseInt(scanner.nextLine());

            if (currentGrade <= 4){
                countFailedProblems++;

            }
            sumScore += currentGrade;
            countProblems++;
            lastProblem = currentProblem;


        }


        if (countFailedProblems >= initialFails){
            System.out.printf("You need a break, %d poor grades.", countFailedProblems);
        }else {
            System.out.printf("Average score: %.2f%n", sumScore/countProblems);
            System.out.printf("Number of problems: %d%n", countProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
