package DSproject;

import java.io.*;

class FileHandler {

    // SAVE FILE ONLY
    public void save(TaskDLL list) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Doc.txt"));
            Node temp = list.head;

            while (temp != null) {
                // Save as: number,title
                bw.write(temp.data.number + "," + temp.data.title);
                bw.newLine();
                temp = temp.next;
            }

            bw.close();
            System.out.println("Tasks saved to file.");
        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }
}