package hometask2.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    private T[] array;
    private int initialSize = 10;
    private int currentSize;
    private int lastElem = 0;


    public MyArrayList(){

        array = (T[]) new Object[initialSize];
        currentSize = initialSize;
    }

    public T get(int index){
        return array[index];
    }

    public boolean add(T newEl){
        if(lastElem + 1 >= array.length){
            arrayResize();
        }
        array[lastElem++] = newEl;
        return true;
    }

    private void arrayResize() {
        T[] newArray = (T[]) new Object[currentSize * 2];
        System.arraycopy(array,0, newArray,0, array.length );
        array = newArray;
    }

    public boolean remove(int index){
        if(index - 1 > currentSize || index < 0){
            return false;
        }else {
            T[] newArray = (T[]) new Object[currentSize - 1];

            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            array = newArray;
            lastElem--;
            return true;
        }

    }
    public int size(){
        return lastElem;
    }
    public void printAll(){
        for (int i = 0; i < lastElem; i++) {
            System.out.println(array[i]);
        }
    }
    public boolean containsOf(T elem){
        for (int i = 0; i < lastElem; i++) {
            if(array[i].equals(elem)){
                return true;
            }
        }
        return false;
    }
}
