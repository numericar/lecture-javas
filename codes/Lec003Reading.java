package codes;

import java.util.Scanner;

public class Lec003Reading {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = sc.next();
        System.out.println("Your username is " + username);
        sc.close();
    }
}
