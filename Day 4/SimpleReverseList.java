public class SimpleReverseList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node head = first;
        first.next = second;
        second.next = third;

        System.out.print("Original: ");
        printChain(head);
        Node prev = null;
        Node current = head;
        Node tempNext = null;

        while (current != null) {
            tempNext = current.next; 
            current.next = prev;     
            prev = current;          
            current = tempNext;      
        }
        head = prev; 

        System.out.print("Reversed: ");
        printChain(head);
    }

    private static void printChain(Node node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
