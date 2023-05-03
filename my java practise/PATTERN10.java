public class PATTERN10 {//diagonal (line)(3s-space star space)
    public static void main(String[] args) {
        int nooflines=7;
        int tspace=nooflines-1;
        int rightspace=0;
       // final int noofstar=1;//final int means this integer remain fixed throughut prog//
        for(int i=1;i<=nooflines;i++){
            for(int space=1;space<=tspace;space++){
                System.out.print("  ");
            }
                System.out.print("*");
                tspace--;
                for(int space=1;space<=rightspace;space++){
                    System.out.print("  ");
                }

            rightspace++;
            System.out.println();
        }}
    }

