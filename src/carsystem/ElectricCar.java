/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsystem;


public class ElectricCar extends Car {

   

    public ElectricCar(double batteryCapacity, double standardChargingRate, double standardConsumptionRate, double maxSpeed, int noOfGears, String color) throws Exception {
        super(maxSpeed, noOfGears, color);
        setBatteryCapacity(batteryCapacity);
        setStandardChargingRate(standardChargingRate);
        setStandardConsumptionRate(standardConsumptionRate);
    }

    private double batteryCapacity;
    private double standardChargingRate;
    private double standardConsumptionRate;

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public final void setBatteryCapacity(double batteryCapacity) throws Exception {
        if (batteryCapacity < 0) {
            throw new Exception("Invalid standard charging rate.\nMust be positive value");
        }

        this.batteryCapacity = batteryCapacity;
    }

    public double getStandardChargingRate() {
        return standardChargingRate;
    }

    public final void setStandardChargingRate(double standardChargingRate) throws Exception {
        if (standardChargingRate < 0) {
            throw new Exception("Invalid standard charging rate.\nMust be positive value");
        }

        this.standardChargingRate = standardChargingRate;
    }

    public double getStandardConsumptionRate() {
        return standardConsumptionRate;
    }

    public final void setStandardConsumptionRate(double standardConsumptionRate) throws Exception {
        if (standardConsumptionRate < 0) {
            throw new Exception("Invalid standard conusmption rate.\nMust be positive value");
        }

        this.standardConsumptionRate = standardConsumptionRate;
    }

    @Override
    public double getMaxDistance() {
        return batteryCapacity * standardConsumptionRate;
    }

    @Override
    public String getDetails() {
        return super.getDetails()
                + "Battery capacity is:" + batteryCapacity + " (Ah)\n"
                + "Standard Charging Rate:" + standardChargingRate + " (A)\n"
                + "Standard Conusmption Rate is:" + standardConsumptionRate + " (Km/Ah)\n";
    }
}
