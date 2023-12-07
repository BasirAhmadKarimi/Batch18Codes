package Objects;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Adam";
        p1.haircolor="black";
        p1.age=20;
        p1.height=5;
        p1.weight=169;

        System.out.println(p1.name);
        System.out.println(p1.haircolor);
        System.out.println(p1.age);
        System.out.println(p1.height);
        System.out.println(p1.haircolor);

        p1.eat();
        p1.run();
        p1.sleep();


    }
}
