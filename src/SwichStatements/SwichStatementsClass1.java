package SwichStatements;

import java.util.Scanner;

public class SwichStatementsClass1 {
    public static void main(String[] args) {
        System.out.println("Please enter your country");
        Scanner sc=new Scanner(System.in);

     String country=sc.nextLine();
       switch (country.toUpperCase()){
           case("Afghanistan"):
               System.out.println("you speak Dari");
               break;
           case"Pakistan":
               System.out.println("you speak Urdu");
               break;
           case"USA":
               System.out.println("you speak Englis");
               break;
           case"Iraq":
               System.out.println("you speak Arabic");
               break;

           case"Spain":
               System.out.println("you speak Spanish");

           System.out.println();
        }



    }
}
