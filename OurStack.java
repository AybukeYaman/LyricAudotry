package test;

public class OurStack<T> {
    private OurLinkedList<T> list;

    public OurStack() {
        list = new OurLinkedList<>();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
    
    
    public int size() {
        return list.size();
    }
    
    public T get(int index) {
        return list.get(index);
    }
}
