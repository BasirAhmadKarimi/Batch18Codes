package E3Scanner3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        double quiz = sc.nextDouble();
        System.out.println("Please enter your mid term score");
        double midTerm =sc.nextDouble();
        System.out.println("Please enter your final score");
        double finalScore = sc.nextDouble();
                double averageScore = (quiz+midTerm+finalScore)/3;
        if(averageScore>=90){
            System.out.println("your grade is A");
        }else if(averageScore>=70 && averageScore<=90){
            System.out.println("Your grade is B");
        }else if(averageScore>=50 && averageScore<=70){
            System.out.println("your grade is C");
        }else if(averageScore<=50){
            System.out.println("Your grade is F");
        }else{
            System.out.println("please enter a valid score");
        }


    }


}
