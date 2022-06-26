package Day11;

public class NestedDemo {

    public static void main(String[] args) {
        /*Nested Loop is a loop in a loop
        * Nested loop can be used in sorting algorithm.*/

        int [][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < array.length; i++){
                int [] arrays = array[i];
                for (int j = 0; j < arrays.length; j++){
                    System.out.println(arrays[j]);
                }
        }
    }
}
