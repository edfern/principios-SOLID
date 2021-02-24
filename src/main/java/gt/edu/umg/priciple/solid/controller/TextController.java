package gt.edu.umg.priciple.solid.controller;

import gt.edu.umg.priciple.solid.model.service.*;
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
        TextFormatService factory = new TextFormatService();
        return factory.getFormat(new TextJson(),text);
    }
    @GetMapping("/html")
    public String getFileHtml(@RequestParam String text){
        TextFormatService factory = new TextFormatService();
        return factory.getFormat(new TextHtml(),text);
    }
    @GetMapping("/csv")
    public String getFileCsv(@RequestParam String text){
        TextFormatService factory = new TextFormatService();
        return factory.getFormat(new TextCsv(),text);
    }
    @GetMapping("/txt")
    public String getFileTxt(@RequestParam String text){
        TextFormatService factory = new TextFormatService();
        return factory.getFormat(new TextTxt(),text);
    }

}