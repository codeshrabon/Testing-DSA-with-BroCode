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

    public UseOfDynamicArray(int capacity, int size){
        this.size = size;
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++; // now went to toString method 
    }

    public void insert(int index,Object data){

        if (size >= capacity) {
            grow();
        }

        //(going backward) → prevents overwriting.
        for (int i = size; i > index; i--) {
            //we start from the end of the filled portion (size) and move backwards.
            //shifts everything right, creating space.
            array[i] = array[i - 1];
        }
        array[index] = data;
        //put the new element, update actual count.
        size++;
    }


    public void delete(Object data){

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <=(int) (capacity/3)) {
                    shrink();
                }
                break;

            }
            
        }

    }

    public int search(Object data){

        // iterate through all the element to find the exact data 
        for (int i = 0; i < size; i++){
            if (array[i] == data) {
                // will show the index of it that where is was found 
                // cause this was out main target that where it is existing
                
                return i;
            }
        }
        return -1;
    }

    private void grow(){
        int newCapacity = (int )(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        // copy those element that was in the previous array to new array 
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        // now set them to the original one 
        capacity = newCapacity;
        array = newArray;

    }

    private void shrink(){
        int newCapacity = (int )(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        // copy those element that was in the previous array to new array 
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        // now set them to the original one 
        capacity = newCapacity;
        array = newArray;

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){

        String string = "";

        // Loops from index 0 to size - 1 
        //(so it only prints filled elements, not unused capacity).

        // we are using size to how many slots are actually filled with real data
        // capacity are for total slots
        /* for(int i = 0; i < size ; i++){
            string += array[i] + ", ";
        }  */
        for(int i = 0; i < capacity ; i++){
            string += array[i] + ", ";
        } 
        
        if (string != "") {
            string = "["+ string.substring(0, string.length() - 2) + "]"; 
                                    // cut off the last 2 characters.
                                    //(comma + space = 2 chars)
        }
        else{
            string = "[]";
        }

        return string;
    }

}
