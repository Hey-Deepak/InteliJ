package DC;

import java.util.*;
import java.lang.*;
import java.io.*;

public class DC66 {

    static class A {
        int a;

        A() {
            this(5);
        }

        A(int a) {
            System.out.println("Constructor of A class is called!.");
            this.a = a;
        }

        void fun() {
            System.out.println("I'm in A class.");
        }
    }

    static class B extends A {
        B() {
            super(5);
        }

        void fun() {
            super.fun();
            System.out.println("I'm in B class.");
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.fun();

        /*StringBuilder myInput2 = new StringBuilder(myInput1);
        myInput2 = myInput2.reverse();
        System.out.println(myInput2);*/
    }
}
