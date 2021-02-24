package gt.edu.umg.priciple.solid.controller;

import gt.edu.umg.priciple.solid.model.service.FactoryTextService;
import gt.edu.umg.priciple.solid.model.service.TextCsv;
import gt.edu.umg.priciple.solid.model.service.TextHtml;
import gt.edu.umg.priciple.solid.model.service.TextJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextController {

    /**
     * Controlador que se encarga de mostrar el texto ingresado por el usuario
     * en los diferentes formatos JSON, HTML Y CSV.
     */

    public TextController() {
    }
    @GetMapping("/json")
    public String getFileJson(@RequestParam String text) {
        FactoryTextService factory = new FactoryTextService();
        return factory.getText(new TextJson(),text);
    }
    @GetMapping("/html")
    public String getFileHtml(@RequestParam String text){
        FactoryTextService factory = new FactoryTextService();
        return factory.getText(new TextHtml(),text);
    }
    @GetMapping("/csv")
    public String getFileCsv(@RequestParam String text){
        FactoryTextService factory = new FactoryTextService();
        return factory.getText(new TextCsv(),text);
    }

}