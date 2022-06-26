package Day11;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {3,2,4,9,7,8,6,1,5,2,0};
        /*I'm using selection sort here.*/

        /*show data*/
        show(array);

        /*sort*/
        sortArray(array);

        /*show sorted data*/
        show(array);
    }

    static void show(int [] array){
        /*[1,2,3,....]*/
        System.out.print("[");

        for(int i = 0; i< array.length; i++){
            if (i > 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }

        System.out.println("]");
    }

    static void sortArray(int [] array){

        for (int i = 0; i < array.length - 1; i ++){
            int target = i;
            for (int j = target; j < array.length - 1; j++){
                if (array[target] > array[j + 1]){
                    target = j + 1;
                }
            }// end of inner loop
            int min = array[target];
            /*replace target with initial value.*/
            array[target] = array[i];
            array[i] = min;
        }
    }
}
