package DC;

abstract class Animal {
    abstract public void sound();

    public void sleep() {
        System.out.println("Ham Sooo Rahe Hai... ");
    }
}

class Pig1 extends Animal {
    public void sound() {
        System.out.println("Pig Sound :- wee wee");
    }
}

public class DC50 {
    public static void main(String[] args) {
        Pig1 myObj = new Pig1();
        myObj.sound();
        myObj.sleep();
    }
}
