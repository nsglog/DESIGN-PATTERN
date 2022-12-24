class SingletonClass {

    private static SingletonClass instance = null;
    
    private SingletonClass() {}

    public static SingletonClass getInstance() {
        
        if(instance == null)    {
            
            synchronized(SingletonClass.class)  {
                
                if(instance == null)    {
                    
                    instance = new SingletonClass();
                }
            }
        }

        return instance;
    }   
}

public class Singleton {
    
    public static void main(String[] args)  {
        
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();

        System.out.println(s1.equals(s2));
    }
}
