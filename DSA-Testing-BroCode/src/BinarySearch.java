import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // as we know linear search are not meant to be sorted 
        // but here for binary search array must be in sorted 
        int[] array = new int[100];

        int target = 40;

        for(int i = 0; i < array.length ; i++){
            array[i] = i;
        }

        // for (int i = 0; i < array.length; i++) {
        //     array[i] = i;        
        // }

        // int index = Arrays.binarySearch(array, target);

        // if (index != -1) {
        //     System.out.println(target +" Found in index: " + index);
        // }else{
        //     System.out.println("Element not found");
        // }

        // so far we use methods for binary search 
        // time to use manual 
        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Element found in: " + index + " Index");
        }else{
            System.out.println("Element not found");
        }
        
    }

    private static int binarySearch(int[] array, int target){
            int low = 0;
            int high = array.length - 1;
            
            // here we use while loop to check low is low <= high
            while (low <= high) {
                int middle = low + (high - low) / 2;
                int value = array[middle];

                System.out.println("Middle value : " + middle);

                if (value < target) {
                    low = middle + 1;
                }else if (value > target) {
                    high = middle - 1;
                }else{
                    return middle; // target is found
                }
            }

            return -1; 
        }
}
