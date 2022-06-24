package Day_10;

import java.util.Scanner;

public class SwitchStatement {
    static final int ZERO = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String decision = null;
        do {
            System.out.println("Enter Number : ");
            String str = sc.nextLine();
            byte b = Byte.valueOf(str);
            doDemo(b);

            System.out.println("Do you want to exit? (Y/Others) : ");
            decision = sc.nextLine();

        } while (!"Y".equalsIgnoreCase(decision));
    }

    static void doDemo(byte value) {

        String result = switch (value) {
            /*In Java 17, break is removable and switch expression can be written as below*/
            case ZERO -> { //if you want to write more than one code in a case, you can just write codes with "yield" keyword
                System.out.println("Value is " + value);
                yield "This is 0";
            }
            case 1 -> "This is 1";
            case 2 -> "This is 2";

            case 3 -> "This is 3";
            default -> throw new RuntimeException("Invalid Value : " + value); // you can throw exception in case
        };
        System.out.println(result);
    }
}
        /*switch (value){
            case ZERO:
                System.out.println("This is 0"); //since there's no break in case 0, the code runs up to case 2.
            case 1:
                System.out.println("This is 1"); //since there's no break in case 1, the code runs up to case 2.
            case 2:
                System.out.println("This is 2"); //there's break in case 2, so the code stop running here.
                break;
            case 3:
                System.out.println("This is 3"); //there's break in case 3, so the code stop running here.
                break;
            default:
                System.out.println("This is more than 3"); //there's break in default, so the code stop running here.
                break;
        }*/



