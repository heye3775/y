import java.util.ArrayList;
import java.util.List;

abstract class FileSystemItem {
    String name;

    FileSystemItem(String name) {
        this.name = name;
    }
    abstract void printStructure(String indent);
}
class File extends FileSystemItem {
    File(String name) {
        super(name);
    }

    @Override
    void printStructure(String indent) {
        System.out.println(indent + "- " + name);
    }
}
class Directory extends FileSystemItem {
    List<FileSystemItem> items = new ArrayList<>();
    Directory(String name) {
        super(name);
    }

    void addItem(FileSystemItem item) {
        items.add(item);
    }
    @Override
    void printStructure(String indent) {
        System.out.println(indent + "+ " + name);
        for (FileSystemItem item : items) {
            item.printStructure(indent + "  ");
        }
    }
}
public class FileSystemDemo {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        root.addItem(new File("file1.txt"));
        root.addItem(new File("file2.txt"));

        Directory subDir1 = new Directory("docs");
        subDir1.addItem(new File("doc1.pdf"));
        subDir1.addItem(new File("doc2.pdf"));

        Directory subDir2 = new Directory("images");
        subDir2.addItem(new File("img1.png"));

        subDir1.addItem(subDir2);
        root.addItem(subDir1);

        root.printStructure("");
    }
}
