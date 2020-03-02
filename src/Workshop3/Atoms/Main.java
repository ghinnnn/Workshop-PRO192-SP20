package Workshop3.Atoms;

import Workshop3.Atoms.Atoms;


public class Main {
    public static void main(String[] args) {
        Atoms[] atom = new Atoms[10];
        int i = 0;
        System.out.println(" Atomic Information");
        System.out.println("==================");
        while (i < 10) {
            atom[i] = new Atoms();
            atom[i].accept();
            if (atom[i].getNumber() == 0) {
                break;
            }
            i++;
        }
        for (int j = 0; j < i; j++) {
            atom[j].display();
        }
    }
}
