package DC;

abstract class Abs {
    public abstract void myAbsName();

    public void name() {
        System.out.println("Hello");
    }
}

class Pig extends Abs {
    public void myAbsName() {
        System.out.println("PIG");
        name();
    }
}

public class DC42 {
    public static void main(String[] args) {
        Pig myObj = new Pig();
        myObj.myAbsName();
        myObj.name();
    }
}

