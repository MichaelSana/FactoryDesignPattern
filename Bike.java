package FactoryDesignPattern;
public abstract class Bike{
    protected String name;
    protected Double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;

    public void createBike(){
        createFrame();
        addPedals();
        addWheels();
        getPrice();
    }

    private void createFrame(){
        System.out.println("Assembling " + name + "frame");
    }

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

    private void addPedals(){
        if(hasPeddals){
            System.out.println("Adding pedals");
        }
    }

    public double getPrice(){
        return price;
    }

}