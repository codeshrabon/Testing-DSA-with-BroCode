import java.util.*;

public class UseOfDynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public UseOfDynamicArray(){
        this.array = new Object[capacity];
    }

    public UseOfDynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
}
