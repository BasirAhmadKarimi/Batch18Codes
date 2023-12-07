package Reeview2;

public class NestedIf {
    public static void main(String[] args) {

        boolean isFriday=true;
        int day=13;
        if(isFriday){
            System.out.println("it is a movie night");
            if(day==13){
                System.out.println("let's watch a scary movie");
            }else{
                System.out.println("let's watch something funny");
            }
        }else{
            System.out.println("no movie, go back to study");
        }
    }
}
