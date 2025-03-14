package test;

public class StepQueue {
    private OurQueue<SongLyric> queue;

    public StepQueue() {
        queue = new OurQueue<>();
    }

    public void enqueue(SongLyric songLyric) {
        queue.enqueue(songLyric);
    }

    public SongLyric dequeue() {
        return queue.dequeue();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void viewQueue() {
        System.out.println("Queue content:");
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i).getName());
        }
    }
}
