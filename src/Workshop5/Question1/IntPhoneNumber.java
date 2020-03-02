package Workshop5.Question1;

public class IntPhoneNumber extends PhoneNumber {
    private String countryCode;

    public IntPhoneNumber(){
    }

    public IntPhoneNumber(String countryCode, int area, String number){
        super(area,number);
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public void inputData() {
        System.out.print("Enter coutry code: ");
        countryCode = Validation.checkInputString();
        System.out.print("Enter area code: ");
        int are = Validation.checkInputInt();
        super.setArea(are);
        System.out.print("Enter phone number: ");
        String phone = Validation.checkInputPhone();
        super.setNumber(phone);
    }

    @Override
    public void display() {
        System.out.println("International phone number: "+countryCode+"-"+super.getArea()+"-"+super.getNumber());
    }
}
