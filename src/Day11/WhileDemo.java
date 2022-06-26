package Day11;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WhileDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Show Explanation*/
        System.out.println("========================");
        System.out.println("===== GUESS NUMBER =====");
        System.out.println("========================");
        System.out.println();
        /*loop start*/
        boolean same = false;
        /*if same => finish loop*/
        while(!same){

            /*get user input*/
            System.out.print("Your number is (1...5): ");
            String input = sc.nextLine();
            int userInput = Integer.valueOf(input);

            /*generate number*/
            int generated = ThreadLocalRandom.current().nextInt(1,5);


            /*print result*/
            System.out.println("Generated Number " + generated);

            /*print generated number*/
            same = userInput == generated;

            String result = same ? "You Win!" : "You Lose!";
            System.out.println(result);

        }
        /*Do while and while has similar function
        * But do while run the codes inside whether it's true or not*/





        String str = sc.next();
    }

}
