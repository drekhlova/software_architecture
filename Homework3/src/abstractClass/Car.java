package abstractClass;

public abstract class Car {
    protected  String  brand;
    protected String model;
    protected String color;
    protected String bodyType;
    protected Integer countOfWheels;
    protected String fuelType;
    protected String transmissionType;
    protected Float engineCapacity;
    public Car(String model){
        this.model=model;
    }
    public abstract String movement();
    public abstract String service();
    public abstract String gearShifting();
    public abstract String toggleTheHeadlights();
    public abstract String toggleTheWipers();
    public abstract String sweeping();
}