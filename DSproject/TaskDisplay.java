package DSproject;

class TaskDisplay {

    public void show(TaskDLL list) {
        Node temp = list.head;
        int i = 1;

        if (temp == null) {
            System.out.println("No tasks.");
            return;
        }

        while (temp != null) {
            System.out.println(i + ". " + temp.data);
            temp = temp.next;
            i++;
        }
    }
}