//                                          CREATING A PROTOTYPE OR CLONE OF A GIVEN OBJECT WITH SIMILAR ATTRIBUTES

/* Also analogue with Registry Design Pattern */
/* Prototype Pattern is used when you have to create a copy of a given object i.e. creating a new object with exact same attributes as given object */

// Having the logic to create the copy_object from original within the client is prone to error. It is better to outsource the work of creating copy_object to the 
// original_object itself which benefits the ocp principle and prevents the tight coupling between client class and object class.

package prototype;

public class Student implements ProtoType {
    
    int age;
    String name;
    String batch;
    double averageBatchPSP;
    double studentPSP;

    public Student() {}

    public Student(Student student) {
        
        this.batch = student.batch;
    }

    @Override
    public Student clone()  {
        
        return new Student(this);
    }

    public static void print(Student student)   {
        
        System.out.println(student.age+" "+student.name+" "+student.batch+" "+student.averageBatchPSP+" "+student.studentPSP);
    }


}
