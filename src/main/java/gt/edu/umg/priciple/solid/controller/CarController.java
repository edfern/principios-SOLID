package gt.edu.umg.priciple.solid.controller;

import gt.edu.umg.priciple.solid.model.Car;
import gt.edu.umg.priciple.solid.model.SeatingPremiun;
import gt.edu.umg.priciple.solid.model.SeatingStandard;
import gt.edu.umg.priciple.solid.model.Tire;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    /**
     * Muestra las partes de un automóvil
     */

    public CarController() {
    }
    @GetMapping("/carVehicle")
    public String getFileJson(@RequestParam String type) {
        if(type.equals("1")){
            Car car = new Car(new SeatingStandard(), new Tire());
            return car.carVehicle();
        }else if(type.equals("2")){
            Car car = new Car(new SeatingPremiun(),new Tire());
            return car.carVehicle();
        }else{
            return "error";
        }
    }

}