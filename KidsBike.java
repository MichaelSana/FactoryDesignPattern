package FactoryDesignPattern;

public class KidsBike extends Bike {
    public KidsBike(){
        name = "Kids Bike";
        price = 80.99;
        numWheels = 2;
        hasPeddals = true;
        hasTrainingWheels = true;
    }
    
}