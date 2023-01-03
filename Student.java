//Complete the class with methods that:
//a.	calculates of the lowest grade
//b.	calculates of the highest grade
//c.	calculates of the number of grades
//d.	calculates of the grade point average
//e.	displays student’s record with student’s name, a list of the student's grades, number of grades, 
//lowest grade, highest grade, and grade point average

public class Student
{
    String studentName;
    double[] grades;
    
    Student(String name, double[] grades) {
        studentName = name;
        this.grades = grades;
    }
    
    public String toString() {
        return String.format("Name: %s \n", studentName);
    }
    
    public double lowestGrade() {
        double lowest = grades[0];
        
        for (int i = 0; i<grades.length; i++) {
            if (grades[i]<lowest) {
                lowest=grades[i];
            }
        }
        
        return lowest;
    }
    
    public int numberOfGrades() {
        int container = 0;
        
        for(int i = 0; i<grades.length; i++) {
            container++;
        }
        
        return container;
    }
    
    
    public static void main(String[] args) {
        Student s1 = new Student("Maciej", new double[] {3.0, 2.5, 4.0});
        System.out.println(s1.lowestGrade());
        System.out.println(s1.numberOfGrades());
        System.out.println(s1.toString());
    }
}
