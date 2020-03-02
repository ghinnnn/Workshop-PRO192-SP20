package Workshop4.Question2;

import java.util.Date;
import java.util.Scanner;

public class StudentDriver {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Student[] arrayStudent = new Student[3];
        for(int i=0; i<3; i++)
            arrayStudent[i] = new Student();
        Date date1 = new Date("2000/01/06");
        arrayStudent[0].setName("Nguyen Huy Hoang");
        arrayStudent[0].setStudentID("DE140024");
        arrayStudent[0].setBirthDate(date1);
        arrayStudent[0].setAddress("Thua Thien Hue");
        arrayStudent[0].setMajor("Developer Technology");
        System.out.println("Fullname:"+arrayStudent[0].getName());
        System.out.println("StudentID: "+arrayStudent[0].getStudentID());
        System.out.println("Date of birth: "+arrayStudent[0].getBirthDate());
        System.out.println("Address: "+arrayStudent[0].getAddress());
        System.out.println("Major: "+arrayStudent[0].getMajor());
        for (int i=1;i<3;i++)
            arrayStudent[i].inputData();
        for (int i=1;i<3;i++)
            arrayStudent[i].printAllAttrubutes();
    }
}
