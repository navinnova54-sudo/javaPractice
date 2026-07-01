public class SimpleListCycle {
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; 

        Node slow = first;
        Node fast = first;
        boolean loopDetected = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;        
            fast = fast.next.next;   

            if (slow == fast) {
                loopDetected = true; 
                break;
            }
        }

        System.out.println("Is there a cycle in the list? " + loopDetected);
    }
}
