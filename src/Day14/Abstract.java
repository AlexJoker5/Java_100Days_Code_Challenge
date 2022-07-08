package Day14;

public class Abstract{

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        /*Abstract class can't be used to create an object itself,
        * but it can reference to its extended class and create an object.*/
        Animal a1 = new Monkey("Moki Moki");
        System.out.println(zoo.add(a1));
        System.out.println(zoo.add(new AsiaElephant("Mo Mo")));
        zoo.add(new Monkey("Loki Loki"));
        zoo.add(new AsiaElephant("Mon Mon"));
        zoo.add(new Tiger("Michael"));
        zoo.add(new AfricanElephant("Zolo"));
        zoo.feed("Banana");
        zoo.wash();



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

    protected String name;

    Animal(String name){
        this.name = name;
    }

    abstract void feed(String food);

    void greet(){
        System.out.println("Hello Java.");
    }
}

class Monkey extends Animal{
    /*When variables in superclasses and subclasses have the same names, use super keyword to use variables in superclasses.*/
    Monkey(String name){
        //System.out.println(super.name.length());
        //You can't use inherited properties before super initialization.
        //Can't access inherited properties
        super(name);
        //Can access inherited properties
        //System.out.println(super.name.length());
    }

    void feed(String food) {
        System.out.println("Kwe Kwe! Yummy! " + food);
    }
}

abstract class PetMonkey extends Monkey{
    PetMonkey(String name){
        super(name);
    }
    abstract void dance();
}

/*when a concrete class extends an abstract class, concrete class needs to override the methods in abstract class and its ancestral abstract classes.
* But when an abstract class extends an abstract class, overriding methods in abstract class isn't required.*/
abstract class Elephant extends Animal{
    Elephant(String name){
        super(name);
    }

    //extended class needs to override this method.
    abstract void wash();
    //extended class may or may not override this method.
    void feed (String food){
        System.out.println("I am eating " + food);
        System.out.println("Moor!!!");
    }

}

class AsiaElephant extends Elephant{
    AsiaElephant(String name){
        super(name);
    }
    @Override
    void wash() {
        System.out.println("Moor!!!");
        System.out.println("I like playing in the water.");
    }
}

class AfricanElephant extends Elephant{
    AfricanElephant(String name){
        super(name);
    }

    @Override
    void wash() {
        System.out.println("What did you do to me?");
        System.out.println("I hate playing in the water!");
    }
}

class Tiger extends Animal{
    Tiger(String name){
        super(name);
    }

    @Override
    void feed(String food) {
        if (food.equals("meat")){
            System.out.println("Nice Food!");
        }else{
            System.out.println("Are you kidding me, " + food +"? \n I am a carnivorous animal.");
        }
    }
}

class Zoo {

    private Animal [] animals = new Animal[10];

    boolean add (Animal animal){
        for (int i = 0; i < animals.length; i++){
            if(animals[i]==null){
                animals[i] = animal;
                return true;
            }

        }

        return false;
    }

    void wash(){
        for (Animal a : animals){
            if(a instanceof Elephant){
                Elephant e = (Elephant) a;
                e.wash();
                System.out.println();
            }
        }
    }

    void feed (String food){
        for(Animal a : animals){
            if (null != a){
                a.feed(food);
                System.out.println();
            }
        }
    }
}
