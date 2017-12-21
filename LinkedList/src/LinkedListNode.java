/**
 * Helper Class to be used in the Linked List implementation.
 * @author Diogo Xavier
 * @param <T>  Type of Object to be held in the Linked List.
 */
public class LinkedListNode <T> {
    private T object;
    private LinkedListNode next;

    /**
     * @param object  Object of type <T> to be held by the node.
     */
    public LinkedListNode(T object) {
        this.object = object;
    }

    /**
     * @param object  Object of type <T> to be held by the node.
     * @param nextNode  Next node in the succession of the Linked List.
     */
    public LinkedListNode(T object, LinkedListNode nextNode) {
        this.object = object;
        this.next = nextNode;
    }

    /**
     * @return  Object held by the node.
     */
    public T getObject() {
        return object;
    }

    /**
     * @param object  Object of type <T> to be held by the node.
     */
    public void setObject(T object) {
        this.object = object;
    }

    /**
     * @return  Next Node in the Linked List.
     */
    public LinkedListNode getNext() {
        return next;
    }

    /**
     * @param next  Next Node in the Linked List.
     */
    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}