package prototype;

import java.util.Map;
import java.util.HashMap;

public class StudentRegistry {

    private Map<String, Student> map;
    private static StudentRegistry studentRegistry = null;

    private StudentRegistry()   {
        
        map = new HashMap<>();
    }

    public static StudentRegistry getRegistry() {
            
        if(studentRegistry == null) {
            
            studentRegistry = new StudentRegistry();
        }

        return studentRegistry;
    }
    
    public void register(String key, Student student) {
        
        map.put(key, student);
    }

    public Student get(String key) {
        return map.get(key);
    }

}
