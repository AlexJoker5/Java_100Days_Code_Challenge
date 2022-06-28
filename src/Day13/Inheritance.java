package Day13;

public class Inheritance {

    public static void main(String[] args) {
        Student s = new Student();
        /*I write these class's members in Student class ,but
        I can use methods of person class from student class due to inheritance.*/
        s.name = "Kyaw Soe";
        s.greet();
        Parent p = s; //Child class's object can be used in person class type variable.
        p.greet();

        Parent p1 = new Student();
        p1.greet();

        Student s1 = new Student();
        Parent p2 = s1; // Implicit type casting.
        Student s2 = (Student) p; //Explicit type casting.
        /*When type casting object, you can only type cast when your reference object must be its super class.*/
        s1.learn();
        s2.learn();
        /*Every Parent Class can use Child Class and every child class can't be parent class.*/
    }
}
/*Is-a-relationship happens when classes extend.
* Due to Is-a-relationship, child object can be replaced into parent type variable.
* When you want to use Parent type variable into child type, you need to do explicit type casting.*/
class Parent {
    /*Child class can be only inherited from Parent class's members
    which have public, private and default-package (if you are in one package.)*/
    String name = "Person";

    void greet(){
        System.out.println("Hello I am "+name);
    }

    void doPrivate (){
        System.out.println("Private Woek.");
    }
}

class Student extends Parent
/*Student class inherited Person class and its members.*/
{
    void learn(){
        System.out.println("I am Learning.");
    }
}