
public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getHead() {
        System.out.println("Head: " + head.value);
    }
    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }
    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value); //created a new value(1,2,3,4,etc.)

        if (length == 0){
            head = newNode;//Assigning new node the head node
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public Node removeLast() {

        if (length == 0) return null; //nothing in linked list delete all
        //creating start point for temp and pre
        Node temp = head;
        Node pre = head;

        //making while loop so temp and pre can iterate through linked list
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        //making tail the new last item
        tail = pre;
        //removing old item
        tail.next = null;
        //reducing length as removed one item
        length--;
        //removing head and tail if no more nodes in linked list after --
        if (length == 0){
            head = null;
            tail = null;
        }
        //removing temp as it is hanging over removed node
        return temp;
    }
}
