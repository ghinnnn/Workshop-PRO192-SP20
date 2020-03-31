package Workshop10;


public class Car {
    private String name;
    private double price;
    private int production;

    public Car() {
    }

    public Car(String name, double price, int production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProduction() {
        return production;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "Name: " + name +" | Price: " + price + " | Production: " + production;
    }
    
}
