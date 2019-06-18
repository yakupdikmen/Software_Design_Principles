
package person;

import java.util.ArrayList;
import java.util.List;


public class Student extends Person{
    private int numCourses=0;
    private List<String> courses=new ArrayList<String>();
    private List<Integer> grades=new ArrayList<Integer>();
    public Student(String name, String address) {
        super(name, address);
    }
    public void addCourseGrade(String course,int grade){
      
       courses.add(course);
       grades.add(grade);
       
    }
    public void printGrades(){
        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
    }
    double getAverageGrade(){
        int toplam=0;
        for (int i = 0; i < grades.size(); i++) {
            toplam+=grades.get(i);
        }
        return toplam/4;
    }
     public String toString() {
        return "STUDENT: " +super.toString();
    }
}
