package apna_college.ch06_advance_patterns;

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a value: ");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                // spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                // Stars
                for(int j=1; j<=n;j++){
                    System.out.print("*");
                }System.out.println(" ");
            }
        }
    }
}
