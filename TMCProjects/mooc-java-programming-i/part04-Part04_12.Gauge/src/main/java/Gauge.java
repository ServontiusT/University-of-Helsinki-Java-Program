/*
Create the class Gauge. The gauge has the instance variable private int value,
a constructor without parameters (sets the initial value of the meter variable to 0), and also the following four methods:

        Method public void increase() grows the value instance variable's value by one. It does not grow the value beyond five.
        Method public void decrease() decreases the value instance variable's value by one. It does not decrease the value to negative numbers.
        Method public int value() returns the value variable's value.
        Method public boolean full() returns true if the instance variable value has the value five. Otherwise, it returns false.
*/
public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        if (value <= 4) {
            value++;
        }
    }

    public void decrease() {
        if (value >= 1) {
            value--;
        }
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return value == 5;
    }
}
