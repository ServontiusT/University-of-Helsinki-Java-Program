/*
Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance.
NB! Perform all the operations in this exact order.
*/

public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        Account checkingAccount = new Account("Servontius Checking", 100);

        checkingAccount.deposit(20);

        System.out.println(checkingAccount);
    }
}
