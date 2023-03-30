package assignment;
public class Student {
    private String name;
    private int age;
    private String collage;
    
    // Constructor with all parameters
    public Student(String name, int age, String collage) {
        this.name = name;
        this.age = age;
        this.collage = collage;
    }
    
    // Getter and Setter methods 
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getcollage() {
        return collage;
    }
    
    public void setMajor(String collage) {
        this.collage = collage;
    }
}
