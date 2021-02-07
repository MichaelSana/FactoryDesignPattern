package FactoryDesignPattern;
/**
 * Am abstract class which is the bike
 * @author Michael Sana
 */
public abstract class Bike{
    protected String name;
    protected Double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;

    /**
     * calls of the pieces of the bike to have a fully created bike
     */
    public void createBike(){
        createFrame();
        addPedals();
        addWheels();
        getPrice();
    }

    /**
     * calls the name of the bike and makes a string representation of the bike being assembled
     */
    private void createFrame(){
        System.out.println("Assembling " + name + "frame");
    }

/**
 * makes a string representation of the amount of wheels and if applicable training wheels
 */
    private void addWheels(){
        if (numWheels > 0){
            System.out.println("Adding " + numWheels + "wheels")
        }

        else{
            return;
        }

        if(hasTrainingWheels){
            System.out.println("Adding Training Wheels");
        }
    }

    /**
     * gives a string representation of the pedals being added
     */
    private void addPedals(){
        if(hasPeddals){
            System.out.println("Adding pedals");
        }
    }

    /**
     * Gives the price of the bike
     * @return price of the bike
     */
    public double getPrice(){
        return price;
    }

}