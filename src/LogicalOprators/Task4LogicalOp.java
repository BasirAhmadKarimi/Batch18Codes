package LogicalOprators;

import java.util.Scanner;

public class Task4LogicalOp {
    public static void main(String[] args) {
        System.out.println("Please enter you birth month");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        if (month.equals("March")|| month.equals("April") || month.equals("May")) {
            System.out.println("you born in Spring");
        } else if (month.equals("June") || month.equals("july")  ||month.equals("August")) {
            System.out.println("you born in summer");
        }else if(month.equals("September")|| month.equals("October")||month.equals("November")){
            System.out.println("you bor in Winter");
        }

    }}