package ch_5_patterns;
import java.util.*;
public class HalfPyramidInverted {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a value:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }System.out.println("");
    }
    }
}
