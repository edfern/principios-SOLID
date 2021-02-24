package gt.edu.umg.priciple.solid.model.service;

import java.security.InvalidParameterException;

public class TextFormatService {

    /**
     * Clase que tiene como obligación utilizar el método que la interfaz
     * ITextService posee para la creación del formato que el usuario quiera.
     */
    public TextFormatService() {
    }

    public String getFormat(ITextService iTextService,String text) {
        if(iTextService == null){
            throw new InvalidParameterException("Wrong option");
        }
        return iTextService.printText(text);
    }

}