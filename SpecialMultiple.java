
import java.io.*;
import java.util.*;

/* Question statement - You are given an integer N.
 Can you find the least positive integer X made up of only 9's and 0's, such that, X is a multiple of N?

Basically numbers from [1, 2, 3 , 4.....n] are [1,10,11,100......n] in Binary form, 
so observe the pattern and you will realize that if you replace '1' by '9' you get a number series [9,90,99,900.....n]

 */




public class SpecialMultiple{

    static int series[] = new int[1000];
    
    static void updateSeries() {
        
        int i = 0;
        int j = 1;
        while(i < 1000) {
            
            series[i++] = 9 * Integer.parseInt(Integer.toBinaryString(j));
            j++;
        }
    }
    public static void main(String[] args) {
        
      Scanner in = new Scanner(System.in);
        
       updateSeries();
        
        int t = in.nextInt();
        
        while(t > 0) {
            
            int n = in.nextInt();
            int num, i = 0;
            while(true) {
                
                if(series[i]%n == 0) {
                    num = series[i];
                    break;
                }
                else 
                    i++;
            }
            
            System.out.println(num);
            t--;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}