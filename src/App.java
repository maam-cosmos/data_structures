public class App {
    public static void main(String[] args) throws Exception {

        LinkedListNode head = new LinkedListNode(1);        

        head.insertAtTheEnd(head, 2);
        head.insertAtTheEnd(head, 3);
        head.insertAtTheEnd(head, 4);
        head.insertAtTheEnd(head, 5);
        head.insertAtTheEnd(head, 6);

        //head.reverseLinkedList(head);
    }
}
