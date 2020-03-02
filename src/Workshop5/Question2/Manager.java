package Workshop5.Question2;

import java.text.DecimalFormat;

public class Manager extends Employee {
    private String position;
    private double positionAllowance; // phu cap vi tri
    protected double yearReward=100000;

    public Manager(){
    }

    public Manager(String position, double positionAllowance, double yearReward){
        this.position = position;
        this.positionAllowance = positionAllowance;
        this.yearReward = yearReward;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }
}


