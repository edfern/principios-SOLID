package gt.edu.umg.priciple.solid.controller;

import gt.edu.umg.priciple.solid.model.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentsController {

    /**
     * Este Controlador realiza los pagos en linea por una persona mayor
     */

    public PaymentsController() {
    }
    @GetMapping("/toPay")
    public String getFileJson() {
        AdultEntity adult = new AdultEntity("Jhon W.","Smith Smith","78555478-***","75554-5");
        KidEntity kid = new KidEntity("DeveloperJr","FullStack",adult);
        return kid.toPay();
    }

}