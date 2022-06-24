package Day_1;

public class ScopeDemo {
    public static void main(String[] args) {
        //static method
        Demo demo = new Demo();
        demo.doSomething("Hello");

    }
}

class Demo{


    Demo(){
        /* This is a default constructor
        * and multi-lines comment*/
        System.out.println("Constructor Block : Body : " + body);//variable works in constructor
    }

    void doSomething(String str){//String args Variable can be also regarded as Local Variable
        //This is a method with no return

        System.out.println("Method Block : Body : " + body);//variable works in method

        for (int i=0; i < 10; i++){
            //For Block
            System.out.println("For Loop Block : Body : " + body++ + i); //variable works in for loop of a method

        }
    }
    int body = 1;
    /*This variable can be used within Demo class block
    * The global variables are those variables which are written within class block directly.*/

    {
        //This is code block.
        String name = "Block Variable";
        /*variable in a block is called Local variable.
        It can be only used within a block which it's called.*/
        System.out.println("Code Block : Body : " + body + name);
        /*global variable in code block can be used
        only after global variable is declared above it.*/
    }
}