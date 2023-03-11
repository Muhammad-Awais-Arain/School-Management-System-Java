
package school_management_system;


public class Teacher1 extends Add{
      
   private String Wsubject;
    
    public void setWsubject(String Wsubject){
    this.Wsubject = Wsubject;
    }
    public String getWsubject(){
    return Wsubject;
    }
    
    @Override
  public String ParentMethod(){
    return super.ParentMethod()+"\nSubject : "+Wsubject;
    }
    
    
    
    
}
