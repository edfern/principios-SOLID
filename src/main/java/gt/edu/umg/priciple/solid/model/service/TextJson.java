package gt.edu.umg.priciple.solid.model.service;


public class TextJson implements ITextService {

    public TextJson() {
    }

    /**
     * @param text texto plano que sera modificado
     * @return texto en formato JSON
     */
    public String printText(String text) {
        String json = "{\"text\":\""+text+"\",\"size\":\"5.0MB\"}";
        return json;
    }

}