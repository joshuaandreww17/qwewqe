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
public class student {
     private int StudentNo;
    private String firstname;
     private String lastname;
    private String middlename;
     private String dateofbirth;
    private int age;
     private String course;
    private String section;
     private String gmail;
    private int contact;
     private String gender;
    
 public student(int StudentNo, String firstname,String lastname,String middlename,String dateofbirth,int age,String course,String section,String gmail,int contact,String gender){
    this.StudentNo=StudentNo;
    this.firstname=firstname;
     this.lastname=lastname;
      this.middlename=middlename;
       this.dateofbirth=dateofbirth;
        this.age=age;
         this.course=course;
          this.section=section;
           this.gmail=gmail;
            this.contact=contact;
             this.gender=gender;
    
    }
    public int StudentNo(){
        return StudentNo;
     }
     public String firstname(){
        return firstname;
     }
      public String lastname(){
        return lastname;
     }
     public String middlename(){
        return middlename;
     }
      public String dateofbirth(){
        return dateofbirth;
     }
     public int age(){
        return age;
     }
      public String course(){
        return course;
     }
     public String section(){
        return section;
     }
      public String gmail(){
        return gmail;
     }
     public int contact(){
        return contact;
     }
      public String gender(){
        return gender;
     }
     





}
