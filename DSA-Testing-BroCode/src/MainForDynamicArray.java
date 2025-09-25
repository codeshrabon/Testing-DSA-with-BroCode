public class MainForDynamicArray {
    public static void main(String[] args) {
        UseOfDynamicArray useOfDynamicArray = new UseOfDynamicArray();

        // System.out.println(useOfDynamicArray.capacity +" - "+ useOfDynamicArray.size);

        useOfDynamicArray.add("A");
        useOfDynamicArray.add("B");
        useOfDynamicArray.add("C");
        useOfDynamicArray.add("D");
        //useOfDynamicArray.add("E");
        //useOfDynamicArray.add("F");
        useOfDynamicArray.insert(0, "X");
        useOfDynamicArray.insert(2, "Y");

        System.out.println(useOfDynamicArray);
        System.out.println("Array size: "+ useOfDynamicArray.size);
        System.out.println("Array capacity: " + useOfDynamicArray.capacity);
        System.out.println("Empty: "+ useOfDynamicArray.isEmpty());
    }
}
