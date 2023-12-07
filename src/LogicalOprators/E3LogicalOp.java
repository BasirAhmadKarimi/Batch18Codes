package LogicalOprators;

public class E3LogicalOp {
    public static void main(String[] args) {
        boolean cond=true;
        boolean cond2=false;
        if(!(cond||cond2)){
            System.out.println("If");
        }else{
            System.out.println("else");
        }
    }
}
