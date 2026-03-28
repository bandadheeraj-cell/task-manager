package DSproject;

class Task {
    int number;     // NEW FIELD
    String title;

    public Task(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public String toString() {
        return number + " - " + title;
    }
}
