package apna_college.ch_6_advance_patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
