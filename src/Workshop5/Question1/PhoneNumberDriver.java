package Workshop5.Question1;

public class PhoneNumberDriver {
    public static void main(String[] args){
        PhoneNumber[] phonelist = new PhoneNumber[10];
        int choice;
        int count = 0;
        do {
            choice = Manager.Menu();
            switch (choice){
                case 1:
                    phonelist[count] = new PhoneNumber();
                    phonelist[count].inputData();
                    count++;
                    break;
                case 2:
                    phonelist[count] = new IntPhoneNumber();
                    phonelist[count].inputData();
                    count++;
                    break;
                case 3:
                    for (int i=0; i<count;i++)
                        phonelist[i].display();
                    break;
                default:
                    System.out.println("Wrong value!");
                    break;
            }
        } while (choice!=4);
    }
}
