// class Student
//  {
//     String name;
//     int age;
//     Student(String name,int age){
//         this.name=name;
//         this.age=age;
//     }
//     void display(){
//         System.out.println("Name:"+name+",Age:"+age);

//     }
// }
//  public class Main{
//     public static void main(String[] args) {
//         Student s1 = new Student("Ravi",22);
//         s1.display();
//     }
// }
//  class Rectangle{
//     int length,width;
//     Rectangle(){
//         this(5,5);
//     }
//     Rectangle(int l,int w){
//         length=l;
//         width=w;

//     }
//     void area(){
//         System.out.println("Area:"+(length*width));
//     }
//  }
//  public class Main{
//     public static void main(String[] args) {
//         Rectangle r = new Rectangle();
//         r.area();
//     }
// }
 class Test{
    void print(Test obj){
        System.out.println("Method is called");
    }
    void call(){
        print(this);

    }
    }
    public class Main{
        public static void main(String[] args) {
            Test t = new Test();
            t.call();
        }
    }