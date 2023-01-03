public class Person
{
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int newAge) {
        age = newAge;
    }
    
    public boolean isAdult() {
        if (age>18) {
            return true;
        }
        else {
            return false;
        }
    }
}
    ///Finally, define a method that returns a string representation of the object (name and age, separated by comma)
    public String toString() {
        return String.format("%s.%d", name, age);
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Maciej", 5);
        System.out.println(p1.isAdult());
        System.out.println(p1.toString());
        p1.setAge(30);
        System.out.println(p1.toString());
    }