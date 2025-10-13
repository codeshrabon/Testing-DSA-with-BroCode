import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // as we know linear search are not meant to be sorted 
        // but here for binary search array must be in sorted 
        int[] array = new int[100];

        int target = 40;

        

        for (int i = 0; i < array.length; i++) {
            array[i] = i;        
        }

        int index = Arrays.binarySearch(array, target);

        if (index != -1) {
            System.out.println("Element found in index: " + index);
        }else{
            System.out.println("Element not found");
        }

        
    }
}
