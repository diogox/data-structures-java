/**
 * Implementation of a Linked List.
 * @author  Diogo Xavier
 * @param <T>  Type of Object to be held in the Linked List.
 */
public class LinkedList <T> {
    private LinkedListNode firstNode;
    private int listSize;

    public LinkedList() {
        firstNode = null;
        listSize = 0;
    }

    /**
     * Adds an element to the linked list.
     * @param object  Object to be added to the Linked List.
     */
    public void add(T object) {
        LinkedListNode<T> newNode = new LinkedListNode<>(object, firstNode);
        firstNode = newNode;
        listSize++;
    }

    /**
     * Removes the last element of the Linked List to be inserted.
     */
    public void remove() {
        remove(1);
    }


    /**
     * Removes an object on the lInked List based on the index specified.
     * @param indexToRemove  index of the node to be removed.
     */
    public void remove(int indexToRemove) {
        if (indexToRemove > listSize) {
            throw new Error("No Node to remove from the LinkedList");
        }

        LinkedListNode previousNode = null;
        LinkedListNode nextNode = firstNode;

        for(int i = 0; i <= indexToRemove; i++) {
            if ((indexToRemove - 1) == i) {
                previousNode = nextNode;
            }
            nextNode = nextNode.getNext();
        }

        if (previousNode == null) {
            firstNode = nextNode;
        } else {
            previousNode.setNext(nextNode);
        }

        listSize--;
    }

    // Testing purposes
    public void print() {
        LinkedListNode aux;
        aux = firstNode;
        while (aux != null) {
            System.out.println(aux.getObject());
            aux = aux.getNext();
        }
    }
}