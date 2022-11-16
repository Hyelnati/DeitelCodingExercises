package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class  AccountTest {


    @Test
    public void depositTest() {
        //given
        Account deborahAccount = new Account();

        //when i deposit 5000
        deborahAccount.deposit(5000);

        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();

        assertEquals(5000, deborahAccountBalance);
    }


    @Test
    public void depositTwiceTest() {
        //given there is an account
        Account deborahAccount = new Account();
        //given that initial balance is 4000
        deborahAccount.deposit(4000);
        //when i deposit 2000
        deborahAccount.deposit(2000);

        //check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(6000, deborahAccountBalance);


    }

    @Test
    public void depositNegativeAmountTest() {
        //given there is an account
        Account deborahAccount = new Account();
        //given that initial balance is 4000
        deborahAccount.deposit(4000);
        //when i deposit -2000
        deborahAccount.deposit(-2000);

        //check that balance is 4000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(4000, deborahAccountBalance);


    }


    @Test
    public void withdrawTest() {
        // given account
        Account deborahAccount1= new Account();

        // deposit 20000
        deborahAccount1.deposit(20000);

        assertEquals(20000, deborahAccount1.getBalance());

        //withdraw 10000
        deborahAccount1.withdraw(10000);

        //check balance
        int deborahAccountBalance1 = deborahAccount1.getBalance();
        assertEquals(10000, deborahAccountBalance1);


    }

    @Test
    public void withdraw2() {
        // given an account
        Account deborahAccount = new Account();

        // deposit 20000
        deborahAccount.deposit(20000);
        assertEquals(20000, deborahAccount.getBalance());

        //withdraw 10000
        deborahAccount.withdraw(10000);

        //check balance
        //int deborahAccountBalance = deborahAccount.getBalance();
        //assertEquals (10000, deborahAccount.getBalance());
    }

    @Test
    public void withdrawMore() {
        // given an account
        Account deborahAccount = new Account();

        // deposit 20000
        deborahAccount.deposit(20000);

        //withdraw 30000
        deborahAccount.withdraw(30000);

        //check balance
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(20000, deborahAccountBalance);
    }


    @Test
    public void withdrawAll() {
        // given an account
        //Account deborahAccount = new Account();

        // deposit 20000
        //deborahAccount.deposit(20000);

        //withdraw 20000
        //deborahAccount.withdraw(20000);

        //check balance
       // int deborahAccountBalance = deborahAccount.getBalance();
       // assertEquals(0, deborahAccountBalance);
    }

    //@Test
    //public void withdrawMinimumBalance (){
        //Account deborahAccount = new Account ();

    }


    //@Test
   // public void withdrawWithWrongPinFailsTest() {


        // given that i have an account
        //given that pin is 1234
        //deborahAccount.setPin(1234);

        //given that initial balance is 50k

        // when i try to withdraw 20k with 0000 as pin
        //check that balance is



