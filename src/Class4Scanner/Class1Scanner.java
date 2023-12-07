package Class4Scanner;

public class Class1Scanner {
    public static void main(String[] args) {
        boolean isMainDoorOpend=true;
        boolean isRoom1Opened=false;
        boolean isRoom2Opened=true;

        if(isMainDoorOpend) {

            if (isRoom1Opened) {
                System.out.println("we are in Room1");

            } else {
                System.out.println("Room 1 is closed");
            }
            if (isRoom2Opened) {
                System.out.println("we are in the room 2");
            } else {
                System.out.println("room2 is close");
            }
        }else{
                System.out.println("can not enter the house main door is cloesd");
            }
        }

    }

