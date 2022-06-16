package Day3;

public class MultiArray {

    public static void main(String[] args) {
        /*You can declare multidimensional array as the following ways.*/
        int [] [] array1 = {/*You can use this way when you know the exact elements containing in the array.*/
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int array2 [] [] = new int [3][3];
        /*You use this way when you don't know the exact elements,
        but you know or can guess the number of elements to add into the array.*/
        int [] array3 [];
        array3 = new int [][] { //This is as same as No.1.
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(array1[0][1]); // This will produce 2.

    }

}
