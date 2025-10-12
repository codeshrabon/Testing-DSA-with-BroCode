import java.lang.reflect.Array;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        // linear search = iterate through a collection one element at a time
        int[] array = {83, 17, 42, 96, 5, 61, 28, 74, 39, 90,
                        12, 67, 33, 8, 49, 21, 77, 3, 58, 100};

        int index = linearSearchForValueIndex(array, 67);

        if (index != -1) {
            System.out.println("index of 67 is : " + index);
        }else{
            System.out.println("No found");
        }
        // new update 

    }
    private static int linearSearchForValueIndex(int[] array, int value){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
