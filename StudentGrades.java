//15.	Create a library of methods for the calculation of basic statistics:
//a.	Number of items within the specified range <x,y>
//b.	Sum of numbers in the given range  <x,y>
//c.	Arithmetic mean of the numbers in the given range  <x,y>
//Then create a program that calculates and displays the basic statistics for integers in the range <5,10>

public class StudentGrades
{
    public static int numberOfItems(int x, int y) {
        int counter = Math.abs(x-y)+1; 
        return counter;
    }
    
    public static int sumOfItems(int x, int y) {
        int sum = 0;
        
        for(int i = x; i<=y; i++) {
            sum+=i;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(StudentGrades.numberOfItems(0,1));
        System.out.println(StudentGrades.sumOfItems(0,10));
    }
 
}
