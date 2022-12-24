/* Builder DP is used when there are lot of attributes in a class and we need to validate the value of each attribute before creating an object with same values */
/* Class is immutable so all parameter must be passed while creation of object, therefore the limiting the scope of error while creation only */

class Student {
    
    int roll_no;
    String name;
    double gpa;
    String college;
    String Branch;
    String contact;
    String e_mail;

    public Student(BuilderPattern builder) {

        /*All sort of parameter checking has to be done here only and that is before assigning values from BuilderPattern object to the obejct of the class Student */

        this.roll_no = builder.roll;
        this.name = builder.name;
        this.gpa = builder.gpa;
        this.college = builder.college;
        this.Branch = builder.Branch;
        this.contact = builder.contact;
        this.e_mail = builder.e_mail;
    }
}

class BuilderPattern {
    
    int roll;
    String name;
    double gpa;
    String college;
    String Branch;
    String contact;
    String e_mail;

    public void setRollNo(int roll)    {
        this.roll = roll;
    }

    public void setName(String name)   {
        this.name = name;
    }

    public void setGPA(double gpa)  {
        this.gpa = gpa;
    }

    public void setCollege(String college)  {
        this.college = college;
    }

    public void setBranch(String branch)    {
        this.Branch = branch;
    }

    public void setContact(String contact)  {
        this.contact = contact;
    }

    public void setEmail(String email)  {
        this.e_mail = email;
    }

}

class Builder {
    
    public static void main(String[] args)  {
        
        BuilderPattern bp = new BuilderPattern();
        bp.setRollNo(21);
        bp.setName("Navneet");
        bp.setGPA(9.5);
        bp.setCollege("Engineering College of Bikaner");
        bp.setBranch("CSE");
        bp.setContact("+91-9588033346");
        bp.setEmail("unzip.nav@gmail.com");

        Student s = new Student(bp);
    }
}
