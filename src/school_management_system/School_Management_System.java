package school_management_system;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class School_Management_System {

   
    public static void main(String[] args) throws IOException {
        
       int b;
       String a;
      String choice;
       char c;
       int sbd;
       int sfd;
       int sa;
       int tb;
       int tr;
       int ts;
       int ta;
       char ch;
       int n;
        
         
        System.out.println (" Enter Your id :");
        Scanner input = new Scanner (System.in);
         a = input.nextLine();
        String admin = "admin";
        
         
        
        if( a.equals(admin))
{
 System.out.println ("Enter your password");
 b = input.nextInt();
 if (b==1234)
 {
     do{
System.out.println ("*************************************************************************************************************");
System.out.println ("*\t If you want to check the students data press '1': " );        
System.out.println ("*\t If you want to check that the student is a fee defaulter or not press '2' ");
System.out.println ("*\t If you want to check the students attendance press '3': ");      
System.out.println ("*\t If you want to check the teachers bio data press '4': ");
System.out.println ("*\t If you want to check how much salary the teachers have recieved press '5': "); 
System.out.println ("*\t If you want to check the teachers attendance press '6': "); 
System.out.println ("*\t If you want to check the which subject teacher teaches press '7': "); 
System.out.println ("*\t If you want to check the fee defaulter and total money earned  by the school press '8': "); 
System.out.println ("*\t If you want to check the total money spent by the school press '9': ");
System.out.println ("*\t Press'10' for admission: ");
System.out.println ("*****************************************************************************************************************");



       Teacher t1 = new Teacher( 1 ,"Rafay",3000,100,"Math");
       Teacher t2 = new Teacher( 12 ,"Sajjad",5000,100,"Science");
       Teacher t3 = new Teacher ( 123 ,"Hamza",4000,95,"Urdu");
       Teacher t4 = new Teacher (1234 ,"Saim",3000,90,"Physics");
       Teacher t5 = new Teacher (12345 ,"Sagheer",5000,98,"English");
       Teacher t6= new Teacher ( 123456,"Shahzaib",4000,99,"Chemistry");
       Teacher t7 = new Teacher ( 1234567 ,"Daniyal",5000,100,"Computer");
       
       List<Teacher>teacherList= new ArrayList<>();
       teacherList.add(t1);
       teacherList.add(t2);
       teacherList.add(t3);
       teacherList.add(t4);
       teacherList.add(t5);
       teacherList.add(t6);
       teacherList.add(t7);

       Student s1 = new Student ( 1, "Mohsin", "VI-B","Sidiqui",70); 
       Student s2 = new Student ( 12, "Hassan", "VII-C", "Saeed",100);
       Student s3 = new Student ( 123, "Agha", "VIII-A", " Tayyab",90);
       Student s4 = new Student ( 1234, "hammad", "V-B", " Khalid",99);
       Student s5 = new Student ( 12345, "Awais", "IX-c", "Arain",100);
       Student s6 = new Student ( 123456, "Umer", "X-A", "Saleem",85);
       Student s7 = new Student ( 1234567, "Danish", "IV-B", "Aslam",80);
       Student s8 = new Student ( 12345678, "Danish", "V-A", "Muneer",80);
       Student s9 = new Student ( 12345679, "Talha", "VII-B", "Ahmed",100);
       Student s10 = new Student ( 12345680, "Talha", "IX-B", "Siraj",95);
       Student s11 = new Student ( 12345681, "Zarak", "II-C", "Khan",85);
       Student s12 = new Student ( 12345682, "Ubaid", "III-A", "Ansari",100);
       Student s13 = new Student ( 12345683, "Uzair", "I-B", "Saleem",99);
       Student s14 = new Student ( 12345684, "Tariq", "VI-C", "Hussain",92);
       
       
       
       List<Student>studentList= new ArrayList<>();
       studentList.add(s1);
       studentList.add(s2);
       studentList.add(s3);
       studentList.add(s4);
       studentList.add(s5);
       studentList.add(s6);
       studentList.add(s7);
       studentList.add(s8);
       studentList.add(s9);
       studentList.add(s10);
       studentList.add(s11);
       studentList.add(s12);
       studentList.add(s13);
       studentList.add(s14);
       School x= new School (teacherList,studentList);
       
     
      n = input.nextInt ();
       
if ( n == 1 )
// switch(n)
 {// case 1: 
    for(int i=1; i<=50; i++){
          System.out.println(" ");
      }
  System.out.println("Select the student of which you want to know the bio data :");
  sbd = input.nextInt ();
  if (sbd == 1)
  {
  //    System.out.println(studentList.add(s1));
      System.out.println("*****************************************************************************");
       System.out.println(s1);
       System.out.println("*****************************************************************************");
      
  }
  else if (sbd==2)
 {
     // System.out.println(studentList.add(s2));
     System.out.println("*****************************************************************************");
      System.out.println(s2);
      System.out.println("*****************************************************************************");
      
  }
  else if (sbd==3)
 {
     // System.out.println(studentList.add(s3));
     System.out.println("*****************************************************************************");
      System.out.println(s3);
      System.out.println("*****************************************************************************");
      
  }
  else if (sbd==4)
 {
//      System.out.println(studentList.add(s4));
     System.out.println("*****************************************************************************");
     System.out.println(s4);  
     System.out.println("*****************************************************************************");
  }
  else if (sbd==5)
 {
     // System.out.println(studentList.add(s5));
     System.out.println("*****************************************************************************");
       System.out.println(s5);
       System.out.println("*****************************************************************************");
  }
  else if (sbd==6)
 {
     // System.out.println(studentList.add(s6));
     System.out.println("*****************************************************************************");
       System.out.println(s6);
       System.out.println("*****************************************************************************");
  }
  else if (sbd==7)
 {
     // System.out.println(studentList.add(s7));
     System.out.println("*****************************************************************************");
      System.out.println(s7);
      System.out.println("*****************************************************************************");
      
  }
  else if (sbd==8)
 {
     // System.out.println(studentList.add(s8));
     System.out.println("*****************************************************************************");
      System.out.println(s8);
      System.out.println("*****************************************************************************");
      
  }
  else if (sbd==9)
 {
      //System.out.println(studentList.add(s9));
     System.out.println("*****************************************************************************");
      System.out.println(s9);
      System.out.println("*****************************************************************************");
      
  }
  else if (sbd==10)
 {
     // System.out.println(studentList.add(s10));
     System.out.println("*****************************************************************************");
      System.out.println(s10);
      System.out.println("*****************************************************************************");
      
  }
  else if (sbd==11)
 {
     // System.out.println(studentList.add(s11));
     System.out.println("*****************************************************************************");
       System.out.println(s11);
       System.out.println("*****************************************************************************");
  }
  else if (sbd==12)
 {
     // System.out.println(studentList.add(s12));
     System.out.println("*****************************************************************************");
       System.out.println(s12);
       System.out.println("*****************************************************************************");
  }
  else if (sbd==13)
 {
      //System.out.println(studentList.add(s13));
       System.out.println("*****************************************************************************");
       System.out.println(s13);
       System.out.println("*****************************************************************************");
  }
  else if (sbd==14)
 {
      //System.out.println(studentList.add(s14));
       System.out.println("*****************************************************************************");
       System.out.println(s14);
       System.out.println("*****************************************************************************");
  }}//break;
// case 2:
 if ( n == 2 )
{
    for(int i=1; i<=50; i++){
          System.out.println(" ");
      }
   
     System.out.println("\n To check the student is a fee defaulter or not; ");

     
      sfd = input.nextInt ();
  if (sfd == 1)
  {
     System.out.println("*****************************************************************************");
     System.out.println(s1.getName()+":");
       s1.updatepayfees(5000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==2)
 {
     System.out.println("*****************************************************************************");
    System.out.println(s2.getName()+":");
       s2.updatepayfees(4000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==3)
 {
     System.out.println("*****************************************************************************");
      System.out.println(s3.getName()+":");
       s3.updatepayfees(3000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==4)
 {
     System.out.println("*****************************************************************************");
      System.out.println(s4.getName()+":");
       s4.updatepayfees(4000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==5)
 {
     System.out.println("*****************************************************************************");
      System.out.println(s5.getName()+":");
       s5.updatepayfees(5000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==6)
 {
     System.out.println("*****************************************************************************");
     System.out.println(s6.getName()+":");
       s6.updatepayfees(3000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==7)
 {
     System.out.println("*****************************************************************************");
       System.out.println(s7.getName()+":");
       s7.updatepayfees(4000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==8)
 {
     System.out.println("*****************************************************************************");
      System.out.println(s8.getName()+":");
       s8.updatepayfees(5000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==9)
 {
     System.out.println("*****************************************************************************");
     System.out.println(s9.getName()+":");
       s9.updatepayfees(3000);
       System.out.println("*****************************************************************************");
  }
  else if ( sfd==10)
 {
     System.out.println("*****************************************************************************");
      System.out.println(s10.getName()+":");
       s10.updatepayfees(4000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==11)
 {
     System.out.println("*****************************************************************************");
     System.out.println(s11.getName()+":");
       s11.updatepayfees(5000); 
       System.out.println("*****************************************************************************");
  }
  else if ( sfd==12)
 {
     System.out.println("*****************************************************************************");
      System.out.println(s12.getName()+":");
       s12.updatepayfees(3000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==13)
 {
     System.out.println("*****************************************************************************");
     System.out.println(s13.getName()+":");
       s13.updatepayfees(4000);
       System.out.println("*****************************************************************************");
      
  }
  else if ( sfd==14)
 {
     System.out.println("*****************************************************************************");
     System.out.println(s14.getName()+":");
       s14.updatepayfees(5000);
       System.out.println("*****************************************************************************");
      
  }}

  
  if (n == 3)
  {
      for(int i=1; i<=50; i++){
          System.out.println(" ");
      }
      System.out.println("\nSelect the student of which you want to check the attendance ");
      sa= input.nextInt ();
      if (sa==1)
      {
          System.out.println("*****************************************************************************");
          System.out.println ("Student " +s1.getName()+" attendance is " +s1.getAttendance()+"%"); 
          System.out.println("*****************************************************************************");
      }
      if (sa==12)
      {
          System.out.println("*****************************************************************************");
          System.out.println ("Student " +s2.getName()+" attendance is " +s2.getAttendance()+"%"); 
          System.out.println("*****************************************************************************");
      }
      if (sa==3)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s3.getName()+" attendance is " +s3.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      }if (sa==4)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s4.getName()+" attendance is " +s4.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      } if (sa==5)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s5.getName()+" attendance is " +s5.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      }if (sa==6)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s6.getName()+" attendance is " +s6.getAttendance()+"%"); 
                System.out.println("*****************************************************************************");
      }
      if (sa==7)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s7.getName()+" attendance is " +s7.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      }if (sa==8)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s8.getName()+" attendance is " +s8.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      }if (sa==9)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s9.getName()+" attendance is " +s9.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      }if (sa==10)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s10.getName()+" attendance is " +s10.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      } if (sa==11)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s11.getName()+" attendance is " +s11.getAttendance()+"%"); 
     System.out.println("*****************************************************************************");
      }if (sa==12)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s12.getName()+" attendance is " +s12.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      } if (sa==13)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s13.getName()+" attendance is " +s13.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      }if (sa==14)
      {System.out.println("*****************************************************************************");
          System.out.println ("Student " +s14.getName()+" attendance is " +s14.getAttendance()+"%"); 
      System.out.println("*****************************************************************************");
      }
  }
  if ( n == 4 )
{
    for(int i=1; i<=50; i++){
          System.out.println(" ");
      }
     System.out.println("\n To check the teacher's bio data ; ");
     
      tb = input.nextInt ();
  if (tb == 1)
  {System.out.println("*****************************************************************************");
      System.out.println(t1);
  System.out.println("*****************************************************************************");
} if (tb == 2)
  {System.out.println("*****************************************************************************");
         System.out.println(t2);
  System.out.println("*****************************************************************************");
}
  if (tb == 3)
  {System.out.println("*****************************************************************************");
           System.out.println(t3 );
  System.out.println("*****************************************************************************");
} if (tb == 4)
  {System.out.println("*****************************************************************************");
         System.out.println(t4 );
  System.out.println("*****************************************************************************");
}  if (tb ==5)
  {System.out.println("*****************************************************************************");
         System.out.println(t5 );
  System.out.println("*****************************************************************************");
} if (tb == 6)
  {System.out.println("*****************************************************************************");
        System.out.println(t6);
  System.out.println("*****************************************************************************");
}     if (tb == 7)
  {System.out.println("*****************************************************************************");
          System.out.println(t7 );
    System.out.println("*****************************************************************************");
  }}
   if ( n == 5 )
   {
       for(int i=1; i<=50; i++){
          System.out.println();
      }
        System.out.println("\n To check how much salary teacher recieve ; ");
        tr=input.nextInt ();
        if (tr==1)
        {System.out.println("*****************************************************************************");
            System.out.println ("Teacher " +t1.getName() +" recieved salary = "+ t1.getSalary()+"$");
        System.out.println("*****************************************************************************");
        }
        if (tr==2)
        {System.out.println("*****************************************************************************");
            System.out.println ("Teacher " +t2.getName() +" recieved salary = "+ t2.getSalary()+"$");
        System.out.println("*****************************************************************************");
        }
        if (tr==3)
        {System.out.println("*****************************************************************************");
            System.out.println ("Teacher " +t3.getName() +" recieved salary = "+ t3.getSalary()+"$");
        System.out.println("*****************************************************************************");
        }
        if (tr==4)
        {System.out.println("*****************************************************************************");
            System.out.println ("Teacher " +t4.getName() +" recieved salary = "+ t4.getSalary()+"$");
        System.out.println("*****************************************************************************");
        }
        if (tr==5)
        {System.out.println("*****************************************************************************");
            System.out.println ("Teacher " +t5.getName() +" recieved salary = "+ t5.getSalary()+"$");
        System.out.println("*****************************************************************************");
        }if (tr==6)
        {System.out.println("*****************************************************************************");
            System.out.println ("Teacher " +t6.getName() +" recieved salary = "+ t6.getSalary()+"$");
        System.out.println("*****************************************************************************");
        }
        if (tr==7)
        {System.out.println("*****************************************************************************");
            System.out.println ("Teacher " +t7.getName() +" recieved salary = "+ t7.getSalary()+"$");
        System.out.println("*****************************************************************************");
        }
        }
   if (n == 6)
  {
      for(int i=1; i<=50; i++){
          System.out.println(" ");
      }
      System.out.println("Select the Teacher of which you want to check the attendance ");
      ta= input.nextInt ();
      if (ta==1)
      {System.out.println("*****************************************************************************");
          System.out.println ("Teacher "+t1.getName()+ " attendance is " +t1.getAttendance()+"%");
      System.out.println("*****************************************************************************");
      }
      if (ta==2)
      {System.out.println("*****************************************************************************");
          System.out.println ("Teacher "+t1.getName()+ " attendance is " +t1.getAttendance()+"%");
      System.out.println("*****************************************************************************");
      }
      if (ta==3)
      {System.out.println("*****************************************************************************");
          System.out.println ("Teacher "+t1.getName()+ " attendance is " +t1.getAttendance()+"%");
      System.out.println("*****************************************************************************");
      }
      if (ta==4)
      {System.out.println("*****************************************************************************");
          System.out.println ("Teacher "+t1.getName()+ " attendance is " +t1.getAttendance()+"%");
      System.out.println("*****************************************************************************");
      }
      if (ta==5)
      {System.out.println("*****************************************************************************");
          System.out.println ("Teacher "+t1.getName()+ " attendance is " +t1.getAttendance()+"%");
     System.out.println("*****************************************************************************"); 
      }
      if (ta==6)
      {System.out.println("*****************************************************************************");
          System.out.println ("Teacher "+t1.getName()+ " attendance is " +t1.getAttendance()+"%");
     System.out.println("*****************************************************************************"); 
      }
      if (ta==7)
      {
         System.out.println("*****************************************************************************");
         System.out.println ("Teacher "+t1.getName()+ " attendance is " +t1.getAttendance()+"%");
      System.out.println("*****************************************************************************");
      }
          
      }
   if ( n == 7 )
   {
       for(int i=1; i<=50; i++){
          System.out.println(" ");
      }
        System.out.println("\n To check what subject teacher's teach ; ");
        ts=input.nextInt ();
        if (ts==1)
        {System.out.println("*****************************************************************************");
              System.out.println ("Teacher "+t1.getName()+ " subject is " +t1.getSubject()); 
              System.out.println("*****************************************************************************");
        }
        if (ts==2)
        {System.out.println("*****************************************************************************");
              System.out.println ("Teacher "+t2.getName()+ " subject is " +t2.getSubject()); 
              System.out.println("*****************************************************************************");
        }
        if (ts==3)
        {System.out.println("*****************************************************************************");
              System.out.println ("Teacher "+t3.getName()+ " subject is " +t3.getSubject()); 
              System.out.println("*****************************************************************************");
        }
        if (ts==4)
        {System.out.println("*****************************************************************************");
              System.out.println ("Teacher "+t4.getName()+ " subject is " +t4.getSubject()); 
              System.out.println("*****************************************************************************");
        }
        if (ts==5)
        {System.out.println("*****************************************************************************");
              System.out.println ("Teacher "+t5.getName()+ " subject is " +t5.getSubject()); 
              System.out.println("*****************************************************************************");
        }
        if (ts==6)
        {System.out.println("*****************************************************************************");
              System.out.println ("Teacher "+t6.getName()+ " subject is " +t6.getSubject()); 
              System.out.println("*****************************************************************************");
        }
        if (ts==7)
        {System.out.println("*****************************************************************************");
              System.out.println ("Teacher "+t7.getName()+ " subject is " +t7.getSubject()); 
              System.out.println("*****************************************************************************");
        }
        }
   if ( n == 8 )
   {
        for(int i=1; i<=50; i++){
          System.out.println(" ");
      }
        {
         System.out.println("*****************************************************************************");
        s1.updatepayfees(5000);
         s2.updatepayfees(4000);
        s3.updatepayfees(3000);
        s4.updatepayfees(4000);
       s5.updatepayfees(5000);
         s6.updatepayfees(3000);
        s7.updatepayfees(4000);
       s8.updatepayfees(5000);
         s9.updatepayfees(3000);
         s10.updatepayfees(4000);
           s11.updatepayfees(5000);
       s12.updatepayfees(3000);
         s13.updatepayfees(4000);
          s14.updatepayfees(5000);
          System.out.println("*****************************************************************************");           
                  
                 
                
          
            System.out.println( "\n\nTHE CITY SCHOOL HAS EARNED = "+x.Total_money_earned()+"$");
            System.out.println( "\n\n***********************************************************************"); 
            
        }}
   if ( n == 9 )
   {
       for(int i=1; i<=50; i++){
          System.out.println(" ");
      }
       {System.out.println("*****************************************************************************");
           t1.receiveSalary(3000);
           t1.receiveSalary(5000);
           t1.receiveSalary(4000);
           t1.receiveSalary(3000);
           t1.receiveSalary(5000);
           t1.receiveSalary(4000);
           t1.receiveSalary(5000);
           System.out.println("*****************************************************************************");
           
         
            System.out.println( "\n\nTHE CITY SCHOOL HAS SPENT= "+x.Total_money_earned()+"$");
            System.out.println( "\n\n************************************************************************"); 
                   
       }
   }
   if (n == 10)
   {
       for(int i=1; i<=50; i++){
          System.out.println(" ");
      }System.out.println("*****************************************************************************");
        System.out.println("Press 'S' for Student Admission and 'T' for Teacher Hiring ");
        System.out.println("*****************************************************************************");
        c = input.next().charAt(0);
        Add obj = new Add();
        if(c == 'S' || c == 's'){
            
            Student1 sobj = new Student1();
            
            System.out.println(" ");
            sobj.setGender(input.nextLine());
            System.out.println("First Name of Student : ");
            sobj.setFName(input.nextLine());
            System.out.println("Last Name of Student : ");
            sobj.setLName(input.nextLine());
            System.out.println("Father Name of Student : ");
            sobj.setFatherName(input.nextLine());
            System.out.println("Email of Student : ");
            sobj.setEmail(input.nextLine());
            System.out.println("ID of Student : ");
            sobj.setID(input.nextLine());
            System.out.println("Age of Student: ");
            sobj.setAge(input.nextInt());
            System.out.println("In which class you want to Take Admission?");
            sobj.setSclass(input.nextLine());
            System.out.println(" ");
            sobj.setSclass(input.nextLine());
            System.out.println(" ");
            sobj.setGender(input.nextLine());
            
            
            System.out.println("*****************************************************************************");
            System.out.println("\n\n\t*This is Your Bio Data*");
            System.out.println(sobj.ParentMethod());
            System.out.println("*****************************************************************************");
            
            /*System.out.println("\n\tFirst Name is : "+sobj.getFName());
            System.out.println("\n\tLast Name is : "+sobj.getLName());
            System.out.println("\n\tEmail is : "+sobj.getEmail());
            System.out.println("\n\tID is : "+sobj.getID());
            System.out.println("\n\tClass is : "+sobj.getSclass());*/
   
            System.out.println("\n\tThe bio-data has been Saved! ");
            System.out.println("\tThank You!");
            System.out.println("*****************************************************************************");
            
        }
        if(c == 't' || c == 'T')
        {
            
            Teacher1 tobj = new Teacher1(); 
            
            System.out.println("\nPlease Enter Your Details...\n");
            
            System.out.println(" ");
            tobj.setGender(input.nextLine());
            System.out.println("First Name of Teacher : ");
            tobj.setFName(input.nextLine());
            System.out.println("Last Name of Student : ");
            tobj.setLName(input.nextLine());
            System.out.println("Father Name of Student : ");
            tobj.setFatherName(input.nextLine());
            System.out.println("Email of Teacher : ");
            tobj.setEmail(input.nextLine());
            System.out.println("ID of Teacher : ");
            tobj.setID(input.nextLine());
            System.out.println("Age of Teacher: ");
            tobj.setAge(input.nextInt());
              System.out.println(" ");
            tobj.setGender(input.nextLine());
            System.out.println("What is your Subject?");
            tobj.setWsubject(input.nextLine());
            System.out.println(" ");
            tobj.setGender(input.nextLine());
            System.out.println(" ");
            tobj.setGender(input.nextLine());
            System.out.println("*****************************************************************************");
            
            System.out.println("\n\n\tThis is your Bio Data\n");
            System.out.println(tobj.ParentMethod());
            System.out.println("*****************************************************************************");
      
           
            System.out.println("\n\n\tThe bio-data has been Saved! ");
            System.out.println("\n\n\tThank You!");
     System.out.println("*****************************************************************************");
            
        }
        
        
   }
  
    System.out.println("\n\tDo You Want To Continue[Y or N]?");
    ch = (char) System.in.read();
    for(int i=1; i<=50; i++){
          System.out.println(" ");
      }
}while(ch == 'y' || ch == 'Y');
     System.out.println("*****************************************************************************");
     System.out.println(" Thankyou For Using This Program....!!!");
     System.out.println("*****************************************************************************");
    
 }
 else {System.out.println("*****************************************************************************");
            System.out.println( "Please Enter The Correct Password...!!!!");
            System.out.println("*****************************************************************************");
        }
      
 }
        else {System.out.println("*****************************************************************************");
            System.out.println( "Please Enter The Correct Username...!!!!");
            System.out.println("*****************************************************************************");
        } 
      
    }}