package Design_Patterns.Structural_Patterns.FlyWeight_Pattern;

import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        CharacterFlyweightFactory factory = new CharacterFlyweightFactory();
        TextEditor editor = new TextEditor(factory);
    }
}
