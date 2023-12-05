import java.util.Scanner; //reverse any string
import java.util.*;
public class amco {
    public static void main(String[] args) {
    String originalStr;
    String reversedStr = "";
    Scanner in=new Scanner(System.in);
    System.out.println("Enter STRING OR CHARACTER:");
    originalStr=in.next();
    System.out.println("Original string: " + originalStr);
    for (int i = 0; i < originalStr.length(); i++) {
        reversedStr = originalStr.charAt(i) + reversedStr;
      }
      
      System.out.println("Reversed string: "+ reversedStr);


    }
}
