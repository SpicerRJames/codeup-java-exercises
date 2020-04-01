package grades;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String names;
    private ArrayList<Integer> grades;


    public Student(String n){
        this.names = n;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return names;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
       grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){

        if (grades == null || grades.isEmpty()){
            return 0;
        }
        double sum = 0;
        for(Integer stuGrade : grades){
            sum += stuGrade;
        }
        return sum / grades.size();
    }


}
