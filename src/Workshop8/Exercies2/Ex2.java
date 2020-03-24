package Workshop8.Exercies2;

import java.io.*;
import java.util.Scanner;

public class Ex2 {
    private String name;
    private int age;
    private int mark;
    private String subject;

    public static void main(String[] args){
        Ex2 ec = new Ex2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Add Student");
        System.out.println("2. Loading list Students");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
        int m = sc.nextInt();
        switch (m) {
            case 1:
                System.out.println("Add Student: ");
                int n = sc.nextInt();
                for (int i =0;i<n;i++) {
                    System.out.println("Enter name Student: ");
                    String name = sc.next();
                    System.out.println("Enter age Student: ");
                    int age = sc.nextInt();
                    System.out.println("Enter mark Student: ");
                    int mark = sc.nextInt();
                    System.out.println("Enter subject's Student: ");
                    String subject = sc.next();
                }
                break;
            case 2:
                System.out.println("List STUDENT: ");
                System.out.println("-------------------");
                ec.readStudent();
        }
    }
    public void InputStudent(String name, int age, int mark, String subject, int n) {
        try {
            OutputStream os = new BufferedOutputStream(new FileOutputStream("Text.txt"));
            for (int i = 0; i < n ; i++) {
                os.write(("Name : " +name + "\n").getBytes());
                os.write(("Age : " +age + "\n").getBytes());
                os.write(("Mark : " +mark + "\n").getBytes());
                os.write(("Subject : " +subject + "\n").getBytes());
                os.write(("-------------------------- : " + "\n").getBytes());

            }
            os.flush();
            System.out.println("Done!");
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readStudent() {
        try {
            InputStream is = new FileInputStream("Text.txt");

            int c;
            while ((c = is.read()) != -1) {
                System.out.println((char) c);
            }

            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
