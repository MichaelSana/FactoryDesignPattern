package FactoryDesignPattern;
/**
 * A class that gives the atributes of the Tricycle
 * @author Michael Sana
 */
public class Tricycle extends Bike {

    /**
     * Returns the atributes of a Trcycle
     */
    public Tricycle(){
        name = "Tricycle";
        price = 54.95;
        numWheels = 3;
        hasPeddals = true;
        hasTrainingWheels = false;
    }
}
