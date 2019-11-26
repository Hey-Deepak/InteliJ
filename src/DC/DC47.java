package DC;

import java.util.List;

public class DC47 {

    public static void add(int a, int b) {
        System.out.println("called add(int a, int b) : " + a + b);
    }

    public static void add(int a) {
        System.out.println("called add(int a) : " + a + 5);
    }

    public static void add(float a) {
        System.out.println("called add(float a) : " + a + 5);
    }

    public static void add(float a, float b) {
        System.out.println("called add(float a, float b) : " + a + b);
    }

    public static class A {
        int a;

        public A(int a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return "myint:" + a;
        }
    }

    public static void main(String args[]) {
        A a = new A(5), b = new A(6);
        System.out.println(a + " " + b);

        add(5);
        add(4,6);
        add(4.5f,6.6f);
        add(4.5f);
    }

}
