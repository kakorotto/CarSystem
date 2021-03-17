/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsystem;

public  class GasolineBasedCar extends Car {

    public GasolineBasedCar(double tankCapacity, double standardConsumptionRate, double maxSpeed, int noOfGears, String color) throws Exception {
        super(maxSpeed, noOfGears, color);
        setTankCapacity(tankCapacity);
        setStandardConsumptionRate(standardConsumptionRate);
        
    }

    private double tankCapacity;
    private double standardConsumptionRate;

    public double getTankCapacity() {
        return tankCapacity;
    }
    public final void setTankCapacity(double tankCapacity) throws Exception {
        if (tankCapacity < 0) {
            throw new Exception("Invalid value.\nMust be positive value");
        }
        this.tankCapacity = tankCapacity;
    }

    public double getStandardConsumptionRate() {
        return standardConsumptionRate;
    }

    public final void setStandardConsumptionRate(double standardConsumptionRate) throws Exception {
        if (standardConsumptionRate < 0) {
            throw new Exception("Invalid value.\nMust be positive value");
        }

        this.standardConsumptionRate = standardConsumptionRate;
    }

    @Override
    public double getMaxDistance() {
        return tankCapacity * standardConsumptionRate;
    }

    @Override
    public String getDetails() {
        return super.getDetails()
                + "Tank capacity is:" + tankCapacity + " (Liters)\n"
                + "Standard Conusmption Rate is:" + standardConsumptionRate + " (Km/L)\n";
    }
}
