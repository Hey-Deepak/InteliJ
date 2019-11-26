package DC;

interface Animal3 {
    public void sound();

    public void sleep();
}

class Pig3 implements Animal3 {

    public void sound() {
        System.out.println("Pig Sound :- wee wee");
    }

    public void sleep() {
        System.out.println("Ham Sooo Rahe Hai... ");
    }

}

public class DC51 {
    public static void main(String[] args) {
        Pig3 myObj = new Pig3();
        myObj.sleep();
        myObj.sound();
    }
}
