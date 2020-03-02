package Workshop5.Question1;

public class PhoneNumber {
    private int area;
    private String number;

    public PhoneNumber(){
    }

    public PhoneNumber(int area, String number){
        this.area = area;
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void inputData(){
        System.out.print("Enter area code: ");
        area= Validation.checkInputInt();
        System.out.print("Enter phone number: ");
        number = Validation.checkInputPhone();
    }

    public void display(){
        System.out.println("local phone: "+area+"-"+number);
    }
}
