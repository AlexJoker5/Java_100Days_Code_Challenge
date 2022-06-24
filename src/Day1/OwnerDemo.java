package Day1;

public class OwnerDemo {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.name="Counter 1";
        c2.name="Counter 2";

        c1.countUp();
        c1.countUp();

        c2.countUp();
        /*Object is a memory reference.
        When you create an object, instance variables within that class are copied into an object.
        Again, you create a new object with same class.
        It creates an object and instance variables within that class are copied again.
         */

        c1.countUp();
    }
}
class Counter {
    /*Owner of an instance variable is its Object.
    Instance variable can be only used in an object and can't use in another class without building the object.
    While creating an object, an object only copies instance variables and doesn't copy static variables.
    So, static variables keep updating while you use them in method.
    */
    String name;//a variable in a class which is used to build an object is called an instance variable
    static int count = 0;

    /*static variable
    * In default, variables in object class are instance variables.
    * If you add static keyword in instance variable, it becomes static method.*/

    void countUp(){//a method in a class which is used to build an object is called an instance method
        count ++;
        System.out.println("Count of " + name + " : " + count);
    }
}
