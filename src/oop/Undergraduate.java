
package oop;

public class Undergraduate extends Student {

    public Undergraduate(int admissionNo, String courseName, String studentName) {
        super(admissionNo, courseName, studentName);
    }
    
     public boolean checkPrequalification(String kcseGrade){
        if(kcseGrade.equals("A") || kcseGrade.equals("B") || kcseGrade.equals("C")  ){
             return true;
         }else{
         return false;
        }
    }
    
}
