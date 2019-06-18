
package person;


public class PersonMain {

   
    public static void main(String[] args) {
       Student mert=new Student("mert","ab1");
        System.out.println(mert.toString());
       mert.addCourseGrade("matematik", 30);
       mert.addCourseGrade("dif", 90);
       mert.addCourseGrade("dif", 80);
       mert.addCourseGrade("dif", 70);
       mert.printGrades(); 
       System.out.println(mert.getAverageGrade());
       Teacher teacher=new Teacher("emel","ab");
        System.out.println(teacher.toString());
       teacher.addCourse("matematik");
       teacher.addCourse("fizik");
       teacher.addCourse("matematik");
       teacher.addCourse("kimya");
       teacher.addCourse("fizik");
       teacher.printCourses();
    }   
    
}
