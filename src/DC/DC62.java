package DC;

public class DC62 {
    public void myAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Are Beta Tum Abhi Age se Chote Ho...");
        } else {
            System.out.println("Are Bhai Sahab Aao, Aap to pure Adult ho.");
        }
    }

    public static void main(String[] args) {
        DC62 myObj = new DC62();
        myObj.myAge(10);
    }
}
