package DSproject;

class TaskDelete {

    public void delete(TaskDLL list, String key) {
        Node temp = list.head;

        while (temp != null) {
            if (temp.data.title.equals(key)) {

                if (temp == list.head) {
                    list.head = temp.next;
                    if (list.head != null)
                        list.head.prev = null;
                } else if (temp == list.tail) {
                    list.tail = temp.prev;
                    list.tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Task deleted!");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Task not found.");
    }
}