package Day8;

public class Arguments {

    public static void main(String[] args) {
        int value = 10;
        Value val = new Value(); //val is referencing to Value object.
        val.data = 10;
        /*data in Value object is changed into 10*/

        System.out.println(value); //value = 10
        doSomething(value);
        System.out.println(value); // value = 10

        doSomethingWithObject(val);
        /*Value object that is referenced by val is passed into doSomethingWithObject method.*/
        System.out.println(val.data);
        /*data in Value object is called.*/
    }
    static void doSomething(int value){

        System.out.println(value); //value = 10
        /*value from main method is copied and passed here.*/
        value = value * 2; //value = 20

        System.out.println(value); //value = 20
        /*Since value from main method is copied and passed,
        the changes within this doSomething method won't affect value in main method.*/


    }

    static void doSomethingWithObject(Value value){
        /*value variable's data type is changed to Value object(reference data type).*/
        System.out.println(value.data); // value.data = 10
        /*data in Value object is called.*/
        value.data = value.data * 2; // value.data = 20
        /*data in Value object is changed.*/
        System.out.println(value.data); // value.data = 20
        /*data in Value object is called.*/
    }
}
class Value{
    int data;
}
