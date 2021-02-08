package FactoryDesignPattern;
/**
 * Takes the type and creates a new bike with the type name and orders the bike
 * @author Michael Sana
 */
public class BikeStore {

    /**
     * orders the bike from the bike factory
     * @param type
     * @return the bike
     */
    public Bike orderBike(String type){
        Bike bike = null;
        
        if(type.equals("tricycle")){
            bike = new Tricycle();
        }
        else if(type.equals("strider")){
            bike = new Strider();
        }
        else if(type.equals("kidsBike")){
            bike = new KidsBike();
        }
        return bike;
    }

    /**
     * Creates the bike
     * @param type
     * @return the created bike
     */
    private Bike createBike(String type) {
    
    }
}
