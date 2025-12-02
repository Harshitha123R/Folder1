import java.util.Scanner; 
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, temp = n;
        while(temp>0){
            int d = temp%10;
            sum += d*d*d;
            temp /= 10;
        }
        if(sum==n){
            System.out.println("It is a armstrong number");
        }
        else{
            System.out.println("It is not a armstrong number");
        }
    }
    
}
