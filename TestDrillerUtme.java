package testDrillerUtme;

public class TestDrillerUtme {

    public int price;


    public void getNumberOfCopies(int Copies) {

        int amount;
        if (Copies > 0 && Copies <=4) {
            amount = 2000;
            price = amount * Copies;

        } else if (Copies > 4 && Copies <= 9) {
            amount = 1800;
            price = amount * Copies;

        } else if (Copies >9 && Copies <= 29) {
            amount = 1600;
            price = amount * Copies;
        } else if (Copies > 29 && Copies <= 49) {
            amount = 1500;
            price = amount * Copies;
        } else if (Copies > 49 && Copies <= 99) {
            amount =1300;
            price = amount * Copies;
        } else if (Copies > 99 && Copies <= 199) {
            amount = 1200;
            price = amount * Copies;
        } else if (Copies > 199 && Copies <=499) {
            amount = 1100;
            price = amount * Copies;
        } else if (Copies >= 500) {
            amount = 1000;
            price = amount * Copies;
        }else System.out.println("Please enter the appropriate number of copies ");
        }





    }

