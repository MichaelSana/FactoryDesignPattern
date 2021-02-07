package FactoryDesignPattern;
/**
 * A class that gives the attributes of the Strider bike
 * @author Michael Sana
 */
public class Strider extends Bike {

    /**
     * Returns the atributes of the strider bike
     */
    public Strider(){
        name = "Strider";
        price = 65.99;
        numWheels = 2;
        hasPeddals = false;
        hasTrainingWheels = false;

    }
}
