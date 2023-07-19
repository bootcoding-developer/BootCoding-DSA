package com.bootcoding.linkedlist;

import com.bootcoding.linklist.LinkList;

import java.util.Random;

public class DeleteLinkedList {


    public static void main(String[] args) {
        Node head = createLL(10);
        System.out.println("Before Delete");
        printLinkedList(head);
        //head = head.next;
        Node current = head;
        Node prev = current;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
        System.out.println("After Delete");
        printLinkedList(head);
    }

    private static Node createLinkedList()
    {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node forthNode = new Node(4);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }

    private static Node createLL(int size)
    {
        Node head = new Node(10);
        Node temp = head;
        for(int i= 1; i < size; i++){
            Node newNode = new Node(new Random().nextInt());
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }
    public static void printLinkedList(Node head){
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
