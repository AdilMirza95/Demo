
package util;

import java.util.Scanner;


public class InputUtil {
   
    public static String textAl (String basliq) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(basliq);
        String cavab = sc.nextLine();
        return cavab;
        
    }
    
     public static int  ededAl (String basliq) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println(basliq);
        int cavab = sc.nextInt();
        return cavab;
        
    }
    
}
