public class PATTERN7 {//PYRAMID
    public static void main(String[] args) {
        int nooflines=5;
        int tspace= nooflines-1 ;
        for(int i=1;i<=nooflines;i++){//change line
            for( int space=1;space<=tspace;space++){//space in pattern
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){//print star
                System.out.print("* ");
            }
            tspace--;
            System.out.println();
        }
    }
    
}
