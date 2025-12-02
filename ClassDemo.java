class Student {
    String name;
    int age;
    Student(String n,int a){
        name = n;
        age = a;
    void display(){
    System.out.println("Name:"+name+",Age:"+age);
    }
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        Student s1 = new 
        Student("Aishwarya", 19);
        s1.display();
    }
}
