/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xampp;

/**
 *
 * @author AMD
 */
public class search {
           private int StudentNo;
    private String firstname;
     private String lastname;
    private String middlename;
     private String dateofbirth;
    private int age;
     private String gender;
     private String course;
    private String section;
     private String gmail;
    private int contact;
    
    
 public search(int StudentNo, String firstname,String lastname,String middlename,String dateofbirth,int age,String gender,String course,String section,String gmail,int contact){
    this.StudentNo=StudentNo;
    this.firstname=firstname;
     this.lastname=lastname;
      this.middlename=middlename;
       this.dateofbirth=dateofbirth;
        this.age=age;
         this.gender=gender;
         this.course=course;
          this.section=section;
           this.gmail=gmail;
            this.contact=contact;
             this.gender=gender;
    
    
    }
    public int getStudentNo(){
        return StudentNo;
     }
     public String getfirstname(){
        return firstname;
     }
      public String getlastname(){
        return lastname;
     }
     public String getmiddlename(){
        return middlename;
     }
      public String getdateofbirth(){
        return dateofbirth;
     }
     public int getage(){
        return age;
     }
     public String getgender(){
        return gender;
     }
      public String getcourse(){
        return course;
     }
     public String getsection(){
        return section;
     }
      public String getgmail(){
        return gmail;
     }
     public int getcontact(){
        return contact;
     }

     
}


