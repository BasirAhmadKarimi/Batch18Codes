package StringXxpanation;

public class Task6 {
    public static void main(String[] args) {
        String momName="Taylor Swift";
        String dadName="Carlos";
        boolean isBoy=false;

        if (isBoy){
         String fatherFirstPart=dadName.substring(0,dadName.length()/2);
         String mothrlastPart=momName.substring(momName.length()/2,momName.length());
            System.out.println(fatherFirstPart.trim()+mothrlastPart.trim());
        }else{
            String motherFirstPart=momName.substring(0,momName.length()/2);
            String fatherLastPart=dadName.substring(dadName.length()/2,dadName.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());
        }
    }
}
