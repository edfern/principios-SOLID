package gt.edu.umg.priciple.solid.model.service;

import java.security.InvalidParameterException;

public class FactoryTextService {

    /**
     * Clase que implementa el patron de diseño Factory
     * que se encarga de buscar la clase que implementa ITextSercive para
     * luego crear el texto en su formato correspondiente.
     */
    public FactoryTextService() {
    }

    public String getText(ITextService whatText,String text) {
        if(whatText instanceof TextJson){
            TextJson json = (TextJson) whatText;
            return json.printText(text);
        }else if(whatText instanceof TextHtml){
            TextHtml html = (TextHtml) whatText;
            return html.printText(text);
        }else if(whatText instanceof TextCsv){
            TextCsv csv = (TextCsv) whatText;
            return csv.printText(text);
        }else{
            throw new InvalidParameterException("Wrong option");
        }
    }

}