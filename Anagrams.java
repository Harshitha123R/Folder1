import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.nextLine().toLowerCase();
        String w2 = sc.nextLine().toLowerCase();
        char[] arr1 = w1.toCharArray();
        char[] arr2 = w2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
    
}
