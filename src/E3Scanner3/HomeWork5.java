package E3Scanner3;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("please enter first number ");
            double num1 = sc.nextDouble();
            System.out.println("Please enter the second number ");
            double num2 = sc.nextDouble();
            System.out.println("Please enter the operator (+, -, *, /");
            char operator = sc.next().charAt(0);

            if(operator==('+')){
                System.out.println("Tthe result is"+" "+(num1+num2));
            }else if(operator==('*')){
                System.out.println("the result is"+" "+(num1*num2));
            }else if(operator==('/')){
                System.out.println("The result is"+" "+(num1/num2));
            }else if(operator==('-')){
                System.out.println("The result is"+" "+(num1-num2));
            }else{
                System.out.println("Invalid result");
            }
        }
    }


