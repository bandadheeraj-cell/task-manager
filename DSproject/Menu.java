package DSproject;

import java.util.Scanner;

class Menu {

    Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\n--- TASK MANAGER ---");
        System.out.println("1. Add Task");
        System.out.println("2. Display Tasks");
        System.out.println("3. Delete Task");
        System.out.println("4. Search Task");
        System.out.println("5. Save Tasks");
        System.out.println("6. Sort by Number (Ascending)");
        System.out.println("7. Sort by Number (Descending)");
        System.out.println("8. Exit");

        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    public String getInput() {
        sc.nextLine();
        return sc.nextLine();
    }
}