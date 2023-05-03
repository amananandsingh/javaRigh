public class PATTERN2 {   //hollow square shape
    
    public static void main(String[] args) {
        int nooflines=5;
        for( int i=1;i<=nooflines;i++){
            for(int star=1;star<=nooflines;star++){
                if(star==1 ||star==5 ||i==1||i==5 )
                System.out.print(" *");//for star
                else{
                    System.out.print("  ");}//for space
            }   
               
            System.out.println();
        }
    }
}
