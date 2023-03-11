
package school_management_system;


public class Student1 extends Add {
    private String Sclass;
    
    
    public void setSclass(String Sclass){
    this.Sclass = Sclass;
    }
    public String getSclass(){
    return Sclass;
    }
  
    @Override
  public String ParentMethod(){
    return super.ParentMethod()+"\nClass : "+Sclass;
    }
    
}
