import org.junit.jupiter.api.Test;
import tdd.Utme;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestdrillerTest {
    @Test
    public void Driller() {
        Utme utme = new Utme();

        int number = utme.costofCopies(2);

        assertEquals(4000, number);

    }
    @Test
    public void Driller2() {
        Utme utme = new Utme();
        int number = utme.costofCopies(5);
        assertEquals(9000, number);
    }

    @Test
    public void Driller3() {
        Utme utme = new Utme();
        int number = utme.costofCopies(10);
        assertEquals(16000, number);

    }
    @Test
    public void Driller4(){
        Utme utme = new Utme();
        int number = utme.costofCopies(30);
        assertEquals(45000, number);
    }

    @Test
    public void Driller5(){
        Utme utme = new Utme();
        int number = utme.costofCopies(50);
        assertEquals(65000, number);
    }
    @Test
    public void Driller6(){
        Utme utme = new Utme();
        int number = utme.costofCopies(100);
        assertEquals(120000, number);
    }

    @Test
    public void Driller7(){
        Utme utme = new Utme();
        int number = utme.costofCopies(220);
        assertEquals(242000, number);
    }

    @Test
    public void Driller8(){
        Utme utme = new Utme();
        int number = utme.costofCopies(500);
        assertEquals(500000, number);
    }
}
