/*
Part 1:
Add a new class to the project called PaymentCard.
Here's how to add a new class: On the left side of the screen is the list of projects. Right-click on the project name.
Select New and Java Class from the drop-down menu. Name the class as "PaymentCard".

First, create the PaymentCard object's constructor, which is passed the opening balance of the card,
and which then stores that balance in the object's internal variable.
Then, write the toString method, which will return the card's balance in the form "The card has a balance of X euros".


Part 2:
Complement the PaymentCard class with the following methods:

public void eatAffordably() {
    // write code here
}

public void eatHeartily() {
    // write code here
}
The method eatAffordably should reduce the card's balance by € 2.60, and the method eatHeartily should reduce the card's balance by € 4.60.

Part 3:
What happens if the card runs out of money? It doesn't make sense in this case for the balance to turn negative.
Change the methods eatAffordably and eatHeartily so that they don't reduce the balance should it turn negative.

Part 4:
Add the following method to the PaymentCard class:

public void addMoney(double amount) {
    // write code here
}
The purpose of the method is to increase the card's balance by the amount of money given as a parameter.
However, the card's balance may not exceed 150 euros.
As such, if the amount to be topped up exceeds this limit, the balance should, in any case, become exactly 150 euros.


Part 5:
Change the addMoney method further, so that if there is an attempt to top it up with a negative amount,
the value on the card will not change.

Part 6:
Write code in the main method of the MainProgram class that contains the following sequence of events:

Create Paul's card. The opening balance of the card is 20 euros
Create Matt's card. The opening balance of the card is 30 euros
Paul eats heartily
Matt eats affordably
The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
Paul tops up 20 euros
Matt eats heartily
The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
Paul eats affordably
Paul eats affordably
Matt tops up 50 euros
The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
*/
public class PaymentCard {
    private double accountBalance;

    public PaymentCard(double balance) {
        this.accountBalance = balance;
    }

    public String toString() {
        return "The card has a balance of " + this.accountBalance + " euros";
    }

    public void eatAffordably() {
        double affordableMeal = 2.60;
        if(checkForNegativeBalance(accountBalance - affordableMeal)) {
            accountBalance -= affordableMeal;
        }
    }

    public void eatHeartily() {
        double heartyMeal = 4.60;

        if(checkForNegativeBalance(accountBalance - heartyMeal)) {
            accountBalance -= heartyMeal;
        }
    }

    public void addMoney(double amount) {
        if(amount < 0) {
            return;
        }
        if ((accountBalance + amount) < 150) {
            accountBalance += amount;
        } else if ((accountBalance + amount) > 150){
            accountBalance = 150;
        }
    }
    private boolean checkForNegativeBalance(double value) {
        return value >= 0;
    }
}
