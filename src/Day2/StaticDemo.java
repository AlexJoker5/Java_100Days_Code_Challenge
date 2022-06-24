package Day2;

public class StaticDemo {

    String instanceMessage = "Instance Variable"; //instance variable
    static String staticMessage = "Static Variable"; //static variable

    public static void main(String[] args) {//static method

        //main(); instance method can't be used in the static method.
        //System.out.println(instanceMessage); instance variable can't be used in the static method.
        hello(); //static method can be used in the static method.
        System.out.println(staticMessage); //static variable can be used in the static method.
        //To Conclude, static method can only use static method and static variable and can't use instance method and variable.

        StaticDemo demo = new StaticDemo();
        demo.main();

    }

    static void hello(){ //static method
        System.out.println("Hello Static Method.");
    }

    void main(){ // instance method
        instanceMethod(); //instance method can be used in the instance method.
        System.out.println(instanceMessage);//instance variable can be used in the instance method.
        hello(); //static method can be used in the instance method.
        System.out.println(staticMessage); //static variable can be used in the instance method.
        //To Conclude, instance method can use not only instance variables and methods but also static variables and methods.
    }

    void instanceMethod(){ // instance method
        System.out.println("Hello Instance Method.");
    }
}
