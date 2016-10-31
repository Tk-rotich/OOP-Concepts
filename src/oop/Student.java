
package oop;

public class Student {
    private int admissionNo;
    private String courseName, studentName, grade;
    
    public String isQualified(){
        if(checkPrequalification()){}
        return "Nope";
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public Student(int admissionNo, String courseName, String studentName) {
        this.admissionNo = admissionNo;
        this.courseName = courseName;
        this.studentName = studentName;
    }
    
    public boolean checkPrequalification(){
        return false;
    }
    
    public int getAdmissionNo() {
        return admissionNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setAdmissionNo(int admissionNo) {
        this.admissionNo = admissionNo;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
