/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsystem;


public abstract class Car {

    private double maxSpeed;
    private int noOfGears;
    private String color;

    public Car(double maxSpeed, int noOfGears, String color) throws ArrayIndexOutOfBoundsException, Exception {
        setMaxSpeed(maxSpeed);
        setNoOfGears(noOfGears);
        this.color = color;
    }
    public Car(double maxSpeed, int noOfGears) throws Exception {
       this(maxSpeed,noOfGears,null);
    }

    public Car(double maxSpeed)throws Exception {
        this(maxSpeed,0);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public final  void setMaxSpeed(double maxSpeed) throws Exception {
        if (maxSpeed < 0) {
            throw new Exception("Invalid max speed.\nMust be positive value");
        }
        this.maxSpeed = maxSpeed;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public final void setNoOfGears(int noOfGears) throws ArrayIndexOutOfBoundsException {
        if (noOfGears < 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid no of Gears.\nMust be positive value");
        }

        this.noOfGears = noOfGears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getMaxDistance();

    public  String getDetails() {
        return "Color is:" + color + "\n"
                + "Max Speed is:" + maxSpeed + " (Km/h)\n"
                + "No of gear shift is:" + noOfGears + "\n"
                + "Max distance is:" + getMaxDistance() + "(Km)\n";
    }
   
}
