package Day2.UsingOtherClassMembers;

public class UsingDemo {

    public static void main(String[] args) {
        int result = Calculator.add(10,20);
        //To use other class's static method, you need to call its owner class's name.
        System.out.println(result);
        Calculator cal = new Calculator();
        //To use other class's instance method, you need to create an object first.
        System.out.println(cal.divide(100,20));
    }

}
