/*
Create a class named Whistle.
Add the variable private String sound to the class.
After that, create the constructor public Whistle(String whistleSound), which is used to create a new whistle that's given a sound.

Then create the method public void sound() that prints the whistle's sound.
 */

public class Whistle {
    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(sound);
    }


}
