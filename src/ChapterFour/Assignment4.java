package ChapterFour;
import java.util.Scanner;
public class Assignment4{
    public static void main(String[] args) {
        Scanner harobed = new Scanner(System.in);

        int oddNumber = 0;
        int evenNumber = 0;
        //int negativeNumber = Integer.
        System.out.println("enter a number, enter any negative number to exit");
        int number = harobed.nextInt();
        while (number > 0) {
            if (number % 2 == 0) {
                evenNumber = number;
            }
            if (number % 2 != 0) {
                oddNumber = number;
            if (number == -1) {
                break;
            }
            }
            System.out.println("The odd Nnumber: " + oddNumber);
            System.out.println(" The even number: " + evenNumber);
        }


    }
}
