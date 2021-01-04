package com.planetj.arrays;

import java.util.HashMap;

public class LRUCache {

    HashMap<Integer, Node> map;
    int capacity, count;
    Node head, tail;

    public LRUCache(final int capacity) {

        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.prev = null;
        head.next = tail;
        tail.prev = head;
        tail.next = null;
        count = 0;
    }

    public int get(int key) {
        if(!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        deleteNode(node);
        addNodeToHead(node);
        return node.value;

    }

    private void addNodeToHead(Node node) {

        node.next = head.next;
        node.prev = head;

    }

    private void deleteNode(Node node) {

        node.next.prev = node.prev;
        node.prev.next = node.next;

    }

    public void put(int key, int value) {
        if(map.containsKey(key)){

            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            addNodeToHead(node);

        }else if(!map.containsKey(key)){
            if(count == capacity){

                Node nodeToDel = tail.prev;
                deleteNode(nodeToDel);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            addNodeToHead(node);
            count++;
        }
    }
    public int delete(int key){
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        int result = node.value;
        deleteNode(node);
        return result;
    }

    public static void main(String[] args) {
        LRUCache lrUCache = new LRUCache(5);

        lrUCache.put(1, 10);
        lrUCache.put(2, 20);
        lrUCache.put(3, 30);
        lrUCache.put(4, 40);
        lrUCache.put(5, 50);
        System.out.println("value of key 1: " + lrUCache.get(1));
        lrUCache.put(1, 100);
        System.out.println("value of key 1: " + lrUCache.get(1));
        System.out.println("deleted value : " + lrUCache.delete(2));


    }
}
class Node{

    Integer key;
    Integer value;
    Node prev;
    Node next;

    public Node(Integer key, Integer value){
        this.key = key;
        this.value = value;
    }
}