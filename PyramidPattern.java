import java.util.*;
public class PyramidPattern {
   public static void main(String[] args) {
       int rows = 5; // Number of rows for the pyramid
       for (int i = 1; i <= rows; i++) { 
           for (int j = 1; j <= i; j++) { 
               System.out.print("* "); 
           }
           System.out.println(); 
       }
   }
}



