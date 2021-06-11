/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remainder;
import java.util.Scanner;
public class Remainder {

   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            
          int A=in.nextInt();
          int B=in.nextInt();
          System.out.println(A%B);  
        }
        
        t--;
        
    }
    
}
