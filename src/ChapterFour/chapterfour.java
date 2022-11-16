package ChapterFour;

import java.util.Scanner;

import java.util.Scanner;


    public class chapterfour{
        public static void main(String[] args) {
            Scanner inputCollector = new Scanner(System.in);
            System.out.println("Enter a number");
            int userInput = inputCollector.nextInt();
            if (userInput >10){
            System.out.println("out of range");
            }
            else {
                if (userInput % 2 == 0) {

                System.out.println("It is even");}

                else
                    System.out.println("This is an odd number");
            }

    }
        }


