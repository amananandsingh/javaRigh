import java.util.Scanner;

public class gj{
    static boolean checkpower(int n){
        while (n%2==0) {
            n=n/2;
        }
        if (n==1)
        return true;
        else 
        return false;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            
            if (checkpower(n)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}