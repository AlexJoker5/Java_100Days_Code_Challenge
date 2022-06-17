package Day4;

import java.io.FileInputStream;
import java.util.Properties;

public class Blocks {
    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.show();
    }
}

class Greet{
    String name;
    int count;

    {
        try(FileInputStream input = new FileInputStream("settings.properties")) {
            Properties props = new Properties();
            props.load(input);

            name=props.getProperty("name");
            count= Integer.valueOf(props.getProperty("count"));

        }catch (Exception e){
            e.printStackTrace();
        }
        /*instance block, since it's a class and not added static key word, and not in a method.
        * only instance block can access instance variable.
        * instance block starts working only after creating object once.*/
    }
    void show(){
        for (int i=0; i < count; i++){
            System.out.println(name);
        }
        {
            /*This is local block.
            * it's used in multi-threading.*/
        }
    }
}
class StaticDemo{
    static{
        /*static block, since static keyword is written.
        static block starts working when the class's loading.*/
    }
}
