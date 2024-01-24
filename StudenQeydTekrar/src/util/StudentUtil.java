/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import Bean.Student;
import config.Base;
import java.util.Scanner;

/**
 *
 * @author ADIL
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.textAl("Adi daxil edin:");
        String surname = InputUtil.textAl("Soyadi daxil edin:");
        int yas = InputUtil.ededAl("Yasi daxil edin:");
        String group = InputUtil.textAl("Qrupu daxil edin:");
        return new Student(name, surname, yas, group);
    }

    public static void registerStudent() {

        int say = InputUtil.ededAl("Nece telebe qeydiyyat etmek isteyirsiz?");
        Base.student = new Student[say];
        for (int i = 0; i < say; i++) {
            System.out.println((i + 1) + ".Qeydiyyat");
            Base.student[i] = StudentUtil.fillStudent();

        }
    }

    public static void showAllStudent() {

        if (Base.student == null) {
            return;
        }
        for (int i = 0; i < Base.student.length; i++) {
            if (Base.student[i] != null) {
                System.out.println((i + 1) + "." + Base.student[i]);
            }
        }
    }

    public static void searchAndPrint() {

        String text = InputUtil.textAl("Axtarmaq istediyiniz sozu yazin:");
        Student s[] = Base.student;
        for (int i = 0; i < s.length; i++) {

            if (s[i].getName().contains(text) || s[i].getSurname().contains(text)
                    || s[i].getGroup().contains(text)) {
                System.out.println(s[i]);
            }
        }

    }

    public static void editStudent() {

        StudentUtil.showAllStudent();
        int no = InputUtil.ededAl("Melumatini deyismek istediyiniz telebeni secin:") - 1;
        Student s = Base.student[no];
        int paramsNo = InputUtil.ededAl("Deyis:"
                + "\n1.Ad"
                + "\n2.Soyad"
                + "\n3.Yas"
                + "\n4.Qrup");

        if (paramsNo == 1) {
            s.setName(InputUtil.textAl("Yeni adi daxil edin"));
        } else if (paramsNo == 2) {
            s.setSurname(InputUtil.textAl("Yeni soyadi daxil edin"));
        } else if (paramsNo == 3) {
            s.setAge(InputUtil.ededAl("Yeni yasi daxil edin"));
        } else if (paramsNo == 4) {
            s.setGroup(InputUtil.textAl("Yeni qrupu daxil edin"));
        }
    }

    public static void deleteStudent() {
        StudentUtil.showAllStudent();
        int nom = InputUtil.ededAl("Silmek istediyiniz telebeni secin") - 1;
        Student s = Base.student[nom];
        Base.student[nom] = null;
    }

}
