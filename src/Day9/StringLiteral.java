package Day9;

public class StringLiteral {
    public static void main(String[] args) {
        /*Only String can be written in literal within Objects.
        * When you create string variable, String is created and stored in String Pool memory of Heap memory.
        * When you create String object, String object is created and stored in Eden memory of Heap memory.
        * String object checks first whether there's already same String object in string pool then create a string object.*/
        String hello = "Hello Java";
        String hello1 = new String("Hello Java");
        /*Even though hello and hello1 have same value of string object.
        * They are not referencing the same object.
        * So, you can't use "==" relational operator in String.
        * If you want check String value, you can use .equal() method in string.*/
        System.out.println(hello == hello1);
        System.out.println(hello.equals(hello1));

    }
}
