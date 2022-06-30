package Day14;

abstract class Animal {

    /*Abstraction is the process of hiding certain details and showing only essential information to the user
    * There are two ways to use abstraction : abstract class and interface.
    * Abstract Class can't be used to create an object.
    * */

    abstract void feed(String food);

    void greet(){
        System.out.println("Hello Java.");
    }
}

class Monkey extends Animal{

    void feed(String food) {

    }
}

class Elephant{

}

class Zoo {

    private Animal [] animals = new Animal[10];

    boolean add (Animal animal){
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
