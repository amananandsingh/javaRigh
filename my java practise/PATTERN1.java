public class PATTERN1 {  //simple square pattern
    public static void main(String[] args) {
        int nooflines=5;
        for (int i=1;i<=nooflines;i++){   //for outer loop to print new line
            for(int star=1;star<=nooflines;star++){   //for inner loop to print stars//
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
