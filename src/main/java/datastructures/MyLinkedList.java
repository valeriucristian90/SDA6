package datastructures;

public class MyLinkedList {

    Node head;
    Node last;

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public void insertHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        this.head = newNode;
    }

    public void insertLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;

//        for (lastNode = head;lastNode.next != null ; lastNode = lastNode.next) {}
//
//        lastNode.next = newNode;
    }

    public void insertAfter(Node after, int data) {

        if (listContains(after)) {
            Node newNode = new Node(data);
            newNode.next = after.next;
            after.next = newNode;

        } else {
            System.out.println("Node " + after.data + " does not exist");
        }


//        Node current = head;
//
//        while (current != null && current.data != after.data){
//            current = current.next;
//        }
//
//        if(current == null){
//            System.out.println("Node not in list");
//            return;
//        }
//        Node rightNode = current.next;
//        Node nodeToAdd = new Node(data);
//        current.next = nodeToAdd;
//        nodeToAdd.next = rightNode;

    }

    public boolean listContains(Node n) {
        boolean contains = false;
        Node current = head;

        while (current != null && current.data != n.data) {
            current = current.next;

        }

        if (current != null) {
            contains = true;
        }

        return contains;
    }
}


