package FactoryDesignPattern;
/**
 * Takes the type and creates a new bike with the type name and orders the bike
 * @author Michael Sana
 */
public class BikeStore {
    public Bike orderBike(String type){
        Bike bike = createBike(type);
        return bike;
    }
    private Bike createBike(String type){
        Bike bike = null;
        
        if(type.equals("tricycle")){
            bike = new Tricycle();
        }
        else if(type.equals("strider")){
            bike = new Strider();
        }
        else if(type.equals("kids bike")){
            bike = new KidsBike();
        }
        return bike;
    }
}
