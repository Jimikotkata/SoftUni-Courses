package FirstStepsInCoding.Lab.exercise5;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // четем размерите на тортата
        // пресмятаме броя парчета -> ширината * дължината
        // правим цикъл докато имаме парчета торта или докато получим команда стоп

        int with = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int contPieces = with * length;

        while (!command.equals("STOP")){
            int currentPieces = Integer.parseInt(command);
            contPieces -= currentPieces;

            if(contPieces <= 0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(contPieces));
                break;
            }


            command = scanner.nextLine();
        }

        if (contPieces >= 0){
            System.out.printf("%d pieces are left.", contPieces);
        }



    }
}
