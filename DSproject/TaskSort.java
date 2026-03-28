package DSproject;

class TaskSort {

    // 🔼 SORT ASCENDING (small → large)
    public void sortByNumberAsc(TaskDLL list) {

        if (list.head == null) {
            System.out.println("List is empty.");
            return;
        }

        boolean swapped;

        do {
            swapped = false;
            Node temp = list.head;

            while (temp.next != null) {

                if (temp.data.number > temp.next.data.number) {

                    // Swap task data
                    Task t = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = t;

                    swapped = true;
                }

                temp = temp.next;
            }

        } while (swapped);

        System.out.println("Tasks sorted in Ascending order (by number).");
    }

    // 🔽 SORT DESCENDING (large → small)
    public void sortByNumberDesc(TaskDLL list) {

        if (list.head == null) {
            System.out.println("List is empty.");
            return;
        }

        boolean swapped;

        do {
            swapped = false;
            Node temp = list.head;

            while (temp.next != null) {

                if (temp.data.number < temp.next.data.number) {

                    // Swap task data
                    Task t = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = t;

                    swapped = true;
                }

                temp = temp.next;
            }

        } while (swapped);

        System.out.println("Tasks sorted in Descending order (by number).");
    }
}