package DC;

class Outer1 {
    int x = 10;

    class Inner1 {
        public int fun1() {
            return x;
        }
    }
}

public class DC49 {
    public static void main(String[] args) {
        Outer1 myOuter = new Outer1();
        Outer1.Inner1 myInner = myOuter.new Inner1();
        System.out.println(myInner.fun1());
    }
}
