package Methods;

public class Hello {
    void differentLanguage(String country){
        if(country.equalsIgnoreCase("Afghanistan")){
            System.out.println("Salam");
        }else if(country.equalsIgnoreCase("UAE")){
            System.out.println("Marhaba");
        }else if (country.equalsIgnoreCase("USA")){
            System.out.println("Hello");
        }else if (country.equalsIgnoreCase("Spai")){
            System.out.println("Ola");
        }else if (country.equalsIgnoreCase("Japa")){
            System.out.println("Konnichiva");
        }else {
            System.out.println("I have to learn");
        }
    }
}
