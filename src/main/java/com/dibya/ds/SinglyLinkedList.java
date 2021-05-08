package com.dibya.ds;

import java.util.Scanner;

public class SinglyLinkedList {
    public Node head=null;
    public Node tail=null;

    public void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
        } else {
//            Node tail = head;
//            while (tail.next != null){
//                tail.next=newNode;
//            }
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void display(){
        Node current = head;

        if(head==null){
            System.out.println("list is empty");
        }

        while (current!=null){
//            System.out.println("Our singly Linked list: ");list
            System.out.print(current.data+" -> ");
            current=current.next;
        }

        System.out.println("End of printing !!! ");
    }
     public static void main(String[] args) {
         SinglyLinkedList sl = new SinglyLinkedList();
         sl.display();
         Scanner sc = new Scanner(System.in);
         System.out.println("Dou you want to add data to linked list Y /N :");
         String continueAdd = sc.nextLine().toUpperCase();
         while (continueAdd.equalsIgnoreCase("Y")){
             System.out.println("Enter data enter 100 to stop : ");
             int data = sc.nextInt();
             sl.add(data);
             if(data==100){
                 continueAdd="N";
             }
         }

         sl.display();
         System.out.println("eneter data of node to delete :");
         int value = sc.nextInt();
         sl.delete(value);
         sl.display();
     }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public void delete(int data){
        Node prev = null;
        Node current = head;
        if(current.data == data){
            head=null;
        } else {
            while (current.next!=null){
                if(current.data==data){
                    System.out.println("Deleted node : "+current);
                    current.data = current.next.data;
                    current.next= current.next.next;
                    break;
                }
                current = current.next;
            }
        }
    }
}
class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}