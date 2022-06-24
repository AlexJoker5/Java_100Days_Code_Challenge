package Day_2.UsingOtherClassMembers;

public class Calculator {

    static int add(int a, int b){ //static method
        return a + b;
    }
    static int minus(int a, int b){ //static method
        return a - b;
    }

    int divide(int a, int b){ //instance method
        return a / b;
    }

}
