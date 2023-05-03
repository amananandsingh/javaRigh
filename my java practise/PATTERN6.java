public class PATTERN6 {//inverted pattern 4
    public static void main(String[] args) {
        int nooflines=5;
        int tspace=0;
        for(int i=5;i>=1;i-- ){
            for(int space=1;space<=tspace;space++){
                System.out.print(" ");//space
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");//star
            }
            tspace++;
            System.out.println();
        }
    }
}
