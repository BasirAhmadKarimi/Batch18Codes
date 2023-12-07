package Class4Scanner;

public class Class2IfNested {
    public static void main(String[] args) {

        double budget=25000;
        String engineType="Patrol";

        if(budget>=50000){
            if(engineType.equals("Electric")){
                System.out.println("i want to buy a tesla");
            }else if(engineType.equals("Hybrid")){
                System.out.println(" i want to buy a toyota");
            }else{
                System.out.println("i want buy a poche");
            }
        }else if(budget>=30000){
            if(engineType.equals("Eelctric")){
                System.out.println("I want to buy HYD");
            }else if (engineType.equals("Hybrid")){
                System.out.println("i want buy camery");
            }else{
                System.out.println("hyudai sonata");
            }
        }else if(budget>=20000){

            if(engineType.equals("Electric")){

                System.out.println("nissan leaf");

            }else if(engineType.equals("Hybrid")){

                System.out.println("Kia");
            }else{
                System.out.println("Honda Civi");
            }
        }else{
            System.out.println("lets save more");

        }
    }
}
