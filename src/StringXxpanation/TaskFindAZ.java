package StringXxpanation;

public class TaskFindAZ {
    public static void main(String[] args) {
        String str="bkfdsSAHBDSH2232398487#Y*&#$%";

        System.out.println(str.replaceAll("[^A-Za-y]","").length());


    }
}
