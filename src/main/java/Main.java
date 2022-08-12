import hometask2.task1.MyLinkedList;
import hometask2.task2.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myarr = new MyArrayList<>();
        myarr.add("first");
        myarr.add("second");
        myarr.add("c");
        myarr.add("d");
        myarr.add("e");
        myarr.add("f");

//        System.out.println(myarr.get(0));
//        System.out.println(myarr.get(1));
        myarr.printAll();

        myarr.remove(3);
        myarr.printAll();

        System.out.println(myarr.containsOf("f"));

        ///////////////////////////////////
        MyLinkedList<String> myll = new MyLinkedList<>();
        myll.addLast("first elem");
        myll.addLast("second elem");
        myll.addLast("third elem");


//        System.out.println(myll.getFirst());
//        System.out.println(myll.getLast());
//        myll.printAll();
//        myll.printAllReverse();
//        myll.removeFirst();
//        myll.removeLast();
        System.out.println("/////");
        System.out.println(myll.getFirst());
        System.out.println(myll.getLast());
        //myll.removeLast();
        myll.removeFirstMatch("second elem");
        myll.printAll();
    }
}
