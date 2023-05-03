public class PATTERN9 {//full pyramid pattern (hard)   //diamond
    public static void main(String[] args) {
        int nooflines=8;
        int mid=nooflines/2;
        int tspace= mid;
        int starcount=1;
        for(int i=1;i<=nooflines;i++){
            for(int space=1;space<=tspace;space++){
                System.out.print(" ");
                   
            }  for( int star=1;star<=starcount;star++){
                System.out.print("*");
            }
            if(i<mid){//upper pyramid
                starcount+=2;
                tspace--;


            }else{//loewer pyramid
                starcount-=2;
            tspace++;}
            System.out.println();
        }
    }
    
}
