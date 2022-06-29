package Day14;

/*In java, all classes inherited Java Lang Object.*/
public class SingleParent{

    public static void main(String[] args) {

    }

}


class Engine {

    void drive(){
        System.out.println("Driving Start");
    }
}

class Light{

    void open(){
        System.out.println("Open Light");
    }

}

/*In java, multiple class inheritance is forbidden due to Deadly Diamond of Death problem.
* A class can only inherit a single class.*/
class Car extends Engine,Lgiht{

}
