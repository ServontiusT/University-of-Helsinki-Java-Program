public class Timer {

    private int hundredthsOfSecondHand;
    private int secondsHand;

    public Timer() {
        this.hundredthsOfSecondHand = 0;
        this.secondsHand = 0;
    }

    public void advance() {
        int hundredthsLimit = 100;
        int secondsLimit = 60;

        if (this.hundredthsOfSecondHand <= hundredthsLimit) {
            this.hundredthsOfSecondHand++;
        }
        if (this.hundredthsOfSecondHand > 100){
            this.secondsHand++;
            this.hundredthsOfSecondHand = 0;
        }
        if (this.secondsHand > secondsLimit) {
            this.secondsHand = 0;
        }
    }

    public String toString () {
        String secondsToString = "";
        String hundredthsToString = "";
        int timeLimit = 10;

        if (this.hundredthsOfSecondHand < timeLimit) {
            hundredthsToString = "0" + this.hundredthsOfSecondHand;
        }
        if (this.secondsHand < timeLimit) {
            secondsToString = "0" + this.secondsHand;
        }

        if (this.secondsHand > timeLimit && this.hundredthsOfSecondHand > timeLimit) {
            return this.secondsHand + ":" + this.hundredthsOfSecondHand;
        } else {
            return secondsToString + ":" + hundredthsToString;
        }
    }
}
