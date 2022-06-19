package Day5;

class Student {
    //In class, you can't declare private and protected. Only public and default work.

    public String name;
    public int age;
    /*In variable, you can declare all access modifiers.*/

    public Student(String name){
        /*In Constructor, you can also declare all access modifiers.
        * But if you declare private modifier, other classes can't extend to this class anymore.
        * More details about access modifiers will be in Inheritance.*/
        this.name = name;
    }

    void greet(){ // you can't write any access modifiers between return type and method name in methods.
        System.out.println("Hello, I am "+name);
        System.out.println("I am "+age+" years old.");
    }

}

class MasterStudent extends Student{
    MasterStudent(String name){
        super(name);
    }
}
