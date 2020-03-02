package Workshop4.Question2;

import java.util.Date;

public class Student {
            private String name;
            private String studentID;
            private Date birthDate;
            private String address;
            private String major;

            public Student() {}

    public Student(String name, String studentID, Date birthDate, String address, String major) {
        this.name = name;
        this.studentID = studentID;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void inputData(){
        System.out.println("--------------------------------------------------");
        System.out.print("Please enter fullname: ");
        name=Validation.checkInputString();
        System.out.print("Please enter student ID: ");
        studentID=Validation.checkInputString();
        System.out.print("Please enter date of birth(YYYY/MM/DD): ");
        birthDate=Validation.checkInputDate();
        System.out.print("Please enter address: ");
        address=Validation.checkInputString();
        System.out.print("Please enter major: ");
        major=Validation.checkInputString();
    }

    public void printAllAttrubutes(){
        System.out.println("-----------------------------------------");
        System.out.println("Student name:"+name);
        System.out.println("Student ID"+studentID);
        System.out.println("Date of birth"+birthDate);
        System.out.println("Address"+address);
        System.out.println("Major"+major);
    }
}

