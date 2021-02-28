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
        KidEntity kid = new KidEntity("DeveloperJr","FullStack");
        return kid.toPay();
    }

}