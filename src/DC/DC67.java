package DC;

import java.util.Scanner;

public class DC67 {

    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }

    ;

    public static void main(String[] args) throws MyException, ArithmeticException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        if (a + b > a * b)
            throw new MyException("Sum is greater than product!");
        else
            System.out.println("Test passed!");

        /*StringBuilder myInput2 = new StringBuilder(myInput1);
        myInput2 = myInput2.reverse();
        System.out.println(myInput2);*/
    }
}
