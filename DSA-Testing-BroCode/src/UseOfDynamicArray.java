import java.util.*;

public class UseOfDynamicArray {
    int size;
    int capacity = 5;
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

    public void inser(int index,Object data){

    }


    public void delete(Object data){

    }

    public int search(Object data){
        return -1;
    }

    private void grow(){

    }

    private void srink(){

    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){

        String string = "";

        // Loops from index 0 to size - 1 
        //(so it only prints filled elements, not unused capacity).

        for(int i = 0; i < size ; i++){
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
