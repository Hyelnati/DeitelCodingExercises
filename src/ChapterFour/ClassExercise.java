package ChapterFour;
import java.util.Scanner;
public class ClassExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a number: ");
        int number = input.nextInt();

        int LargestNumber = number;
        int SmallestNumber = number;

        do {
            if (number > LargestNumber) {
                LargestNumber = number;
            }
            if (number < SmallestNumber) {
                SmallestNumber = number;
            }
            System.out.println(" Enter another number or 0 to quit: ");
            number = input.nextInt();




            System.out.printf("Largest number is %d%n ", LargestNumber);
            System.out.printf("Smallest number is %d%n", SmallestNumber);

        }
        while (number != 0); {
        }


    }
}
