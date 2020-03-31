/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop10;


public class Function {
    
    GenericCar<Car> gc = new GenericCar();
    
    public int isExist(String name){
        for (int i=0; i<gc.getCarList().size();i++)
            if(gc.getCarList().get(i).getName().equalsIgnoreCase(name)) return i;
        return -1;
    }
    
    public void add(){
        String name;
        System.out.print("Input Name: ");
        name = Validation.checkInputString();
        if(isExist(name)!=-1)
            System.err.println("This car existed in the list!");
        else{
            System.out.print("Please input price: ");
            double price = Validation.checkInputDouble();
            System.out.print("Please input production: ");
            int production = Validation.checkInputInt();
            gc.getCarList().add(new Car(name, price, production));
            System.err.println("Add new car successful!");
        }
    }
    
    public void display(){
        if(gc.getCarList().isEmpty())
            System.out.println("List empty!");
        else{
            System.out.println("List of cars:");
            for (int i=0; i<gc.getCarList().size();i++)
                System.out.println(i+1+". "+gc.getCarList().get(i));
        }
        
    }
    
    public void numberOfItems(){
        System.out.println("Number of item: "+gc.getCarList().size());
    }
    
    public void delete(){
        if(gc.getCarList().isEmpty())
            System.out.println("List empty!");
        else{
            display();
            System.out.print("Enter position to delete: ");
            int position = Validation.checkInputInt();
            int amount = gc.getCarList().size();
            if(position>=amount || position<=0){
                System.err.println("There is no car to remove. Enter again!");
                delete();
            }
            gc.getCarList().remove(position-1);
            System.err.println("Remove successful!");
        }   
    }
}
