package chapterThree.selfAssessment;

public class Account {
    private String name;
    private double balance;

    public void deposit (double amount){
        balance = balance + amount;
    }
    public double getBalance (){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void withdraw (int amount){
        balance = balance - amount;


    }







}
