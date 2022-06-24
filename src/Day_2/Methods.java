package Day_2;

public class Methods {
    public static void main(String[] args) {
        String [] array = {"A", "B", "C"};
        MethodTypes mm = new MethodTypes();
        mm.hello();
        mm.hello("Alex ",5);
        mm.hello(0,"Alex"," Luther");
//        mm.showArray(array);
        System.out.println(mm.add(10,5));
    }
}
class MethodTypes {
    /*To write a method you need at least
    return type of the method,
    method's name,
    argument and
    method body (code block). */
    /*Method Name + Method Argument = Method Signature
     * Depending on Method Signature, you can regard whether this method is unique or not.*/
    void hello(){
        System.out.println("Hello");
    }
    /*You can write same named method but with different arguments. This is called Method Overloading.
     * But you can't write a method with the same method signatures.*/

    void hello(String name, int count){
        System.out.println("Hello " + name + count);
    }
    /*We can use unlimited arguments in a method ,but it's bad practice.
     * Starting from Java SE 5, we can use Varargs.
     * Varargs is called Variable Arguments. Varargs parameter must be the last parameter.
     * */
    void hello(int count, String ... names){
        for(String str : names){
            count++;
            System.out.println(count + ".Hello " + str);
        }
    }


    /*For those methods which doesn't mean to give return value, you need to write void as return type.
     * If you want to give return value in the method, you must give value's datatype as return type.
     * You can't give wrong return value's datatype.
     * You can give different return value's datatype if your return type can be converted into return value's datatype.*/
    /*For int return type, any datatype which can be converted into int can be given.*/
    int add(int num1, int num2){
        return '0'+ num1 + num2;
    }
}
