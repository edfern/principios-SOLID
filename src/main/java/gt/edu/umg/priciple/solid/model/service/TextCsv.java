package gt.edu.umg.priciple.solid.model.service;


import java.util.ArrayList;
import java.util.Arrays;

public class TextCsv implements ITextService {


    public TextCsv() {
    }

    /**
     * @param text texto plano que sera modificado
     * @return texto en formato csv.
     */
    public String printText(String text) {
        return text.replace(" ",",");
    }

}