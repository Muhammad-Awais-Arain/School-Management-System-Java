
package school_management_system;
import java.util.List;

public class School {
    
     private List<Teacher> teachers;
    private List<Student> students;
    private static int Total_money_earned;
    private static int Total_money_spent ;
    
    School (List<Teacher> teachers, List<Student> students)
    {
        this.teachers = teachers;
        this.students = students;
        Total_money_earned=0;
        Total_money_spent=0 ;
    }
    // return a list of teachers to the school//
    public List<Teacher> getTeacher()
    {
        return teachers;
    }
    // adding the teacher to the school
    public void setTeachers (Teacher teacher)
    {
        teachers.add(teacher);
    }
    public List<Student> getStudent()
    {
        return students;
    }
    // adding the teacher to the school
    public void setStudent (Student student)
    {
        students.add(student);
    }
    
     public int  Total_money_earned()
    {
        return Total_money_earned;
    }
    public static void setTotal_money_earned (int totalmoneyearned)
    {
        Total_money_earned+=totalmoneyearned;
        
    }
    public int Total_money_spent()
    {
        return Total_money_spent;
    }
    public static void setTotal_money_spent (int totalmoneyspent)
    {
       Total_money_spent-=totalmoneyspent;
    }
}
    
    
    
    
