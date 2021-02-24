package com.planetj.filehandling;

import java.util.LinkedList;

public class FileDemo {

    public static void main(String args[]) {

        int [] arr1 = new int [5];
        var list = new LinkedList<Integer>();
        list.toArray();


        Object dummyObject = new Object();
        Object lock = new Object();

        synchronized (lock) {
            System.out.println("Inside synchronized block. About to notify...");
            lock.notify();

        }
    }
}
