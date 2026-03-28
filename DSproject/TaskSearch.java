package DSproject;

class TaskSearch {

    public void search(TaskDLL list, String key) {
        Node temp = list.head;
        int pos = 1;

        while (temp != null) {
            if (temp.data.title.equals(key)) {
                System.out.println("Found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }

        System.out.println("Task not found.");
    }
}