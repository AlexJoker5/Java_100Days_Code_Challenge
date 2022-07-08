package Day14;

public class Abstract{

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

    }
}

abstract class Animal {

    /*Abstraction is the process of hiding certain details and showing only essential information to the user
    * There are two ways to use abstraction : abstract class and interface.
    * Abstract Class can't be used to create an object.
    * abstract keyword is used in methods and classes when you want to use that methods in extended classes.
    * final keyword is used in methods and classes when you don't want to use the methods and classes in another classes.
    * You can't override a final method. You can't extend final class.
    * You can write an abstract methods and normal methods in an abstract class.*/

    abstract void feed(String food);

    void greet(){
        System.out.println("Hello Java.");
    }
}

class Monkey extends Animal{

    void feed(String food) {
        System.out.println("Kwe Kwe! Yummy! " + food);
    }
}

abstract class PetMonkey extends Monkey{
    abstract void dance();
}

/*when a concrete class extends an abstract class, concrete class needs to override the methods in abstract class and its ancestral abstract classes.
* But when an abstract class extends an abstract class, overriding methods in abstract class isn't required.*/
abstract class Elephant extends Animal{

    //extended class needs to override this method.
    abstract void wash();
    //extended class may or may not override this method.
    void feed (String food){
        System.out.println("I am eating " + food);
        System.out.println("Moor!!!");
    }

}

class AsiaElephant extends Elephant{
    @Override
    void wash() {
        System.out.println("Moor!!!");
        System.out.println("I like playing in the water.");
    }
}

class Zoo {

    private Animal [] animals = new Animal[10];

    boolean add (Animal animal){
        for (int i = 0; i < animals.length; i++){
            if(animals[i]==null){
                animals[i] = animal;
            }
        }

        return false;
    }

    void feed (String food){
        for(Animal a : animals){
            if (null != a){
                a.feed(food);
            }
        }
    }
}
