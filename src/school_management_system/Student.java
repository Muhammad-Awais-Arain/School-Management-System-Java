

package school_management_system;


public class Student {
    private int id;
    private double attendance;
    private String name;
    private String grade;
    private String fathername;
    private int feespaid;
    private int feestotal;
  
    
   
// It will creat the new student object by initializing the value //
    
     Student(int id, String name, String grade, String fathername, double attendance){
        this.feespaid=0;
        this.feestotal=5000;
        this.attendance=attendance;
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.fathername=fathername;
       
    }
   
   // updating the student grade//
   
    public void setGrade( String grade)
    { 
        this.grade=grade;
    }
    
    // updating the fees paid//
    
    public void updatepayfees(int fees)
    {
        // feespaid=0 as we define it before//
        
        feespaid+=fees;
        School.setTotal_money_earned(feespaid);
         System.out.println ("Fees "+name+ " paid is = "+ fees);
    if ( fees == 5000)
    {
        System.out.println("Fees paid ");
    }
    else
    {
        System.out.println (" Fee defaulter ");
    }
    }
    // return id of the student//
    public int getId()
    {
        return id;
    }
    // return the name of the student//
     public String getName()
    {
        return name;
    }
      public String getFatherName()
    {
        return fathername;
    }
       public double getAttendance()
    {
        return  attendance;
    }
     //return the grade of the student//
    public String getGrade()
    {
        return grade;
    }
    // return the feespaid by the student//
     public int getFeesPaid()
    {
        return feespaid;
    }
     // return the total fees of the student //
      public int getFeesTotal()
    {
        return feestotal;
    }
      public int getRemaingfees()
      {
          return feestotal-feespaid;
      }
//@Override
      public String toString(){
        return "Student name '"+ name + 
                "' \n" +name+"'s father name is Mr."+fathername+
                " \n" +name+ "'s id is '"+id+
                "'\n" +name+"'s class is '"+grade+"'";//
              
}
       
 }
    
    
    
    
    

