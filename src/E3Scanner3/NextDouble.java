package E3Scanner3;

import java.util.Scanner;

public class NextDouble {
    public static void main(String[] args) {
        Scanner menWeight=new Scanner(System.in);
        System.out.println("please enter your weight in lbs");
        double weight= menWeight.nextDouble();
        System.out.println("you have "+weight+ "weight");
    }
}
