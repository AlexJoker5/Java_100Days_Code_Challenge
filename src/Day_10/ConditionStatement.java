package Day_10;

public class ConditionStatement {

    public static void main(String[] args) {
        int x = 10;

        if(x < 9){ // x value is greater than 9, the condition is false.
            System.out.println("Hello Java I");
        }
        else if(x > 0){ // x value is greater than 0, the condition is true.
            System.out.println("Hello Java EI");
        }else{ // "else" won't work since "else if" condition is already true.
            System.out.println("Hello Java E");
        }

        isEven(x);
        showGrade(100);

    }
    static void isEven (int value){
        if(value % 2 == 0){
            System.out.println(value + " is even number.");
        }
        else{
            System.out.println(value + " is odd number.");
        }
    }

    static void showGrade(int mark){
        if(mark < 40 && mark >= 0){
            System.out.println("Fail");
        }
        else if(mark >= 40 && mark < 80){
            System.out.println("Pass");
        }
        else if(mark >= 80 && mark <= 100){
            System.out.println("Excellent");
        }else{
            System.out.println("Please enter the valid marks.");
        }
    }
}
