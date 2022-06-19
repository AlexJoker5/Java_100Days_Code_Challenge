package Day5.hello;
/*package statement can be only written once and first before any code except comment.*/

import Day5.hello.sub.SubClass;

public class Hello {
    /*In Java, accessibility(Access Modifier) is important. There are 4 kinds of accessibility.
    * First one, public (Can be used in any class.)
    * Second one, private (Cannot be used by other classes including its package.)
    * Third one, default-package (Can be used by other classes in its package.)
    * Fourth one, protected (Can be used by other classes in its package and classes which extended it.)*/
    SubClass subClass = new SubClass();

    public void greet(){
        System.out.println("Hello Java.");
        subClass.greet();
    }



}
