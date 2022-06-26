package Day11;

public class ReturnBranch {
    public static void main(String[] args) {

        int value = 10;
        String [] array = {"Java","Python","C++","C#","Javascript"};
        String [] arrays = null;

        //Example return methods
        System.out.println(isEven(value));
        writeData(arrays);
        System.out.println("Before Return");
        if (args.length > 0){
            return;
            /*After the return statement, codes that are in the same block will not continue running.
            The block out of return block will run.*/
        }
        System.out.println("After Return"); //This is an example of the block out of return block.



    }

    static boolean isEven(int value){
        return (value%2) == 0; //This is typical return type which return the value.
    }

    static void writeData(String [] array){
        if (null == array || array.length == 0){
            return;
            /*return in here stop the function and return nothing.
            This type of return can be only written in void return type.*/
        }
        for (String s : array){
            System.out.print(s + " ");
        }
    }
}
