public class MergeSortedLists {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(5);
        a1.next = a2;
        a2.next = a3;

        Node b1 = new Node(2);
        Node b2 = new Node(4);
        Node b3 = new Node(6);
        b1.next = b2;
        b2.next = b3;

        Node dummy = new Node(0);
        Node tail = dummy;

        Node p1 = a1;
        Node p2 = b1;

        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                tail.next = p1;
                p1 = p1.next;
            } else {
                tail.next = p2;
                p2 = p2.next;
            }
            tail = tail.next;
        }

        if (p1 != null) {
            tail.next = p1;
        } else {
            tail.next = p2;
        }

        Node mergedHead = dummy.next;

        Node temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
