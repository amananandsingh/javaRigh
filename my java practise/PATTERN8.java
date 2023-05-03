public class PATTERN8 {//odd star pyramid(firstline 1 & second line 3star)
    public static void main(String[] args) {
        int nooflines=7  ;
        int tspace=nooflines-1 ;
        for(int i=0;i<=nooflines-1;i++){
            for(int space=1;space<=tspace;space++){
                System.out.print(" ");
            }
            int oddcompute=2*i+1;//compute only odd number sf stars
            for(int star=1;star<=oddcompute;star++){//star print for odd value
                System.out.print("*");
            }tspace--;
            System.out.println();
        }
    }
    
}
