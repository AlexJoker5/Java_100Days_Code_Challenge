package Day10;

public class ForDemo {

    public static void main(String[] args) {
        String [] array = {"Hello Java", "Java 17", "Oracle OCP 11"};
        showName(array);
        showName(5,"Hello Java");
    }

    static void showName(int count, String name){
        for
        ( //for clause
                int i = 1;   //Initialize Statement
                count >= i;   //Decision Statement
                i++   //Incremental statement
        )
        {   //for block
            System.out.println(i + ". " + name);
        }
    }
    static void showName(String [] array){
        for (String str:array){
            System.out.println(str);
        }
    }
}