/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop10;


public class Driver {
    public static void main(String[] args){
        Function func = new Function();
        int choice;
        do {            
            choice = Manager.menu();
            switch(choice){
                case 1: func.add();
                        break;
                case 2: func.display();
                        break;
                case 3: func.numberOfItems();
                        break;
                case 4: func.delete();
                        break;
                case 0: break;
                default:
                    System.err.println("Wrong value");
                    break;
            }
        } while (choice!=0);
    }
}
