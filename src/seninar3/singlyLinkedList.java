package seninar3;
// seminar 3


public class singlyLinkedList {
    static Node head;

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

    public static boolean pushBack(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null){
            head = node;
        }else {
            Node cur = head;
            while (cur.next != null){
                   cur = cur.next;
            }
            cur.next = node;
        }
        return false;
    }

    public static void popBack() {
        if (head != null) {
            if (head.next == null){
                head = null;
            }else {
                Node cur = head;
                while (cur.next.next != null){
                    cur = cur.next;
                }
                cur.next = null;
            }
        }
    }

    public static class Node {
        int value;
        Node next;
    }

    public static void pushFront(int value) {
        Node node = new Node();
        node.value = value;

        node.next = head;
        head = node;
    }

    public static void popFront() {
        if (head != null) {
            head = head.next;
        }
    }

    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
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


    }
}