/**
 * Stack Implementation 
 * @param <T> Type of Objects the Stack is meant to hold
 */
public class Stack<T> implements StackADT {
    private T[] stackList;
    private int size;

    public Stack() {
        stackList = (T[]) new Object[100];
        size = 0;
    }

    @Override
    public void push(Object element) {
        stackList[size] = (T) element;
        size++;
    }

    @Override
    public Object pop() {
        T objectToReturn = stackList[size];
        stackList[size] = null;
        size--;
        return objectToReturn;
    }

    @Override
    public Object peek() {
        return stackList[size];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
