package gt.edu.umg.priciple.solid.model;

public class Car {

    private final ISeating iSeating;
    private final ITire tire;
    public Car(ISeating iSeating, ITire iTire){
        this.iSeating = iSeating;
        this.tire = iTire;
    }
    //Crea el automóvil y muestra sus partes.
    public String carVehicle(){
        return "Su vehículo esta conformado con estas partes: <br>"+iSeating.getName()+"<br>"+tire.getName();
    }
}
