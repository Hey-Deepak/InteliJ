package DC;

import java.util.Scanner;

public class DC52 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = myObj.nextLine();
        System.out.println("Enter Age");
        int age = myObj.nextInt();
        System.out.println("Username :- " + username + "\nAge :- " + age);
    }
}
