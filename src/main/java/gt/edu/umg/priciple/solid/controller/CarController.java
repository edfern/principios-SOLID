package gt.edu.umg.priciple.solid.controller;

import gt.edu.umg.priciple.solid.model.Car;
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
    public String getFileJson() {
        Car car = new Car();
        return car.carVehicle();
    }

}