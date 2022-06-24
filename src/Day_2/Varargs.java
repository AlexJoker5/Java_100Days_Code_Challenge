package Day_2;

public class Varargs {

    public static void main(String[] args) {
        String [] array = {"A", "B", "C"};

        show(array);
        show("Hello ",array);
    }
    /*
    The methods with same method signatures which has same datatype in arguments become ambiguous.
    So, you can't use both the methods.

    */
    static void show(String ... strs){
        for (String str: strs) {
            System.out.println(str);
        }
    }
    static void show(String string, String ... strs){
        System.out.println("First " + string);
        for (String str : strs){
            System.out.println(str);
        }
    }

}
