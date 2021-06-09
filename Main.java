
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Main
{
    public static void main(String[] args)
    {
        //q3
        for (int i = 1; i <= 10; i++) {
            System.out.println((int)Math.pow(4, i));
        }
        
        //q4
        int n=1, i=2;
        while (n<=25){
            if (i%3==0 && i%5==0 && i%7==0) {
                System.out.println(i);
                n++;
            }
            i+=2;
        }
        
        //q5 sumton
        /* Input: int n
           Output: int
           If the input is greater than 1 it calculates the sum of integers from 1-n. Otherwise it returns 0.
           Ex. 5 ⇒ 1+2+3+4+5 = 15 */
        System.out.println(sumton(5));
        System.out.println(sumton(15));
        System.out.println(sumton(-15));
        
        //q6 alternatetoN
        /*  Input: int n
            Output: void
            If the input is greater than 1 the function should print out alternating (pos/neg) integers up to the number. Otherwise it shouldn’t print out anything and just return.
            Ex. 5 ⇒ 1, -2, 3, -4, 5 ⇒ void
            Ex. 10 ⇒ 1, -2, 3, -4, 5, -6, 7, -8, 9, -10 ⇒ void */
        alternatetoN(5);
        alternatetoN(10);
        alternatetoN(1);
        
        //q7 maxDigit
        /*  Input: int n
            Output: int
            Return the maximum (highest value) digit listed in the number n
            Ex. 68723 ⇒ 8
            Ex2. 9999 ⇒ 9 */
        System.out.println(maxDigit(68723));
        System.out.println(maxDigit(9999));
        
        //q8 reverseNumber
        /*  Input: int n
            Output: int
            Return the original integer reversed (written in reverse digit order)
            Ex. 12345 ⇒ 54321
            Ex. 62854123 ⇒ 32145826 */	
        System.out.println(reverseNumber(12345));
        System.out.println(reverseNumber(62854123));
    }
    
    public static int sumton(int n) {
        if (n <= 1) {
            return 0;
        }
        else {
            int sum=0;
            for (int i=1; i<=n; i++) {
                sum += i;
            }
            return sum;
        }
    }
    
    public static void alternatetoN(int n) {
        if (n <= 1) {
            return;
        }
        else {
            String output="";
            for (int i=1; i<n; i++) {
                if (i%2==1) {
                    output = output + i + ", ";
                }
                else {
                    output = output + (i*-1) + ", ";
                }
            }
            if (n%2==1) {
                output = output + n;
            }
            else {
                output = output + (n*-1);
            }
            System.out.println(output);
            return;
        }
    }
    
    public static int maxDigit(int n) {
        int max=0;
        
        while (n>=10) {
            if (max < n%10) {
                max = n%10;
            }
            n = n/10;
        }        
        return max;
    }
    
    public static int reverseNumber(int n) {
        int ans=0, digits=1, temp=n;
        while (temp/10>0) {
            digits++;
            temp/=10;
        }
        while (digits>0) {
            ans += n%10 * Math.pow(10, digits-1);
            digits--;
            n/=10;
        }
        return ans;
    }
}
