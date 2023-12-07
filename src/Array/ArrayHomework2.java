package Array;

public class ArrayHomework2 {
    public static void main(String[] args) {
        String [] cars={"Toyota", "Honda", "BMW", "Tasla", "Lexus", "Benz"};
        cars[0]="Toyota";
        cars[1]="Honda";
        cars[2]="BMW";
        cars[3]="Tasla";
        cars[4]="Lexus";
        cars[5]="Benz";
        for(int i=0; i<6; i++){
            System.out.print(cars[i]+" ");
        }
        System.out.println();
        int i=0;
        do{
            System.out.print(cars[i]+" ");
            i++;
        }while(i<cars.length);
    }
}
