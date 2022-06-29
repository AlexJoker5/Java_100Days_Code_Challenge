package Day13;

public class Inheritance {

    public static void main(String[] args) {
        Student s = new Student();
        /*I write these class's members in Student class ,but
        I can use methods of person class from student class due to inheritance.*/
        s.name = "Kyaw Soe";
        s.greet();
        Person p = s; //Child class's object can be used in person class type variable.
        p.greet();

        Person p1 = new Student();
        p1.greet();

        Student s1 = new Student();
        Person p2 = s1; // Implicit type casting.
        Student s2 = (Student) p; //Explicit type casting.
        /*When type casting object, you can only type cast when your reference object must be its super class.*/
        s1.learn();
        s2.learn();
        /*Every Parent Class can use Child Class and every child class can't be parent class.*/

        s1.greet();
    }
}
/*Is-a-relationship happens when classes extend.
* Due to Is-a-relationship, child object can be replaced into parent type variable.
* When you want to use Parent type variable into child type, you need to do explicit type casting.*/
class Person { //Parent class
    /*Child class can be only inherited from Parent class's members
    which have public, private and default-package (if you are in one package.)*/
    String name = "Person";

    Person(){}

    Person(String name){
        this.name = name;
    }

    Person getFriend(){
        return null;
    }

    void greet(){
        System.out.println("Hello I am " + name);
    }

    private void doPrivate (){
        System.out.println("Private Work.");
    }
}

class Student extends Person // Child Class
/*Student class inherited Person class and its members.*/
{
    /*Since Parent class has a constructor which has argument,
    child class also need to either use its super class's argument or return value which super needs.
    Or you can just create a default constructor in parent class if you don't have to use constructor with argument.*/

    Student(String name){
        super(name);
    }
    Student(){
        super("Student");
    }

    @Override
    Person getFriend(){
        return null;
    }

    void learn(){
        System.out.println("I am Learning.");
    }

    /*You need to exact same method signature for both classes and the classes must have inheritance.
    * You can't override private methods.
    * Child method's access modifier can't be lower than parent method's access modifier.
    * Child class return type can't be used in parent method but parent class return type can be used in child method.
    * */
    @Override
    void greet(){
        System.out.println("Hi! I am " + name);
    }

    void greet(String other){
        System.out.println("Hi! " + other + " I am " + name );
    }

    void doPrivate(){
        System.out.println("Private for Student");
    }

}

class Teacher extends Person { //Child class

    Teacher(String name){
        super(name);
    }

}