package ChapterFour;

import java.util.Scanner;
public class Assignment2{
    public static void main(String[] args) {
        Scanner harobed = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = harobed.nextInt();

        for(int i = 1; i <= 12; ++i) {
            System.out.printf(" %d Times %d is %d \n ", number, i, number * i);
        }
    }
}
