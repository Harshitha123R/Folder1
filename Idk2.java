class Student {

String name;
int age;

Student(String n, int a){   //Constructor
    name=n;
    age=a;
}

void display() {
    System.out.println("Hello "+name+","+" You are "+age+" years old.");
}
}
public class Idk2{
    public static void main(String[] args) {
        Student s1 = new Student("Aishwarya",19); 
        //s1.name="Aishwarya"; //without constructor
        //s1.age = 19;
        s1.display();
    }
}