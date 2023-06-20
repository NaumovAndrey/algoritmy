package seninar3;

public class doublyLinkedList {
    static Node head;
    static Node tail;

    public static void print() {
        Node cur = head;
        while (cur != null) {
            System.out.printf("%d", cur.value);
            cur = cur.next;
        }
        System.out.println();
    }

    public static boolean contains(int value){
        Node cur = head;
        while (cur != null){
            if (cur.value == value){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public static void pushBack(int value) {
        Node node = new Node();
        node.value = value;

        if (tail == null){
            head = node;
        } else {
            node.prev = tail;
            tail.next = node;
        }
        tail = node;

    }

    public static void popBack() {
        if (head != null) {
            if (tail.prev == null){
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public static class Node {
        int value;
        Node next;
        Node prev; //предыдущий
    }

    public static void pushFront(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null){
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }
        head = node;
    }

    public static void popFront() {
        if (head != null) {
            if (head.next == null){
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
        }
    }

    public static void revers(){
        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        for (int i = 1; i <= 5; i++){
            list.pushFront(i);
        }
        list.print();

        list.popFront();
        list.popFront();

        list.print();

        list.pushBack(7);
        list.print();

        list.popBack();
        list.print();

        list.revers();
        list.print();

    }

}
