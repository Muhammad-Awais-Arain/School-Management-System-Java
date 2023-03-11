

package school_management_system;


public class Add {

    private String gender;
    private String FName;
    private String LName;
    private String Email;
    private String ID; 
    private String FatherName;
    private int age;
    
     public void setGender(String gender){
    this.gender = gender;
    }

    public String getGender(){
    return gender;
    }    
    
    public void setAge(int age){
    this.age = age;
    }
    public int getAge()
    {
        return age;
        
    }   
    public void setFName(String FName){
    this.FName = FName;
    }

    public String getFName(){
    return FName;
    }
     public void setLName(String LName){
    this.LName = LName;
    }

    public String getLName(){
    return LName;
    }
    
    public void setEmail(String Email){
    this.Email = Email;
    }

    public String getEmail(){
    return Email;
    }
    
    public void setID(String ID){
    this.ID = ID;
    }

    public String getID(){
    return ID;
    }
    public void setFatherName(String FatherName){
    this.FatherName = FatherName;
    }

    public String getFatherName(){
    return FatherName;
    }
    
    
    
    public String ParentMethod(){
    return  "\nFirst Name : "+FName +
            "\nLast Name :" +LName+
            "\nFather Name :"+FatherName 
            +"\nEmail: "+Email
            + "\nID  : "+ ID
            + "\nAge : "+age;
    }
}
