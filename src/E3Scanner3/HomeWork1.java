package E3Scanner3;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter your height in inches");
        double height = sc.nextDouble();
        if(height<60){
            System.out.println("you are short");

        }else if(height>=60 && height<=72){
            System.out.println("you are medium");
        }else if(height>72){
            System.out.println("You are tall");
        }
    }
}
