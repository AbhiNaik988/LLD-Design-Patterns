package Design_Patterns.Structural_Patterns.Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileFolderComponent{
    private String name;
    private List<FileFolderComponent> children;
    public Folder(String name){
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void setChild(FileFolderComponent child){
        this.children.add(child);
    }

    public List<FileFolderComponent> getChildren(){
        return this.children;
    }

    @Override
    public void print() {
        System.out.println("This is a folder named "+this.name);
        for(FileFolderComponent comp : this.children){
            comp.print();
        }
    }
}
