package Design_Patterns.Structural_Patterns.FlyWeight_Pattern;

import java.awt.*;

public class TextEditor {
    private CharacterFlyweightFactory characterFlyweightFactory;

    public TextEditor(CharacterFlyweightFactory characterFlyweightFactory){
        this.characterFlyweightFactory = characterFlyweightFactory;
    }

    public void drawText(String text, Graphics g,int x,int y){
        for(char c : text.toCharArray()){
            Font f = new Font("Arial",Font.PLAIN,12);
            CharacterFlyweight characterFlyweight = CharacterFlyweightFactory.getCharacterFlyweight(c,f);
            characterFlyweight.draw(g,x,y);
        }
    }
}
