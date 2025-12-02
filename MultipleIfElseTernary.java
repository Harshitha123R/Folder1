public class MultipleIfElseTernary {
    public static void main(String[] args) {
        int marks = 72;
        String grade = (marks>=90)?"A":
                 (marks>=75)?"B":
                  (marks>=50)?"C":"Fail";
        System.out.println("Grade: "+grade);
    }
    
}
