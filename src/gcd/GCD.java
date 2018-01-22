
package gcd;

import java.util.Scanner;


public class GCD {
        
        
        
        public static int gcd(int x,int y){
            int output;
            int smallNumber;
            int largeNumber;
            if(x<y){
                smallNumber=x;
                largeNumber=y;
            }
            else{
                smallNumber=y;
                largeNumber=x;
            }
            
            if(x==0){
                output=y;
            }
            else if(y==0){
                output=x;
            }
            else{
                output=gcd(smallNumber,largeNumber%smallNumber);
            }
            
            return output;


        }
   
    public static void main(String[] args) {
        
        
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int gcd=gcd(num1,num2);
        System.out.println(gcd);
        
       
        
    }
    
}
