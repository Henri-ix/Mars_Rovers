package org.example;

import java.util.HashSet;
import java.util.Set;

public class Compass {

    protected DoublyLinkedList cardinals;
    protected Node point;
    private Set<Character> points = new HashSet<>();

    public class Node{
            char data;
            Node prev;
            Node next;

            public Node(char data)
            {
                this.data = data;
                this.prev = null;
                this.next = null;
            }

    }

    public class DoublyLinkedList{
        Node head;
        Node tail;

        public DoublyLinkedList(){
            this.head = null;
            this.tail=null;
        }

    }

    public Compass(){
        points.add('N');
        points.add('E');
        points.add('S');
        points.add('W');
        cardinals = new DoublyLinkedList();
        cardinals.head = new Node('N');
        cardinals.head.next= new Node('E');
        Node cur = cardinals.head.next;
        cur.prev = cardinals.head;
        cur.next = new Node('S');
        cur.next.prev=cur;
        cur = cur.next;
        cur.next = new Node('W');
        cur.next.prev=cur;
        cur = cur.next;
        cur.next = cardinals.head;
        cardinals.head.prev = cur;
        cardinals.tail =  cardinals.head;
        point=cardinals.head;
    }

    public Node getPoint() {
        return point;
    }

    public Set<Character> getPoints(){
        return points;
    }

    public void setPoint(Node point){
        this.point=point;
    }
}
