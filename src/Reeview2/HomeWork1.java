package Reeview2;

public class HomeWork1 {
    public static void main(String[] args) {
        boolean hasDegree = true;
        double gpa= 3.5;

        if (hasDegree) {
            System.out.println("Congratulations");

            if (gpa >= 3.5) {
                System.out.println("you are eligible for scholarship");
            } else {
                System.out.println("you should studied harder");
            }
        }else{
            System.out.println("you should get a degree");
        }
    }
}


