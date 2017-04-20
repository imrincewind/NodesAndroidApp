package com.example.eze.nodos;


/**
 * Created by Eze on 16/4/2017.
 */


public class Node {
    private int info;
    private Node next;


    public Node(Node n, int st) {
        next = n;
        info = st;
    }


    public void setInfo(int st) {
        info = st;
    }

    public void setNext(Node i) {
        next = i;
    }

    public int getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }



    public void printNodeByInfo(){
        System.out.println(info);
    }
}
