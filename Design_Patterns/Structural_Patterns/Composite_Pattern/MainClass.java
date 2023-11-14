package Design_Patterns.Structural_Patterns.Composite_Pattern;

public class MainClass {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Folder folder1 = new Folder("folder1");
        folder1.setChild(file1);
        folder1.setChild(file2);

        File file3 = new File("file3.txt");
        Folder folder2 = new Folder("folder2");
        folder2.setChild(file3);
        folder2.setChild(folder1);

        folder2.print();

        //folder2
        //   file3
        //   folder1
        //      file1
        //      file2
    }
}
