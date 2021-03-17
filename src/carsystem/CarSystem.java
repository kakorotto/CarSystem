/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsystem;



public class CarSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            Car[]cars = new Car[]{
                new ElectricCar(1500, 50, 100, 130, 4, "Red"),
                new GasolineBasedCar(40, 10, 110, 5, "Green"),
                    
            };
            
            for (Car car : cars) {
                System.out.println(car.getDetails());
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("An error has happened(No of gears).\n Message is:"+ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("An error has happened.\n Message is:"+ex.getMessage());
        }
    }
    
}
