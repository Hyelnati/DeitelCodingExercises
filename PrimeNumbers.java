import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int prime = 0;

        for (int value = 1; value <= number ; value++) {
            if (number % value == 0) {
                prime++;
            }
        }
        if (prime == 2) {
                    System.out.println(number + " is a prime number");
                } else System.out.println(number + " is not a prime number");





    }
}

