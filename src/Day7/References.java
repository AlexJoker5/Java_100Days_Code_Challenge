package Day7;

import java.util.*;

public class References {
    /*In Heap Memory, the place where the classes that are used into creating objects are loaded is called young age heap.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("=====  Start  =====");
        System.out.println("===================");
        System.out.println();
        int counter = 0;
        String decision = null;
        do {
            /*I use this loop to test how object runs in JVM and how garbage collector works*/
            /*When we create an object, it exits in Eden of Young Generation of Heap Memory.
            * When we create a new object, the old one is removed from eden.
            * Some objects are moved to survivor spaces. Then, moved to old generation.
            * Some are removed by garbage collector.*/
            Student s = new Student("Student " + (++counter));
            s.greet();
            System.out.println("Exit? : ");
            decision=sc.nextLine();
        }while(!"Y".equalsIgnoreCase(decision));


        Student s1 = new Student("Aung Aung");
        /*object is created in heap memory.
        s1 is running in stack memory and referencing that object.*/
        sayHello(s1);
        /*sayHello method use that referenced object's values.*/
        s1 = new Student("Thidar");
        /*new object is created in heap memory.
        * s1 that is running on the stack memory references to new object and old object s1 is removed by garbage collector.*/
        sayHello(s1);
        /*sayHello method use new referenced object.*/

    }

    static void sayHello(Student student){
        student.greet();
    }

}
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    void greet(){
        System.out.println("Hello! I am " + name);
    }

}