

public class LL {
    Node head;

    private int size;

    LL(){
        this.size = 0;
    }
    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
          size++;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty:");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty:");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty:");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node last = head.next;
        while(last.next!=null){
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getSize(){
        return size;
    }

    public void reverseiterative(){
        if(head == null || head.next== null){
            return ;
        }
        Node preNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = preNode;

            preNode = currNode;
            currNode=nextNode;
        }
        head.next = null;
        head = preNode;

    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next=null;

        return  newHead;
    }

    public static void main(String[] args) {
        LL list = new LL();
//        list.addFirst("a");
//        list.addFirst("is");
//
//        list.printList();
//        System.out.println();
//        System.out.println("Adding to linklist:");
//
//
//        list.addLast("list");
//        list.printList();
//
//        System.out.println();
//        list.addFirst("This");
//        list.printList();
//
//
//        System.out.println();
//        System.out.println("Deleting from linklist:");
//        list.deleteFirst();
//        list.printList();
//
//        System.out.println();
//        list.deleteLast();
//        list.printList();

//        System.out.println();
//        list.deleteLast();
//        list.printList();
//
//        System.out.println();
//        list.deleteLast();
//        list.printList();
//        System.out.println();
//        System.out.println("size of linkList is now "+list.getSize());


       list.addLast(1);
       list.addLast(2);
       list.addLast(3);
       list.addLast(4);


        list.printList();
//
        System.out.println();
//        list.reverseiterative();
//        list.printList();

        list.head=list.reverseRecursive(list.head);
        list.printList();
    }

}