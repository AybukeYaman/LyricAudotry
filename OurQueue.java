package test;

public class OurQueue<T> {
    private OurLinkedList<T> list;

    public OurQueue() {
        list = new OurLinkedList<>();
    }

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = list.get(0);
        list.remove(0);
        return item;
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
