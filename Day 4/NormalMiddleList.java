public class NormalMiddleList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        Node head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int middleIndex = length / 2;
        Node current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        System.out.println("The middle node data is: " + current.data);
    }
}
