package ChapterFour;//write a java program to enter the numbers till the user wants
//and at the end, the progam should display the largest and smallest numbers entered.
import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args){
        Scanner harobed = new Scanner(System.in);

        int largestNumber = Integer.MIN_VALUE ;
        int smallestNumber = Integer.MAX_VALUE;

        System.out.println("HEllo world, enter a number");
        int number = harobed.nextInt();
        while (number !=0) {
            if (number > largestNumber){
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;
            }
            System.out.println("Dear user, if you wish to continue enter another number or, enter 0 to stop");
            number = harobed.nextInt();

        }
        System.out.println("The largest number: " + largestNumber);
        System.out.println(" The smallest number: " + smallestNumber);

    }
}