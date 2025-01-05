public class Main {
    public static void main (String[] args){

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);

        //removes last when there is 2
        System.out.println(myLinkedList.removeLast().value);
        //removes last when tther is 1
        System.out.println(myLinkedList.removeLast().value);
        //removes last when there is 0
        System.out.println(myLinkedList.removeLast());

    }
}
