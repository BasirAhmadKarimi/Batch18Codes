package Reeview2;

public class Nested {
    public static void main(String[] args) {

        boolean allergy=true;
        String allergyType="dairy";
        if(allergy){
            System.out.println("let's check what kind of allergy you have ");
            if(allergyType.equals("Peanut")){
                System.out.println("Please avoid food that contain Peanuts");
            }else if(allergyType.equals("dairy")){
                System.out.println("please avoid food with dairy product");
            }else if(allergyType.equals("pollen")){
                System.out.println("please stay indoor when trees are blooming");
            }
        }
    }
}
