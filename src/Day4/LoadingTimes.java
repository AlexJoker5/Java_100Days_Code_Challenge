package Day4;

import java.util.Scanner;

public class LoadingTimes {
    public static void main(String[] args) {
        /*I use sc.nextLine method to wait before next code works*/
        System.out.println("Start Program!");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        LoadDemo demo;
        System.out.println("Declare Class");
        sc.nextLine();

        demo = new LoadDemo(); /*static block load only once when class's loading first*/
        System.out.println("Create Object From Class");
        sc.nextLine();

        demo = new LoadDemo(); /*static block doesn't work again.*/
        System.out.println("Create Object Again");
        sc.nextLine();


    }
}
class LoadDemo{
    static { //when object is initialized, static block is initialized first and only once.
        System.out.println("Static Block");
    }
    { //Second is instance block.
        System.out.println("Instance Block");
    }
    LoadDemo(){ //constructor works last
        System.out.println("Constructor");
    }
}
