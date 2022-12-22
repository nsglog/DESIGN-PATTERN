//package prototype;

import prototype.Student;
import prototype.StudentRegistry;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry)   {
        
        Student AprilBatchStudent = new Student();
        Student MayBatchStudent = new Student();
        Student NovBatchStudent = new Student();

        studentRegistry.register("April 21", AprilBatchStudent);
        studentRegistry.register("May 21", MayBatchStudent);
        studentRegistry.register("November 21", NovBatchStudent);
    }
    
    public static void main(String[] args)  {
        
        StudentRegistry studentRegistry = StudentRegistry.getRegistry();
        System.out.println(studentRegistry == null);
        fillRegistry(studentRegistry);

        Student Navneet = studentRegistry.get("November 21").clone();

        Student.print(Navneet);
    }
}
