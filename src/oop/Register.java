
package oop;

public class Register {
    
  String grade;
    public static void main(String[] args) {
       
        Student st = new Postgraduate(999, "Masters", "The name");
        st.setGrade("Second Upper");
        
        Student st2 = new Undergraduate(999, "BscIT", "The Name Two");
        st2.setGrade("C");
    }
    
}
