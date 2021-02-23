package gt.edu.umg.priciple.solid.controller;
import gt.edu.umg.priciple.solid.model.dto.GenericObject;
import gt.edu.umg.priciple.solid.model.service.ExportFileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExportController {

    public ExportController() {
    }

    /**
     * Controlador para generar la expotacion del archivo
     * a difentes formatos.
     */

    @GetMapping("/json")
    public GenericObject getFileJson() {
        return new ExportFileService().exportJson();
    }
    @GetMapping("/html")
    public GenericObject getFileHtml() {
        return new ExportFileService().exportHtml();
    }
    @GetMapping("/csv")
    public GenericObject getFileCsv() {
        return new ExportFileService().exportCsv();
    }

}