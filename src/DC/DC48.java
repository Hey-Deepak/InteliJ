package DC;

class Outer {
    public void fun1() {
        System.out.println("It is Fun1");
    }

    class Inner {
        public void fun2() {
            System.out.println("It is Fun2");
        }
    }
}

public class DC48 extends Outer {
    public static void main(String[] args) {
        Outer myOuter = new Outer();
        Outer.Inner myInner = myOuter.new Inner();
        myInner.fun2();
        myOuter.fun1();
    }
}
