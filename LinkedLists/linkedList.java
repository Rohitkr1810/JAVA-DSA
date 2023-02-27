package LinkedLists;

public class linkedList {
    private Node head;
    private Node tail;
    int size;
    linkedList(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;

    }
    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value =value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
            
        }
    }
}
