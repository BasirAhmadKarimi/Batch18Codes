package LogicalOprators;

public class E5LogicalOp {
    public static void main(String[] args) {
        boolean isGAvbl=true;
        boolean isWifiAvbl=false;

        if(isWifiAvbl||isGAvbl){
            System.out.println("you can browse the internet");
        }else{
            System.out.println("can't use internet");
        }
    }
}
