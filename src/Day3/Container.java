package Day3;

import java.util.Arrays;

public class Container {
    int [] arr = new int []{};

    public static void main(String[] args) {

        Container c1 = new Container();
        System.out.println(c1.add(5));
        System.out.println(c1.add(3));
        System.out.println(c1.add(1));;
        System.out.println(c1.add(2));;

        System.out.println("Your array is : ");
        c1.get(c1.arr);

    }

    public int  add(int data){
        /*This method is to add new elements into no-element array
        one by one as much as you want and return that added element's index.*/
        int [] newArr= Arrays.copyOf(arr,arr.length+1);
        for(int i =arr.length; i < newArr.length ; i++){
            newArr[newArr.length-1]=data;
        }
        arr = newArr;
        return newArr.length;
    }
    void get(int [] arr){
        /*This method show variables in your array.*/
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
