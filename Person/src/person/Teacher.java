
package person;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
     private int numCourses=0;
     private List<String> courses=new ArrayList<String>();

    public Teacher(String name, String address) {
        super(name, address);
    }
     public boolean addCourse(String course){
         if(courses.contains(course)){
             return false;
         }
         else {
             courses.add(course);
         return true;
     
         }
     }
     public boolean removeCourse(String course){
         if(courses.contains(course)){
             courses.remove(course);
             return true;
         }
         else 
             return true;
     }
     public void printCourses(){
         for (int i = 0; i < courses.size(); i++) {
             System.out.println(courses.get(i));
         }
     }
     public String toString(){
         return "Teacher: "+super.toString();
     }
     }

