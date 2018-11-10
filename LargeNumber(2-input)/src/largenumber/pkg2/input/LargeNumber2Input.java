package largenumber.pkg2.input;
import java.util.Scanner;
public class LargeNumber2Input {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
       System.out.print("Enter the first number:");
     int w= a. nextInt();
       System.out.println("The first number is= "+w);
       System.out.print("Enter the second number:");
     int q= a. nextInt();
       System.out.println("The second number is= "+q);
       System.out.println("The large number= "+ (w>q?w:q));

    }
    
}
