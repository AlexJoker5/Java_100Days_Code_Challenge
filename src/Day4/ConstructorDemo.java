package Day4;

public class ConstructorDemo {
    public static void main(String[] args) {
        Hello hello;
        hello = new Hello();
        /* when you create an object without creating its constructor,
        java compiler automatically create a default constructor with no argument*/
        hello.greet();
    }
}
class Hello{
    /*To write a constructor, constructor must have the same name with its class's name.
    * You must not write return type to constructor.
    * For argument, you can leave no argument ,but if you wish, you can write arguments like method's arguments
    * You can write more than one constructor in a class.*/
    int count; //global scoped variable

    Hello(){
        count=1;
    }
    Hello(int count /*local scoped variable*/){
        /*when you assign variable in constructor's argument,
        java compiler will no longer create a default constructor.
        You need to assign variable in object.*/
        if (count>0){
            this.count=count;
        }
        /*You can't write constructors with same argument type and number of arguments*/
        /*In java, you can't use variables with same name within scope.
        When your global and local variables have the same name,
        java will assign variable that you call to nearest its scope.
        To use same named global variable in local scope,
        you need to use "this" keyword in front of your global variable.
        */
    }
    /*Reason why we assign constructor's argument and write constructors is
    * we need to initialize instance variable before we use method*/


    void greet(){
        for(int i =0; i<count; i++){
            System.out.println("Hello Java.");
        }
    }

    /*Note : You need to know the reason and its purpose of a constructor that you write */
}