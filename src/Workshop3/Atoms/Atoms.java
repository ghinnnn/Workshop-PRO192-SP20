package Workshop3.Atoms;

import java.util.Scanner;

public class Atoms {
    private int number;
    private String symbol;
    private String fullname;
    private double weight;

    public Atoms() {

    }


    public Atoms(int number, String symbol, String fullname, double weight, String symbol1, String fullname1, double weight1) {
        this.number = number;
        this.symbol = symbol1;
        this.fullname = fullname1;
        this.weight = weight1;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter atomic number: ");
        this.number = scanner.nextInt();
        if (this.number != 0) {
            System.out.print("Enter symbol: ");
            this.symbol = scanner.next();
            scanner.nextLine();
            System.out.print("Enter full name: ");
            this.fullname = scanner.nextLine();
            System.out.print("Enter atomic weight: ");
            this.weight = scanner.nextDouble();
            System.out.println("");
        }
    }

    void display(){
        System.out.println(number + "\t" + symbol + "\t" + fullname + "\t" + weight);
    }
}


