package E3Scanner3;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Do you have Credit card please say yes or no");
        Scanner sc=new Scanner(System.in);
       String hasCredit=sc.nextLine();
        if(hasCredit.equals("yes")){
            System.out.println("What is the balance");
           double balance=sc.nextDouble();
           if(balance>1000){
               System.out.println("Immediately pay off");
           }else{
               System.out.println("you can use more");
           }


            }else{
            System.out.println("I will give you a Credit card");

        }


        }


    }

