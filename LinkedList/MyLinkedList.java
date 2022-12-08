package LinkedList;

public class MyLinkedList {
    Node head;
    Node tail;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addToEnd(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
            tail = toAdd;
            return;
        }

        tail.next = toAdd;
        tail = toAdd;

    }

    public void addToStart(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
            tail = toAdd;
            return;
        }
        toAdd.next = head;
        head = toAdd;
    }

    public void addToMiddle(int data) {
        Node toAdd = new Node(data);
        if (head == null) {
            head = toAdd;
            tail = toAdd;
            return;
        }

        if (head == tail) {
            addToStart(data);
            return;
        }

        Node hare = head;
        Node tortoise = head;
        Node prev = tortoise;
        while (hare != null && hare.next != null) {
            prev = tortoise;
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        prev.next = toAdd;
        toAdd.next = tortoise;

    }

    public int recursiveSearch(int target, Node temp) {
        if (temp == null)
            return -1;
        if (temp.data == target)
            return 0;
        int sub_list = recursiveSearch(target, temp.next);
        if (sub_list == -1)
            return -1;
        else
            return sub_list + 1;
    }

    public int removeFirst() {
        if (head == null)
            return -1;
        Node temp = head;
        head = head.next;
        return temp.data;
    }

    public int removeLast() {
        if (head == null)
            return -1;
        Node temp = head;
        int data = tail.data;
        while (temp.next != tail)
            temp = temp.next;
        tail = temp;
        tail.next = null;
        return data;
    }

    public void reverseLinkedList() {
        if (head == null)
            return;
        Node temp = tail = head;
        Node prev = null;
        while (temp != null) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }

    public void reverseLinkedListRecursively() {
        head = reverseUtil(head);
    }

    public Node reverseUtil(Node head) {

        if (head == null || head.next == null)
            return head;

        Node newHead = reverseUtil(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public boolean isPalindrome() {
        // Finding the mid of the Linked List

        Node hare = head, tortoise = head;
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        Node mid = tortoise;
        Node temp = tortoise.next;

        while (temp != null) {
            Node next = temp.next;
            temp.next = tortoise;
            tortoise = temp;
            temp = next;
        }

        Node temp2 = tortoise;
        temp = head;

        while (temp != mid) {
            if (temp.data != temp2.data)
                return false;
            temp = temp.next;
            temp2 = temp2.next;
        }

        // Changing the Linkedlist back to normal

        temp = mid.next;
        temp2 = mid;
        while (temp != null) {
            Node next = temp.next;
            temp.next = temp2;
            temp2 = temp;
            temp = next;
        }

        return true;

    }

    public int size() {
        if (head == null)
            return 0;
        Node hare = head;
        Node tortoise = head;
        int size = 1;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
            size++;
        }
        size *= 2;
        if (hare != null)
            size -= 1;
        return size;

    }

    public void removeFromEnd(int n) {
        if (head == null)
            return;
        if (n > size())
            return;
        Node temp = head;
        if (n == 1) {
            while (temp.next != tail)
                temp = temp.next;
            temp.next = null;
            return;
        }
        int size = size();
        if (n == size) {
            head = head.next;
            return;
        }

        int counter = size - n + 1;
        Node prev = null;
        Node next = null;
        while (counter > 1) {
            prev = temp;
            temp = temp.next;
            next = temp.next;
            counter--;
        }
        prev.next = next;
    }

    public void printList() {
        if (head == null) {
            System.out.println("No items in the list!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.addToEnd(1);
        ll.addToEnd(2);
        ll.addToEnd(3);
        ll.addToEnd(4);
        ll.addToEnd(5);
        ll.printList();
        System.out.println("Reversing the Linked list recursively...");
        ll.reverseLinkedListRecursively();
        ll.printList();

    }
}