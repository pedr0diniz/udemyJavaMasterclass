package sec10listarraylistlinkedlistiteratorautoboxing.sec10140linkedlistchallenge.exercise;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return title + ": " + duration;
    }
}