
package personmain;


public class Student extends Person {
    int grades []=null;
    String courses[]=null;

    public Student(String name,String adress){
        this.name=name;
        this.adress=adress;
    }
    public void addCourseGrade(String course,int grade){
        if(courses==null && grades==null){
            grades[0]=grade;
            courses[0]=course;}
        else{
            for (int i = 0; i <courses.length+1 ; i++) {
                if(courses[i]==course){
                    System.out.println("ders zaten var");
                }
                else if(courses[i]==null)
                    courses[i]=course;
                    grades[i]=grade;
            }
        }
     }
    public void delCourse(String course){
        for (int i = 0; i <courses.length; i++) {
            if(courses[i]==course){
                courses[i]="";
                grades[i]=null;
            }
                    
        }
    }
}

