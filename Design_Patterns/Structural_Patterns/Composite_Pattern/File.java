package Design_Patterns.Structural_Patterns.Composite_Pattern;

public class File implements FileFolderComponent{
    private String name;
    public File(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("This is a file named : "+this.name);
    }
}
