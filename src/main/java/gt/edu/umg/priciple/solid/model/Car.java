package gt.edu.umg.priciple.solid.model;

public class Car {

    private final SeatingStandard seatingStandard;
    private final Tire tire;
    public Car(){
        seatingStandard = new SeatingStandard();
        tire = new Tire();
    }
    public String carVehicle(){
        return "Su vehículo esta conformado con estas partes: <br>"+seatingStandard.getName()+"<br>"+tire.getName();
    }
}
