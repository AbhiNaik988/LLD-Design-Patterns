package Design_Patterns.Structural_Patterns.FlyWeight_Pattern;

import java.awt.*;

public class CharacterFlyweight {
    private Font font;
    private char character;

    public CharacterFlyweight(Font font,char character){
        this.font = font;
        this.character = character;
    }

    public void draw(Graphics g,int x,int y){
        g.setFont(this.font);
        g.drawString(String.valueOf(character),x,y);
    }
}
