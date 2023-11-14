package Design_Patterns.Structural_Patterns.FlyWeight_Pattern;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterFlyweightFactory {
    private static Map<Character,CharacterFlyweight> characterFlyweightMap = new HashMap<>();

    public static CharacterFlyweight getCharacterFlyweight(char character,Font font){
        CharacterFlyweight charFlyweight = characterFlyweightMap.get(character);
        if(charFlyweight == null){
            charFlyweight = new CharacterFlyweight(font,character);
            characterFlyweightMap.put(character,charFlyweight);
        }
        return charFlyweight;
    }
}
