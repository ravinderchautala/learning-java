package apna_college.ch_2_second_code;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println( "The addition of two numbers is: " + sum );
    }
}
