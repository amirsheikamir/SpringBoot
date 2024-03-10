package OOPS_1.bank;

import java.util.*;
// this is a bank class 

public class Bank {
    String bankName;
    List<String> accHolderes;
    int totalBalance;


    {
        // called instance block 
        // this block uses in db connection because it runs firstly or many other things 
        int a = 10;
        int b = 20;
        int c = a +b ;
        System.out.println(c+" i am also unbeatbale because i'm in instance block, I only run when Objet will created");
        
    }

    static {
       System.out.println("No one cane Beat Me, Because I'm Static block  because i run by JVM  ");
    }
    public Bank() {
        // this contructor is called unparameterized constructor also called default constructor
            this("SBI", new ArrayList<>(), 40);
        System.out.println("Inside Unparameterized Constructor");
    }
    public Bank(int a , int b ) {
        this(5, 6, 7);
        System.out.println("Trying to do things");
    }
    public Bank(int a , int b, int c ){

    }

    public Bank(String bankName, List<String> accHolderes, int totalBalance) {
            // this constructor called parameterized constructor
            System.out.println("Parameterized Constructor");
    }

    public void takeDeposit(int amount) {
        // add amount in db
    }

    public void giveLoan(int amount) {
            // check db are we having money
    }

    public void createAccount(String accountName) {
            // Openeing new user or checking if he was not existing user
    }

}