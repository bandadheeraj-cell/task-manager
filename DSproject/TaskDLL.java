package DSproject;

class TaskDLL {
    Node head, tail;

    public void add(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
}