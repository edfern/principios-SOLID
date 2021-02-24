package gt.edu.umg.priciple.solid.model.service;

public interface ITextService {
    /**
     * @param text texto plano que sera modificado
     * @return texto ya modificado ya sea CSV, HTML O JSON
     */
    String printText(String text);

}