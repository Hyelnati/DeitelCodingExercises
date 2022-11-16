import org.junit.jupiter.api.Test;
import tdd.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuntionsTest {


@Test
public void SquareTest(){
    Kata kata = new Kata ();

    int result = kata.squareof( 5);
    assertEquals(25, result);

}

}
