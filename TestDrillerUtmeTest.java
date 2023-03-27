package testDrillerUtme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class TestDrillerUtmeTest {
    @Test
    public void classObjectExistTest(){
        TestDrillerUtme testDriller = new TestDrillerUtme();
        Assertions.assertNotNull(testDriller);
        System.out.println(testDriller);
    }
    @Test
    public void get1_4copiesTest(){
        TestDrillerUtme testDriller = new TestDrillerUtme();
        testDriller.getNumberOfCopies(0);
        Assertions.assertEquals(0,testDriller.price);
        System.out.println("Price of copies is " + testDriller.price);
    }
    @Test
    public void get5_9CopiesTest(){
        TestDrillerUtme testDriller = new TestDrillerUtme();
        testDriller.getNumberOfCopies(7);
        assertEquals(12_600,testDriller.price);
        System.out.println("price of copies is " + testDriller.price);
    }
    @Test
    public void get10_29CopiesTest(){
        TestDrillerUtme testDriller = new TestDrillerUtme();
        testDriller.getNumberOfCopies(28);
        assertEquals(44_800, testDriller.price);
        System.out.println("price of copies is " + testDriller.price);
    }
    @Test
    public void get30_49CopiesTest() {
        TestDrillerUtme testDriller = new TestDrillerUtme();
        testDriller.getNumberOfCopies(38);
        assertEquals(57_000, testDriller.price);
        System.out.println("Price of copies is " + testDriller.price);
    }
    @Test
    public void get50_99CopiesTest(){
        TestDrillerUtme testDriller = new TestDrillerUtme();
        testDriller.getNumberOfCopies(52);
        assertEquals(67_600, testDriller.price);
        System.out.println("Price of copies is " + testDriller.price);
    }
    @Test
    public void get100_199CopiesTest(){
        TestDrillerUtme testDriller = new TestDrillerUtme();
        testDriller.getNumberOfCopies(105);
        assertEquals(126_000, testDriller.price);
        System.out.println("Price of copies is " + testDriller.price);
    }
    @Test
    public void get200_499CopiesTest(){
        TestDrillerUtme testDriller = new TestDrillerUtme();
        testDriller.getNumberOfCopies(209);
        assertEquals(229_900, testDriller.price);
        System.out.println("Price of copies is " + testDriller.price);
    }
    @Test
    public  void get500AndAboveCopies(){
        TestDrillerUtme testDriller = new TestDrillerUtme();
        testDriller.getNumberOfCopies(600);
        assertEquals(600_000,testDriller.price);
        System.out.println("Price of copies is " + testDriller.price);
    }
}
