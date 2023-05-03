public class PATTERN5 {  //mirror left pyramid pattern
    public static void main(String[] args) {
        int nooflines=5;
        int tspace=nooflines-1;
        for(int i=1;i<=nooflines;i++){
            for(int space=1;space<=tspace;space++){
                System.out.print(" ");
            }
                for(int star=1;star<=i;star++){
                 
                System.out.print("*");
            }
            tspace--;//need to decrement tspace after each iteration
            System.out.println();
        }
    }
}
