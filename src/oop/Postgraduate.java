
package oop;

public class Postgraduate extends Student {

    public Postgraduate(int admissionNo, String courseName, String studentName) {
        super(admissionNo, courseName, studentName);
    }

     public boolean checkPrequalification(String degreeHonors){
         if(degreeHonors.equals("First class") || degreeHonors.equals("Second Upper") || degreeHonors.equals("Second Lower")  ){
             return true;
         }else{
         return false;
        }
    }
}
