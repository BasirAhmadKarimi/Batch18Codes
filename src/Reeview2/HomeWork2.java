package Reeview2;

public class HomeWork2 {
    public static void main(String[] args) {

       double mortgageRate=3.3;
       int mortgagePrice=110000;
       if(mortgageRate<4.5) {
           System.out.println("User will  buy a house");

           if (mortgagePrice > 100000) {
               System.out.println("User will consider taking a loan");
           } else {
               System.out.println("User will pay cash");
           }
       }else{
               System.out.println("User will not buy the house");
           }
       }

    }
