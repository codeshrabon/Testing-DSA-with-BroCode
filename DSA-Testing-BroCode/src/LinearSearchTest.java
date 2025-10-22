public class LinearSearchTest {
    public static void main(String[] args) {
        int[] array = {2,4,5,6,1,7,9,12,43,12,45,67,34,22,33,21,24,53,23};
        
        int value = 23;
        System.out.println("Total array size: " + array.length);

        int index = linearSearch(array,value);
        if (index == -1) {
            System.out.println(value + " not found");
        }else{
            System.out.println("Element found in index: " + (index));
        }

    }

    private static int linearSearch(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
