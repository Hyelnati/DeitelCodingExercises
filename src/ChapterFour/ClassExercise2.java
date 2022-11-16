package ChapterFour;

//receiving input without Scanner

import java.util.Scanner;

public class ClassExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number, enter any negative number to exit");
        int number = scanner.nextInt();
        int oddNumber = 0;
        int evenNumber = 0;
        int sumevenNumber = 0;
        int sumoddNumber = 0;

        while (number > 0) {

            if (number % 2 == 0) {

                evenNumber += number;
                sumevenNumber += number;
            }
            else {
                oddNumber += number;
                sumoddNumber += number;

            }
        }
        System.out.println("Enter a negative number to exit: ");
        System.out.printf("%d the even number is: ", evenNumber);

        }

    }

