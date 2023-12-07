package E3Scanner3;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {
        ;
        System.out.println("please enter the amount");
        Scanner sc = new Scanner(System.in);
        double loan = sc.nextDouble();
        if (loan <= 200000) {
            System.out.println("you will get this loan");
        } else {
            System.out.println("this amount can not be provided");
        }
    }
}