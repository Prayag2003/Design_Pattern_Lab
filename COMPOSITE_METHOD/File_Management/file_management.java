package COMPOSITE_METHOD.File_Management;
/* File ManageMent */

import java.util.List;
import java.util.ArrayList;

abstract class Folders {

    protected String file_name;

    public Folders(String name) {
        file_name = name;
    }

    public abstract void describe_Folder();

    public abstract int getSize();

}

class File extends Folders {

    protected int file_size;

    public File(String file_name, int file_size) {
        super(file_name);
        this.file_size = file_size;
    }

    // implementation of describe_Folder
    public void describe_Folder() {
        System.out.println(file_name);
    }

    public int getSize() {
        return file_size;
    }
}

class Directory extends Folders {
    List<Folders> folder_list = new ArrayList<Folders>();

    public Directory(String file_name) {
        super(file_name);
    }

    /* add a new Folders */
    public void addComponent(Folders typeComponent) {
        folder_list.add(typeComponent);
    }

    /* remove an existing Folders */
    public void removeComponent(Folders typeComponent) {
        folder_list.remove(typeComponent);
    }

    /* similar to vector<int> */
    public List<Folders> componentList() {
        return folder_list;
    }

    public void describe_Folder() {
        System.out.println(file_name);

        for (Folders c : folder_list) {
            c.describe_Folder();
        }
    }

    public int getSize() {
        int file_size = 0;
        for (Folders c : folder_list) {
            file_size += c.getSize();
        }
        return file_size;
    }

}

public class file_management {
    public static void main(String[] args) {

        Folders l2 = new File("FrontEnd", 2000);
        Folders l3 = new File("GOT", 3000);
        Folders l4 = new File("Codeforces", 4000);
        Folders l5 = new File("Codechef", 5000);
        Folders l6 = new File("BackEnd", 2000);

        Directory c1 = new Directory("Computer");
        Directory c2 = new Directory("Web-D");
        Directory c3 = new Directory("CP");
        Directory c4 = new Directory("Full Stack Web Developer");
        Directory c5 = new Directory("Extra_Files");

        c1.addComponent(c2);
        c1.addComponent(c3);
        c1.addComponent(c4);
        c1.addComponent(c5);

        c4.addComponent(l2);
        c4.addComponent(l6);

        c3.addComponent(l5);

        c5.addComponent(l3);

        l2.describe_Folder();
        l4.describe_Folder();

        System.out.println(c2.getSize());
        System.out.println(c1.getSize());
        System.out.println(c4.getSize());

    }
}
