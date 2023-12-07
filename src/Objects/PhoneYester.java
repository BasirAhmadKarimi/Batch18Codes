package Objects;

public class PhoneYester {
    public static void main(String[] args) {

        Phone iphone=new Phone();
        iphone.make="Apple";
        iphone.model="Iphone 15 ";
        iphone.color="Blue";
        iphone.price=1400;
        System.out.println(iphone.make);
        System.out.println(iphone.model);
        System.out.println(iphone.color);
        System.out.println(iphone.price);
        iphone.takepics();
        iphone.calls();
        iphone.playVideos();

        System.out.println("........");

        Phone samsung=new Phone();
        samsung.make="Sumsung";
        samsung.model="S23 ult";
        samsung.color="Black";
        samsung.price=1200;

        samsung.calls();
        samsung.playVideos();
    }
}
