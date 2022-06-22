package Day8;

public class MultiReference {

    public static void main(String[] args) {
        Counter c1 = new Counter("C1");
        /*Counter object is created in heap memory and string variable "C1" is used in Counter object.
        c1 is referencing to Counter object.*/
        c1.countUp(); //C1 : 1

        Counter c2 = c1;
        /*c2 is referencing to exiting Counter object (** Not creating a new object **)*/
        Counter c3 = c2;
        /*c3 is referencing to exiting Counter object (** Not creating a new object **)*/
        c2.countUp();//C1 : 2
        c3.setName("C3"); //C3
        c1.countUp(); // C3 : 3
        /*Regardless of variables which is referencing to exiting Counter object changes arguments
        * The referenced object is the only working.*/
    }

}
class Counter{
    private String name;
    private int count;

    Counter(String name){
        this.name =name;
    }

    void setName(String name){
        this.name=name;
    }
    void countUp(){
        count++;
        System.out.println("Counter " + name + " : " + count);
    }
}
