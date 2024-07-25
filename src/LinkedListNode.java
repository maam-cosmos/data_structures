/**
 * Simple Linked List node with implementaion. 
 */
public class LinkedListNode {

    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public void printLinkedList(LinkedListNode head) {

        System.out.print("The linked list is: ");
        // If head does not indicate the very last node (which is null node),
        // then print the data. 
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("\n");
    }

    public void insertAtTheEnd(LinkedListNode head, int data) {

        LinkedListNode newNode = new LinkedListNode(data);
        
        // The value of head node might change below. 
        // So we need to save the original value of head so that 
        // we can pass the actual head to the printLinkedList () function.
        LinkedListNode head_ref = head;

        // Find the last node and add the new node after the last node.
        while (head.next != null){
            head = head.next;
        }

        // Append the new node to the end and assign the newNode.next = null. 
        head.next = newNode;
        newNode.next = null;

        System.out.println("After adding the new node " + data + ",");

        // Print the new Linked List after adding the new node. 
        printLinkedList(head_ref); 

    }

    public void reverseLinkedList (LinkedListNode head){

        // Write code below to check whether the list is empty or 
        // has only one node. Because in that case, nothing to reverse. 
                
        LinkedListNode prevNode = null;
        LinkedListNode nextNode = null;

        nextNode = head.next;
        
        // Checking nextNode because we can use head here as then head will be null and
        // will not point to the head of the list anymore. Also, null node will be 
        // connected to the head node. For example, if head was used to check the 
        // condition instead of another reference like the nextNode, then the list 
        // would become like null<-1<-2<-3<-4<-5<-6<-null. In order to remove the pointer
        // to the null node after the last node 6, another reference node is use which 
        // is nextNode. 
        while (nextNode != null){
            head.next = prevNode;
            prevNode = head;       // 1 2 3 4
            head = nextNode;       // 2 3 4 5
            nextNode = head.next;  // 3 4 5 6
            head.next = prevNode;
        }
        
        System.out.println("After reversing the linked list, ");

        // Print the new Linked List after reversal. 
        printLinkedList(head);
        
    }

}
