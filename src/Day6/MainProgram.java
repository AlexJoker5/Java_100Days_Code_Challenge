package Day6;

public class MainProgram {

    public static void main(String[] args) {
        method1(); //copied first in stack memory, deleted last in stack memory
    }

    static void method1(){
        System.out.println("Method 1"); //copied second in stack memory, deleted third in stack memory
        method2();
    }

    static void method2(){
        System.out.println("Method 2");//copied third in stack memory, deleted second in stack memory
        method3();
    }

    static void method3(){
        System.out.println("Method 3");//copied last in stack memory, deleted first in stack memory
    }
}
