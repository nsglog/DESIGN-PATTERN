//package prototype;

import prototype.Student;
import prototype.StudentRegistry;
import prototype.IntelligentStudent;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry)   {
        
        Student NovBatchStudent = new Student();
        studentRegistry.register("November 21", NovBatchStudent);

        IntelligentStudent NovBatchIntelligentStudent = new IntelligentStudent();
        studentRegistry.register("November 21 Intelligent", NovBatchIntelligentStudent);
    }
    
    public static void main(String[] args)  {
        
        StudentRegistry studentRegistry = StudentRegistry.getRegistry();
        fillRegistry(studentRegistry);

        Student Navneet = studentRegistry.get("November 21").clone();
        Student intelligentNavneet = studentRegistry.get("November 21 Intelligent").clone();
    }
}
