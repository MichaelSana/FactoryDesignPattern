package FactoryDesignPattern;
/**
 * A class that returns the atributes of the Kids Bike
 * @author Michael Sana
 */
public class KidsBike extends Bike {

    /**
     * Returns the attributes of the Kids Bike
     */
    public KidsBike(){
        name = "Kids Bike";
        price = 80.99;
        numWheels = 2;
        hasPeddals = true;
        hasTrainingWheels = true;
    }
    
}
