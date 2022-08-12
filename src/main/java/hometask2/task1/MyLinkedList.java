package hometask2.task1;

import java.util.LinkedList;

public class MyLinkedList<T> {

    private int size;
    private MyNode<T> first;
    private MyNode<T> last;


    public void addFirst(T elem){
        if(size == 0){
            first = new MyNode<T>(null, null, elem);
            last = first;
            size++;
            return;
        }
        if(size == 1) {
            last = first;
        }
        MyNode<T> newNode = new MyNode<>(null, first, elem);
        first.prev = newNode;
        first = newNode;
        size++;
    }
    public void addLast(T elem){
        if(size == 0){
            last = new MyNode<T>(null, null, elem);
            first = last;
            size++;
            return;
        }
        if(size == 1) {
            first = last;
        }
        MyNode<T> newNode = new MyNode<>(last, null, elem);
        last.next = newNode;
        last = newNode;
        size++;
    }
    public T getFirst(){

        return first.elem;

    }
    public T getLast() {
        return last.elem;
    }
    public void printAll(){
        MyNode nextNode = first;
        while(nextNode != null){
            System.out.println(nextNode.elem);
            nextNode = nextNode.next;
        }
    }
    public void printAllReverse(){
        MyNode lastNode = last;
        while(lastNode != null){
            System.out.println(lastNode.elem);
            lastNode = lastNode.prev;
        }
    }

    public void removeFirst(){
        first.next.prev = null;
        first = first.next;
        size--;
    }
    public void removeLast(){
        last.prev.next = null;
        last = last.prev;
        size--;
    }

    public void removeFirstMatch(T elem){
        MyNode<T> nextNode = first;
        while(nextNode != null){
            if(nextNode.elem.equals(elem)){
                nextNode.next.prev = nextNode.prev;
                nextNode.prev.next = nextNode.next;
                break;
            }
        }
    }



    private static class MyNode<T>{
        T elem;
        private MyNode next;
        private MyNode prev;

        MyNode(MyNode<T> prev, MyNode<T> next, T elem){
            this.next = next;
            this.prev = prev;
            this.elem = elem;
        }
    }
}
