package DSproject;

class TaskService {
    TaskDLL list = new TaskDLL();

    public void addTask(int number, String title) {
        list.add(new Task(number, title));
        System.out.println("Task Added!");
    }
}