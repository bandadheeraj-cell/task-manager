package DSproject;

public class Main {

    public static void main(String[] args) {

    		TaskSort sort = new TaskSort();
        TaskService service = new TaskService();
        TaskDisplay display = new TaskDisplay();
        TaskDelete delete = new TaskDelete();
        TaskSearch search = new TaskSearch();
        FileHandler file = new FileHandler();
        Menu menu = new Menu();

        while (true) {

            int choice = menu.showMenu();

            switch (choice) {

            case 1:
                System.out.print("Enter task number: ");
                int num = Integer.parseInt(menu.getInput());

                System.out.print("Enter task title: ");
                String task = menu.getInput();

                service.addTask(num, task);
                break;

                case 2:
                    display.show(service.list);
                    break;

                case 3:
                    System.out.print("Enter task to delete: ");
                    delete.delete(service.list, menu.getInput());
                    break;

                case 4:
                    System.out.print("Enter task to search: ");
                    search.search(service.list, menu.getInput());
                    break;

                case 5:
                    file.save(service.list);
                    break;

                case 6:
                    sort.sortByNumberAsc(service.list);
                    break;

                case 7:
                    sort.sortByNumberDesc(service.list);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}