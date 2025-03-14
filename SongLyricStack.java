package test;

public class SongLyricStack {
    private OurLinkedList<SongLyric> stack;

    public SongLyricStack() {
        stack = new OurLinkedList<>();
    }

    public void push(SongLyric songLyric) {
        stack.add(songLyric);
    }

    public SongLyric pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        SongLyric item = stack.get((int)stack.size() - 1);
        stack.remove((int)stack.size() - 1);
        return item;
    }

    public SongLyric peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get((int)stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

	public void viewStack() {
		// TODO Auto-generated method stub
		
	}

}
