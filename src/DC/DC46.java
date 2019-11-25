package DC;

class Class1 {
    public void myFun1() {
        System.out.println("I am myFun1");
    }
}

class Class2 extends Class1 {
    public void myFun2() {
        System.out.println("I am myFun2");
    }
}

public class DC46 extends Class2 {
    public static void main(String[] args) {
        DC46 myObj = new DC46();
        myObj.myFun1();
        myObj.myFun2();
    }
}
