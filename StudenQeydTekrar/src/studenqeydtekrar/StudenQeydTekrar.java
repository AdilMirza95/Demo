package studenqeydtekrar;

import Bean.Student;
import config.Base;
import java.util.Scanner;
import util.InputUtil;
import util.StudentUtil;

public class StudenQeydTekrar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            int menu = InputUtil.ededAl("Menudan secim edin:  "
                    + "\n1.Telebe elave et"
                    + "\n2.Telebeleri goster"
                    + "\n3.Telebe axtar"
                    + "\n4.Duzelis et"
                    + "\n5.Sil"
                    + "\n6.Cix:");
            
            if (menu == 1) {
                StudentUtil.registerStudent();
            } else if (menu == 2) {
                StudentUtil.showAllStudent();
            } else if (menu == 3) {
                StudentUtil.searchAndPrint();
            } else if (menu == 4) {
                StudentUtil.editStudent();
            } else if (menu == 5) {
                StudentUtil.deleteStudent();                
            } else if (menu == 6) {
                System.exit(0);
            }
            
        }
    }
    
}
