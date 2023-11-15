package Design_Patterns.Behavioural_Patterns.Interpreter_Pattern;

import java.util.HashMap;
import java.util.Map;

public class CContext {
    private static Map<String,Integer> contextValues;

    public CContext(){
        contextValues = new HashMap<>();
    }

    public void setValue(String key,int value){
        contextValues.put(key,value);
    }

    public int getValue(String key){
        return contextValues.get(key);
    }
}
