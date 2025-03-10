package test;
public class SongLyricAuditingSystem {
    private OurLinkedList<SongLyric> songLyrics;
    private StepQueue draftingQueue;
    private StepQueue auditingQueue;
    private StepQueue finalRecordingQueue;
    private SongLyricStack crucialSongLyrics;

    public SongLyricAuditingSystem() {
        songLyrics = new OurLinkedList<>();
        draftingQueue = new StepQueue();
        auditingQueue = new StepQueue();
        finalRecordingQueue = new StepQueue();
        crucialSongLyrics = new SongLyricStack();
    }

    public void addSongLyric(SongLyric songLyric) {
        songLyrics.add(songLyric);
        draftingQueue.enqueue(songLyric);
        System.out.println("Song Lyric ID: " + songLyric.getLyricID() + " moved to Drafting step.");
    }

    public void processNextSongLyricInQueue(String step) {
        if (!crucialSongLyrics.isEmpty()) {
            SongLyric crucial = crucialSongLyrics.pop();
            System.out.println("Processing Crucial Song Lyric ID: " + crucial.getLyricID() + ", Name: " + crucial.getName());
            moveSongLyricToNextStep(crucial);
        } else {
            StepQueue queue = getQueueForStep(step);
            if (!queue.isEmpty()) {
                SongLyric lyric = queue.dequeue();
                System.out.println("Processing Song Lyric ID: " + lyric.getLyricID() + ", Name: " + lyric.getName());
                moveSongLyricToNextStep(lyric);
            }
        }
    }

    public void moveSongLyricToNextStep(SongLyric songLyric) {
        String currentStep = songLyric.getCurrentStep();
        if (currentStep.equals("Drafting")) {
            songLyric.setCurrentStep("Auditing");
            auditingQueue.enqueue(songLyric);
            System.out.println("Song Lyric ID: " + songLyric.getLyricID() + " moved to Auditing step.");
        } else if (currentStep.equals("Auditing")) {
            songLyric.setCurrentStep("Final Recording");
            finalRecordingQueue.enqueue(songLyric);
            System.out.println("Song Lyric ID: " + songLyric.getLyricID() + " moved to Final Recording step.");
        } else if (currentStep.equals("Final Recording")) {
            songLyric.setStatuString("Lyric Finalized");
            System.out.println("Song Lyric ID: " + songLyric.getLyricID() + " finalized.");
        }
    }

    public void moveSongLyricToStack(SongLyric songLyric) {
        crucialSongLyrics.push(songLyric);
        System.out.println("Song Lyric ID: " + songLyric.getLyricID() + " moved to stack.");
    }

    public void showStack() {
        crucialSongLyrics.viewStack();
    }

    public void showQueue(String step) {
        StepQueue queue = getQueueForStep(step);
        queue.viewQueue();
    }
    private StepQueue getQueueForStep(String step) {
        if (step.equals("Drafting")) {
            return draftingQueue;
        } else if (step.equals("Auditing")) {
            return auditingQueue;
        } else if (step.equals("Final Recording")) {
            return finalRecordingQueue;
        }
        throw new IllegalArgumentException("Invalid step: " + step);
    }
}