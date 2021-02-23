package gt.edu.umg.priciple.solid.controller;
import gt.edu.umg.priciple.solid.model.dto.GenericObject;
import gt.edu.umg.priciple.solid.model.service.ExportCsv;
import gt.edu.umg.priciple.solid.model.service.ExportHtml;
import gt.edu.umg.priciple.solid.model.service.ExportJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExportController {

    public ExportController() {
    }

    /**
     * Controlador para generar la exportación del archivo
     * a difentes formatos.
     */

    @GetMapping("/json")
    public GenericObject getFileJson() {
        return new ExportJson().buildFile();
    }
    @GetMapping("/html")
    public GenericObject getFileHtml() {
        return new ExportHtml().buildFile();
    }
    @GetMapping("/csv")
    public GenericObject getFileCsv() {
        return new ExportCsv().buildFile();
    }

}