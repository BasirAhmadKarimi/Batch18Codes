package E3Scanner3;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if(number>=1 && number < 10){
            System.out.println("The number is small");
        }else if(number>=11 && number<=100){
            System.out.println("The number is medium");
        }else if (number>=101 & number<=1000){
            System.out.println("The number large");
        }
    }
}
