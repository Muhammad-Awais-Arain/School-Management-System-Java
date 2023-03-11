
package school_management_system;


public class Teacher {
    private int id;
    private String name;
     private int salary ;
     private int salaryearned=0;
      private double attendance;
      private String subject;
    // It will creat the new Teacher object by initializing the value //
     Teacher (int id, String name, int salary, double attendance, String subject){ 
        this.id = id;
        this.name = name;
        this.salary=salary;
         this.attendance= attendance;
         this.subject=subject;
       
    }
    // It will return the id of the teacher//
    public int getId()
   {
        return id;
    }
    // It will return the name of the teacher//
    public String getName()
    {
        return name;
    }
    // It will return the salary of the teacher//    
    
      public int getSalary()
    
      {  return salary;
    }
        public double getAttendance()
    {
        return  attendance;
    }
        public String getSubject()
    {
        return  subject;
    }
      // Updating the Salary //
     public void setSalary( int salary)
      {
          this.salary=salary;
      }
     public void receiveSalary( int salary)
     {
         salaryearned+=salary;
          School.setTotal_money_earned(salaryearned);
          
     }
    @Override
    public String toString(){
        return  " Teacher name is " + name + 
             " Teacher id is " + id  ; 
                
 }
 }
    
    
    
    
    

