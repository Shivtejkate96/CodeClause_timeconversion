
package timeconverter;
import java.util.Scanner;
public class Timeconverter {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int hours=24*days;
        int minutes=hours*60;
        int seconds=minutes*60;
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        
        
        
    }
    
}
