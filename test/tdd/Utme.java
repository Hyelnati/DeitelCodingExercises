package tdd;

public class Utme {
    public int costofCopies(int numberofCopies) {
        int copies = 0;
        if (numberofCopies >=1 && numberofCopies <= 4) {
            copies = numberofCopies * 2000;
        }
        if (numberofCopies >= 5 && numberofCopies <= 9){
        copies = numberofCopies * 1800;
        }
        if (numberofCopies >= 10 && numberofCopies <=29) {
            copies = numberofCopies * 1600;
        }
        if (numberofCopies >= 30 && numberofCopies <=49) {
            copies = numberofCopies * 1500;
        }
        if (numberofCopies >= 50 && numberofCopies <=99) {
            copies = numberofCopies * 1300;
        }
        if (numberofCopies >= 100 && numberofCopies <=199) {
            copies = numberofCopies * 1200;
        }
        if (numberofCopies >= 200 && numberofCopies <=499) {
            copies = numberofCopies * 1100;
        }if (numberofCopies >= 500) {
            copies = numberofCopies * 1000;
        }

        return copies;
        }


        }






