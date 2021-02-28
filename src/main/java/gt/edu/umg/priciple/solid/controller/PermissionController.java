package gt.edu.umg.priciple.solid.controller;

import gt.edu.umg.priciple.solid.model.AdminApp;
import gt.edu.umg.priciple.solid.model.TechnicalApp;
import gt.edu.umg.priciple.solid.model.UserApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PermissionController {

    /**
     * Este Controlador muestra que permisos tiene cada usuario de
     * la aplicación
     */

    public PermissionController() {
    }
    @GetMapping("/permission")
    public String getFileJson(@RequestParam String type) {
        UserApp user = new UserApp("Adam","Smith","785555");
        AdminApp admin = new AdminApp("DeveloperJr","FullStack","56889898","example@gmail.com");
        TechnicalApp technical = new TechnicalApp("Strange","Bolton","78445458","example@gmail.com");
        return switch (type) {
            case "user" -> "Estos son sus permisos: " + "[" + user.writePermission() + "-" + user.readPermission() + "-" + user.deletionPermission() + "]";
            case "admin" -> "Estos son sus permisos: " + "[" + admin.writePermission() + "-" + admin.readPermission() + "-" + admin.deletionPermission() + "]";
            case "technical" -> "Estos son sus permisos: " + "[" + technical.writePermission() + "-" + technical.readPermission() + "-" + technical.deletionPermission() + "]";
            default -> "error";
        };
    }

}