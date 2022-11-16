package chapterThree.selfAssessment;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account harobed = new Account();
        Scanner input = new Scanner(System.in);


        System.out.println("Dear customer, please enter your name");
        String customerName = input.nextLine();
        harobed.setName(customerName);

        String name = harobed.getName();


        System.out.printf("Welcome, %s%n", name);
        System.out.println("Enter amount to deposit");
        double deposit = input.nextDouble();
        harobed.deposit(deposit);

        double balance = harobed.getBalance();
        System.out.printf("Your balance is, %.3f%n ",balance );

        System.out.println("would you like to withdraw?");


        System.out.println("Enter amount to withdraw");
        int withdraw = input.nextInt();
        harobed.withdraw(withdraw);
        balance = harobed.getBalance();

        System.out.printf("Your balance is, %.3f%n ", balance);



    }


}